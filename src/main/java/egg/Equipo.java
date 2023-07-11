package egg;

public class Equipo {

    private String nombreDelEquipo;

    public Equipo(){}
    
    public Equipo(String nombre){
        this.nombreDelEquipo = nombre;
    }

    public String getNombre (){
        return this.nombreDelEquipo;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombreDelEquipo = nuevoNombre;
    }

}
