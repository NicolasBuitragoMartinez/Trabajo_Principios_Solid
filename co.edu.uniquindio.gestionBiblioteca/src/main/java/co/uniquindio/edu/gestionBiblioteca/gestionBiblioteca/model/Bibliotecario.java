package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.constants.EstadoLibro;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.services.IGestionInventario;

public class Bibliotecario extends Empleado implements IGestionInventario{
    public Bibliotecario(){}
    public Bibliotecario(String nombre, String identificacion){
        super(nombre, identificacion);
    }
    @Override
    public void gestionarItem(){
        System.out.println("Gestionando un ítem de la biblioteca");
    }
    public void gestionarPrestamo(Prestamo prestamo) {
        Libro libro = prestamo.getLibro();
        if (libro.getEstado() == EstadoLibro.PRESTADO) {
            libro.setEstado(EstadoLibro.PRESTADO);
            prestamo.getMiembro().agregarPrestamo(prestamo);
            System.out.println("Préstamo realizado con éxito.");
        }
    }
}