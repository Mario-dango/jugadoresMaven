package egg.modelos;

public class Jugador {

    private String nombreJugador;
    private Equipo equipoDelJugador;

    public Jugador(){
        this("", null);
    }

    public Jugador(String nombre, Equipo equipo){
        this.nombreJugador = nombre;
        this.equipoDelJugador = equipo;
    }

    public String getNombre(){
        return this.nombreJugador;
    }
    
    public Equipo getEquipo(){
        return this.equipoDelJugador;
    }

    public void setEquipo(Equipo nuevoEquipo) {
        this.equipoDelJugador = nuevoEquipo;
    }

    public void setNombre(String nuevoNombre) {
        this.nombreJugador = nuevoNombre;
    }

}