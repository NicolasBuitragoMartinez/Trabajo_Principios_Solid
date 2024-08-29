package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private Libro libro;
    private Miembro miembro;
    private Empleado empleado;
    private List<Libro> listaLibro;
    private List<Miembro> listaMiembro;
    private List<Empleado> listaEmpleado;
    public Biblioteca(){
        this.listaLibro = new ArrayList<>();
        this.listaMiembro = new ArrayList<>();
        this.listaEmpleado = new ArrayList<>();}
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.listaLibro = new ArrayList<>();
        this.listaMiembro = new ArrayList<>();
        this.listaEmpleado = new ArrayList<>();
    }
    public String getNombre () {return nombre;}
    public void setNombre (String nombre){
        this.nombre = nombre; 
    }
    public void agregarLibro(Libro libro){this.libro = libro;}
    public void agregarMiembro(Miembro miembro){this.miembro = miembro;}
    public void agregarEmpleados(Empleado empleado){this.empleado = empleado;}
    public List<Libro> getListaLibro(){return listaLibro;}
    public List<Miembro> getListaMiembro(){return listaMiembro;}
    public List<Empleado> getListaEmpleado(){return listaEmpleado;}
    public void setListaLibro(List<Libro> libro){this.listaLibro = listaLibro;}
    public void setListaMiembro(List<Miembro> miembro){this.listaMiembro = listaMiembro;}
    public void setListaEmpleado(List<Empleado> empleado){this.listaEmpleado = listaEmpleado;}
}
