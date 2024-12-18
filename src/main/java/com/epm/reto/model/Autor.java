package com.epm.reto.model;

public class Autor {
    private String nombre;
    private Integer nacimiento;
    private Integer muerte;

    public  Autor(DatosAutor datosAutor){
        this.nombre = datosAutor.nombre();
        this.nacimiento = datosAutor.nacimiento();
        this.muerte = datosAutor.muerte();
    }

    public Autor() {}

    @Override
    public String toString() {
        return "[ Autor: '" + nombre + '\'' +
                nacimiento + " - " + muerte + " ]";
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
