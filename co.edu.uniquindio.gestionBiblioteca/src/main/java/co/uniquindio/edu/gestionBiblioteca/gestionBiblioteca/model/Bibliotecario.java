package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.services.IGestionInventario;

public class Bibliotecario extends Empleado implements IGestionInventario{

    public Bibliotecario(String nombre, String identificacion){
        super(nombre, identificacion);
    }

    @Override
    public void gestionarItem(){
        System.out.println("Gestionando un ítem de la biblioteca");
    }

    @Override
    public void gestionarTareas(){
        System.out.println("Gestionando tareas de la biblioteca.");
    }
}