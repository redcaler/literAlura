package com.epm.reto.Principal;

import com.epm.reto.model.DatosJson;
import com.epm.reto.service.ConsumoAPI;
import com.epm.reto.service.ConvierteDatos;

import java.util.Scanner;

public class Utils {
    // constantes
    private final String URL_BASE = "https://gutendex.com/books/?";

    private Scanner sc = new Scanner(System.in);

    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();

    public DatosJson getData(String dataIn){
        var json = consumoAPI.obtenerDatos(URL_BASE + "search=" + dataIn.replace(" ","+"));
        return convierteDatos.obtenerDatos(json,DatosJson.class);
    }
}
