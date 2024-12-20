package com.epm.reto.repository;

import com.epm.reto.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

    Autor findByNombreIgnoreCase(String nombre);

    @Query("SELECT a FROM Autor a")
    Optional<List<Autor>> findAllAutores();

    // Autores vivos en un determinado año
    @Query("SELECT a FROM Autor a WHERE a.nacimiento <= :anioObjetivo AND :anioObjetivo < a.muerte ")
    Optional<List<Autor>> findAutoresVivos(Integer anioObjetivo);

}
