package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.constants.EstadoLibro;

public class Libro {
    private String titulo;
    private String autor;
    private EstadoLibro estado;
    private String isbn;
    public Libro(){}
    public Libro(String titulo, String autor, EstadoLibro estado, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.isbn = isbn;
    }
    public String getTitulo () {return titulo;}
    public void setTitulo (String titulo) {this.titulo = titulo;}
    public String getAutor () {return autor;}
    public void setAutor (String autor) {this.autor = autor;}
    public EstadoLibro getEstado () {return estado;}
    public void setEstado (EstadoLibro estado) {this.estado = estado;}
    public String getIsbn () {return isbn;}
    public void setIsbn (String isbn) {this.isbn = isbn;}
}
