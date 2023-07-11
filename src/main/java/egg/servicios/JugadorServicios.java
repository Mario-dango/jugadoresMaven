package egg.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import egg.modelos.Equipo;
import egg.modelos.Jugador;

public class JugadorServicios {

    private List<Jugador> listaJugadores = new ArrayList<Jugador>();
    private List<Equipo> listaEquipos = new ArrayList<Equipo>();
    private Scanner scannerDelJugador = new Scanner(System.in);
    
    public Jugador crearJugador(){
        String nombreString;
        System.out.println("Introducir nombre del jugador");
        nombreString = scannerDelJugador.nextLine();
        System.out.println("Seleccione el Equipo de la lista de equipos");
        Jugador nuevoJugador;
        if (!listaEquipos.isEmpty()){
            for (int i = 0; i < listaEquipos.size(); i++) {
                System.out.println("(" + i + ") " + listaEquipos.get(i).getNombre());
            }
            int equipoSeleccionado = scannerDelJugador.nextInt();                
            nuevoJugador = new Jugador(nombreString, listaEquipos.get(equipoSeleccionado));
        } else {
            nuevoJugador = new Jugador(nombreString, null);
        }
        listaJugadores.add(nuevoJugador);

        return nuevoJugador;
    }
    
    public void asignarJugadorConEquipo() {
        // jugador  -> Equipo
        System.out.println("Los jugadores con equipo son:");
        for (int i = 0; i < listaJugadores.size(); i++) {
            String casoDeEquipoNulo;
            if (listaJugadores.get(i).getEquipo() == null){
                casoDeEquipoNulo = "null";
            } else{
                casoDeEquipoNulo = listaJugadores.get(i).getEquipo().getNombre();
            }
            System.out.println(
                "(" + i + ") " + 
                "Nombre del jugador: " +
                listaJugadores.get(i).getNombre() +
                " | Con el equipo: " + 
                casoDeEquipoNulo
            );
        }
        System.out.println("Eliga al jugador al cual desea asignar el equipo");
        int opcionJugador = scannerDelJugador.nextInt();
        System.out.println("Los siguientes equipos son: ");
        for (int i = 0; i < listaEquipos.size(); i++) {
            System.out.println(
                "(" + i + ") " + 
                "Nombre del equipo: " +
                listaEquipos.get(i).getNombre()               
            );
        }
        System.out.println("Eliga el equipo correspondiente");
        int opcionEquipo = scannerDelJugador.nextInt();

        listaJugadores.get(opcionJugador).setEquipo(listaEquipos.get(opcionEquipo));
    }


}
