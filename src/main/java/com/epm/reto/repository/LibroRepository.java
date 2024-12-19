package com.epm.reto.repository;

import com.epm.reto.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

    Libro findByTituloIgnoreCase(String titulo);
}
