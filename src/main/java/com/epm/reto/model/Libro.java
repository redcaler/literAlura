package com.epm.reto.model;

import java.util.List;
import java.util.stream.Collectors;

public class Libro {
    private Integer id;
    private String titulo;
    private List<Autor> autores;
    private List<String> idioma;
    private Boolean copyright;
    private Integer totalDescargas;

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();

        List<DatosAutor> dataAutores = datosLibro.autores();
        this.autores = dataAutores.stream()
                .map(Autor::new)
                .collect(Collectors.toList());
        this.idioma = datosLibro.idioma();
        this.copyright = datosLibro.copyright();
        this.totalDescargas = datosLibro.totalDescargas();
    }

    public Libro() {}

    @Override
    public String toString() {
        return  "---- Libro ----" + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autores: " + autores + '\n' +
                "Idioma: " + idioma.get(0) + '\n' +
                "Copyright: " + copyright + '\n' +
                "Total de descargas: " + totalDescargas + '\n' +
                "---------------" + '\n';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }

    public Integer getTotalDescargas() {
        return totalDescargas;
    }

    public void setTotalDescargas(Integer totalDescargas) {
        this.totalDescargas = totalDescargas;
    }
}
