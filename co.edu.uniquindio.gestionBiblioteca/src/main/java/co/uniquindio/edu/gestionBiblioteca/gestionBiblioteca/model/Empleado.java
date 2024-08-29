package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

public abstract class Empleado {
    protected String nombre;
    protected String identificacion;
    public Empleado(){}
    public Empleado(String nombre, String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    public String getNombre () {return nombre;}
    public void setNombre (String nombre) {this.nombre = nombre;}
    public String getIdentificacion () {return identificacion;}
    public void setIdentificacion(String identificacion){this.identificacion = identificacion;}
}