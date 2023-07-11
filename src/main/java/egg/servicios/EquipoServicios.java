package egg.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import egg.modelos.Equipo;

public class EquipoServicios {

    private Scanner scannerDelEquipo = new Scanner(System.in);
    private List<Equipo> listaEquipos = new ArrayList<Equipo>();

    public void crearEquipo() {
        System.out.println("Ingrese nombre del Equipo a crear:");
        String equipoString = scannerDelEquipo.nextLine();
        Equipo nuevoEquipo = new Equipo(equipoString);
        listaEquipos.add(nuevoEquipo);
    }
    
    
}
