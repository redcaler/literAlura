package com.epm.reto.Principal;

import com.epm.reto.model.Libro;
import com.epm.reto.service.ConsumoAPI;
import com.epm.reto.service.ConvierteDatos;

import java.util.List;
import java.util.Scanner;

public class Principal {
    // constantes
    private final String URL_BASE = "https://gutendex.com/books/?";
    // variables globales
    private Scanner sc = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    //
    private List<Libro> libros;

    public void menu() {
        var option = -1;
        while (option != 0) {
            var menu = """
                    Elija la opción a través de su número:
                    1- buscar libro por título
                    2- listar Libros registrados
                    3- listar autores registrados
                    4- Listar autores vivos en un determinado año
                    5- Listar Libros por idioma
                    0 - salir
                    """;
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    buscarLibroPorTituloAPI();
                    break;
                case 2:
                    librosRegistrados();
                    break;
                case 3:
                    autoresRegistrados();
                    break;
                case 4:
                    autoresVivosPorAnio();
                    break;
                case 5:
                    librosPorIdioma();
                    break;
                case 0:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción Invalida.");
                    break;
            }
        }
    }


    private void buscarLibroPorTituloAPI() {
        System.out.println(1);
    }

    private void librosRegistrados() {
        System.out.println(2);
    }

    private void autoresRegistrados() {
        System.out.println(3);
    }

    private void autoresVivosPorAnio() {
        System.out.println(4);
    }

    private void librosPorIdioma() {
        System.out.println(5);
    }
}
