package co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.model;

import co.uniquindio.edu.gestionBiblioteca.gestionBiblioteca.constants.EnumEstado;

public class Libro {
    private String titulo;
    private String autor;
    private EnumEstado estado;
    private String isbn;

    public Libro(String titulo, String autor, EnumEstado estado, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.isbn = isbn;
    }

    public String getTitulo () {return titulo;}

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getAutor () {return autor;}

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public EnumEstado getEstado () {return estado;}

    public void setEstado (EnumEstado estado) {
        this.estado = estado;
    }

    public String getIsbn () {return isbn;}

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }
}
