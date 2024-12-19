package com.epm.reto.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String titulo;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    private Set<Autor> autores = new HashSet<>();
    private String idioma;
    private Boolean copyright;
    private Integer totalDescargas;

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();

        Set<DatosAutor> dataAutores = datosLibro.autores();
        this.autores = dataAutores.stream()
                .map(Autor::new)
                .collect(Collectors.toSet());
        this.idioma = datosLibro.idioma().get(0); // el primer idioma
        this.copyright = datosLibro.copyright();
        this.totalDescargas = datosLibro.totalDescargas();
    }

    public Libro() {}

    @Override
    public String toString() {
        return  "---- Libro ----" + '\n' +
                "Titulo: " + titulo + '\n' +
                "Autores: " + autores + '\n' +
                "Idioma: " + idioma + '\n' +
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

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
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
