package egg;

import egg.servicios.MenuServicios;

public class Application {

    public static void main(String[] args) {
        MenuServicios miMenuDeServicio = new MenuServicios();
        miMenuDeServicio.generarMenu();
    }

}
