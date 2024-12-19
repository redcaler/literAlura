package com.epm.reto.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String nombre;
    private Integer nacimiento;
    private Integer muerte;
    @ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL)
    private Set<Libro> libros = new HashSet<>();

    public  Autor(DatosAutor datosAutor){
        this.nombre = datosAutor.nombre();
        this.nacimiento = datosAutor.nacimiento();
        this.muerte = datosAutor.muerte();
    }

    public Autor() {}

    @Override
    public String toString() {
        return "[ Autor: '" + nombre + '\'' + " -> " +
                nacimiento + " a " + muerte + " ]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getMuerte() {
        return muerte;
    }

    public void setMuerte(Integer muerte) {
        this.muerte = muerte;
    }

}
