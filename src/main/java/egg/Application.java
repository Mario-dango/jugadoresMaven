package egg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static Scanner myScanner = new Scanner(System.in);
    private static List<Equipo> listaEquipos = new ArrayList<Equipo>();
    private static List<Jugador> listaJugadores = new ArrayList<Jugador>();

    public static void main(String[] args) {
        while(menu());
    }

    public static boolean menu(){
        System.out.println("<-----MENU------>");
        System.out.println("(1) Crear Jugador");
        System.out.println("(2) Crear Equipo");
        System.out.println("(3) Asignar jugador a equipo");
        /*
         * Agregar el resto
         */
        System.out.println("(0) Salir");

        int opcion = myScanner.nextInt();

        switch (opcion) {
            case 1:
                crearJugador();
                break;
            case 2:
                crearEquipo();
                break;
            case 3:
                asignarJugadorConEquipo();
                break;
            case 0:
                return false;        
            default:
                return false;
        }
        return true;
    }

    private static void asignarJugadorConEquipo() {
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
                "| Con el equipo: " + 
                casoDeEquipoNulo
            );
        }
        System.out.println("Eliga al jugador al cual desea asignar el equipo");
        int opcionJugador = myScanner.nextInt();
        System.out.println("Los siguientes equipos son: ");
        for (int i = 0; i < listaEquipos.size(); i++) {
            System.out.println(
                "(" + i + ") " + 
                "Nombre del equipo: " +
                listaEquipos.get(i).getNombre()               
            );
        }
        System.out.println("Eliga el equipo correspondiente");
        int opcionEquipo = myScanner.nextInt();

        listaJugadores.get(opcionJugador).setEquipo(listaEquipos.get(opcionEquipo));
    }

    public static void crearJugador(){
        myScanner.nextLine();
        String nombreString;
        System.out.println("Introducir nombre del jugar");
        nombreString = myScanner.nextLine();
        System.out.println("Seleccione el Equipo de la lista de equipos");
        Jugador nuevoJugador;
        if (!listaEquipos.isEmpty()){
            for (int i = 0; i < listaEquipos.size(); i++) {
                System.out.println("(" + i + ") " + listaEquipos.get(i).getNombre());
            }
            int equipoSeleccionado = myScanner.nextInt();                
            nuevoJugador = new Jugador(nombreString, listaEquipos.get(equipoSeleccionado));
        } else {
            nuevoJugador = new Jugador(nombreString, null);
        }
        listaJugadores.add(nuevoJugador);
    }

    public static void crearEquipo(){
        myScanner.nextLine();
        System.out.println("Ingrese nombre del Equipo a crear:");
        String equipoString = myScanner.nextLine();
        Equipo nuevoEquipo = new Equipo(equipoString);
        listaEquipos.add(nuevoEquipo);
    }
}
