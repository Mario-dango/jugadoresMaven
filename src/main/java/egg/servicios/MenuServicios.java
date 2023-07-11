package egg.servicios;

import java.util.Scanner;

public class MenuServicios {
    
    private JugadorServicios jugadorServicios;
    private EquipoServicios equipoServicios;
    private Scanner scannerDelMenu = new Scanner(System.in);

    public MenuServicios (){
        this.equipoServicios = new EquipoServicios();
        this.jugadorServicios = new JugadorServicios();
    }

    public void imprimirMenu(){        
        System.out.println("<-----MENU------>");
        System.out.println("(1) Crear Jugador");
        System.out.println("(2) Crear Equipo");
        System.out.println("(3) Asignar jugador a equipo");
        /*
         * Agregar el resto
         */
        System.out.println("(0) Salir");
    }

    public void generarMenu(){        
        boolean continuarEnElMenu = true;
        do {
            imprimirMenu();
            int opcion = scannerDelMenu.nextInt();            
            switch (opcion) {
                case 1 -> crearJugador();
                case 2 -> crearEquipo();
                case 3 -> asignarJugadorConEquipo();
                case 0 -> continuarEnElMenu = false;        
                default -> continuarEnElMenu = false;  
            }
        } while (continuarEnElMenu);
    }

    public void crearJugador(){
        jugadorServicios.crearJugador();
    }

    public void crearEquipo(){
        equipoServicios.crearEquipo();
    }

    public void asignarJugadorConEquipo(){
        jugadorServicios.asignarJugadorConEquipo();
    }

}
