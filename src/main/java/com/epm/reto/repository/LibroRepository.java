package com.epm.reto.repository;

import com.epm.reto.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    Libro findByTituloIgnoreCase(String titulo);

    @Query("SELECT l FROM Libro l")
    Optional<List<Libro>> findAllLibros();

    // Idiomas disponibles
    @Query("SELECT DISTINCT l.idioma FROM Libro l")
    Optional<List<String>> getIdiomaLibros();
    // Obtener libros por idioma
//    @Query("SELECT l FROM Libro l WHERE l.idioma = :idiomaSelect")
//    Optional<Libro> findByIdioma(String idiomaSelect);
    Optional<List<Libro>> findByIdiomaIgnoreCase(String idioma);
}
