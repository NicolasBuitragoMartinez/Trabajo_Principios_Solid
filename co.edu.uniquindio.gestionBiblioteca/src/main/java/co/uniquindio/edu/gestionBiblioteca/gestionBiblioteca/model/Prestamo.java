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

    public Libro getLibro(){return libro;}

    public Miembro getMiembro(){return miembro;}

    public LocalDate getFechaPrestamo(){return fechaPrestamo;}

    public LocalDate getFechaDevolucion(){return fechaDevolucion;}

    public void setLibro(Libro libro){
        this.libro = libro;
    }

    public void setMiembro(Miembro miembro){
        this.miembro = miembro;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }
}
