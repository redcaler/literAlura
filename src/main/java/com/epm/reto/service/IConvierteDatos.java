package com.epm.reto.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
