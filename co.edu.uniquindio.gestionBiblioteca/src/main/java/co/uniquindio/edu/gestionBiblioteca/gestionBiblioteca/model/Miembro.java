package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import java.util.List;
import java.util.ArrayList;

public class Miembro {
    private String nombre;
    private String identificacion;

    private List<Prestamo> prestamosActivos;

    public Miembro(String nombre, String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;

        this.prestamosActivos = new ArrayList<>();
    }
}
