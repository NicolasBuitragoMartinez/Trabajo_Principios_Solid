package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import java.time.LocalDateTime;

public class Prestamo {
    private Libro libro;
    private Miembro miembro;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;
}
