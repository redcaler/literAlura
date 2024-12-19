package com.epm.reto.repository;

import com.epm.reto.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

    Autor findByNombreIgnoreCase(String nombre);
}
