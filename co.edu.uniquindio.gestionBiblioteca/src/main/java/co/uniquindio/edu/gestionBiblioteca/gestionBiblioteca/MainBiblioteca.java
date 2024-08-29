package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca;

import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.constants.EstadoLibro;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Biblioteca;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Miembro;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Empleado;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Bibliotecario;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Libro;
import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model.Prestamo;

import java.time.LocalDate;
import java.util.HashSet;

public class MainBiblioteca {
    public static void main(String[] args){
        Biblioteca biblioteca = inicializarDatos();
        introduccionNombreBiblioteca(biblioteca);
        verificarPrestamoMiembro(biblioteca);
        verificarPrestamoEmpleado(biblioteca);
        verificarLibrosBiblioteca(biblioteca);
    }

    private static void introduccionNombreBiblioteca(Biblioteca biblioteca) {
        System.out.println("Biblioteca: " + biblioteca.getNombre());
        System.out.println();
    }
    private static void verificarLibrosBiblioteca(Biblioteca biblioteca) {
        System.out.println("Libros de la biblioteca: ");
        for (Libro libro : biblioteca.getListaLibro()){
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Estado: " + libro.getEstado());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println();
        }
    }
    private static void verificarPrestamoEmpleado(Biblioteca biblioteca) {
        System.out.println("Empleados: ");
        for (Empleado empleado : biblioteca.getListaEmpleado()) {
            if (empleado instanceof Bibliotecario) {
                Bibliotecario bibliotecario = (Bibliotecario) empleado;
                System.out.println("Bibliotecario");
                System.out.println("Nombre: " + bibliotecario.getNombre());
                System.out.println("Identificación: " + bibliotecario.getIdentificacion());
                for (Miembro miembro : biblioteca.getListaMiembro()) {
                    for (Libro libro : biblioteca.getListaLibro()) {
                        if (libro.getEstado() == EstadoLibro.PRESTADO) {
                            Prestamo prestamo = new Prestamo();
                            prestamo.setLibro(libro);
                            prestamo.setMiembro(miembro);
                            prestamo.setFechaPrestamo(LocalDate.now());
                            prestamo.setFechaDevolucion(LocalDate.now().plusDays(14));
                            bibliotecario.gestionarPrestamo(prestamo);
                            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado correctamente.");
                            System.out.println();
                        }
                    }break;
                }
                for (Libro libro : biblioteca.getListaLibro()) {
                    if (libro.getEstado() == EstadoLibro.DISPONIBLE) {
                        System.out.println("El libro '" + libro.getTitulo() + "' se encuentra disponible.");
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }
    }
    private static void verificarPrestamoMiembro(Biblioteca biblioteca) {
        System.out.println("Miembros:");
        for (Miembro miembro : biblioteca.getListaMiembro()){
            System.out.println("Nombre: " + miembro.getNombre());
            System.out.println("Identificación: " + miembro.getIdentificacion());
            System.out.println("Préstamos activos:");
            for (Prestamo prestamo : miembro.getPrestamosActivos()) {
                System.out.println("  Libro: " + prestamo.getLibro().getTitulo());
                System.out.println("  Fecha de Préstamo: " + prestamo.getFechaPrestamo());
                System.out.println("  Fecha de Devolución: " + prestamo.getFechaDevolucion());
            }
            System.out.println();
        }
    }
    public static Biblioteca inicializarDatos() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNombre("CRAI");
        Miembro miembro1 = new Miembro();
        miembro1.setNombre("Nicolas Buitrago");
        miembro1.setIdentificacion("109285");
        Miembro miembro2 = new Miembro();
        miembro2.setNombre("Sofia Osorio");
        miembro2.setIdentificacion("109027");
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.setNombre("Juan Jose");
        bibliotecario.setIdentificacion("1010073");
        Libro libro1 = new Libro();
        libro1.setTitulo("Sistemas Operativos");
        libro1.setAutor("William Stallings");
        libro1.setEstado(EstadoLibro.PRESTADO);
        libro1.setIsbn("1029-1003-1003");
        Libro libro2 = new Libro();
        libro2.setTitulo("Introducción a la teoria general de sistemas");
        libro2.setAutor("Johansen Bertalanffy");
        libro2.setEstado(EstadoLibro.DISPONIBLE);
        libro2.setIsbn("1090-3323-4332");
        Libro libro3 = new Libro();
        libro3.setTitulo("Java para novatos");
        libro3.setAutor("Vozmedia");
        libro3.setEstado(EstadoLibro.DISPONIBLE);
        libro3.setIsbn("1028-3839-5646");
        Libro libro4 = new Libro();
        libro4.setTitulo("Galactus the Devourer");
        libro4.setAutor("Louise Simonson");
        libro4.setEstado(EstadoLibro.PRESTADO);
        libro4.setIsbn("1029-1334-3444");
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setLibro(libro1);
        prestamo1.setMiembro(miembro1);
        prestamo1.setFechaPrestamo(LocalDate.of(2024, 8, 26));
        prestamo1.setFechaDevolucion(LocalDate.of(2024, 10, 4));
        Prestamo prestamo2 = new Prestamo();
        prestamo2.setLibro(libro4);
        prestamo2.setMiembro(miembro2);
        prestamo2.setFechaPrestamo(LocalDate.of(2024, 8, 27));
        prestamo2.setFechaDevolucion(LocalDate.of(2024, 10, 5));
        miembro1.agregarPrestamo(prestamo1);
        miembro2.agregarPrestamo(prestamo2);
        biblioteca.agregarMiembro(miembro1);
        biblioteca.agregarMiembro(miembro2);
        biblioteca.agregarEmpleados(bibliotecario);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.getListaMiembro().add(miembro1);
        biblioteca.getListaMiembro().add(miembro2);
        biblioteca.getListaEmpleado().add(bibliotecario);
        biblioteca.getListaLibro().add(libro1);
        biblioteca.getListaLibro().add(libro2);
        biblioteca.getListaLibro().add(libro3);
        biblioteca.getListaLibro().add(libro4);

        return biblioteca;
    }
}