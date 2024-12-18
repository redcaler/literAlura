package com.epm.reto.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(
//    @JsonAlias("id") Integer id,
    @JsonAlias("title") String titulo,
    @JsonAlias("authors") List<DatosAutor> autores,
    @JsonAlias("languages") List<String> idioma,
    @JsonAlias("copyright") Boolean copyright,
    @JsonAlias("download_count") Integer totalDescargas
) {
}
