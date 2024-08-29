package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import java.util.List;
import java.util.ArrayList;

public class Miembro {
    private String nombre;
    private String identificacion;
    private List<Prestamo> prestamosActivos;
    public Miembro() {
        this.prestamosActivos = new ArrayList<>();
    }
    public Miembro(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.prestamosActivos = new ArrayList<>();
    }
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public List<Prestamo> getPrestamosActivos() { return prestamosActivos; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public void setPrestamosActivos(List<Prestamo> prestamosActivos) { this.prestamosActivos = prestamosActivos; }
    public void agregarPrestamo(Prestamo prestamo) {prestamosActivos.add(prestamo);}
    public void eliminarPrestamo(Prestamo prestamo) {prestamosActivos.remove(prestamo);}
}
