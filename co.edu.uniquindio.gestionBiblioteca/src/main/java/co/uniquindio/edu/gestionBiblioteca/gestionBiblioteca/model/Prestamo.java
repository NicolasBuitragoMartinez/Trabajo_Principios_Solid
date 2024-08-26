package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Miembro miembro, LocalDate fechaPrestamo, LocalDate fechaDevolucion){
        this.libro = libro;
        this.miembro = miembro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
}
