package io.ruben.databaseconnection.service;

import java.util.List;
import io.ruben.databaseconnection.model.Libro;


public interface LibrosService {
    List<Libro> libros();
    Libro buscarLibro(int isbn);
    void altaLibro(Libro libro);
    void actualizarLibro(Libro libro);
    List<Libro> eliminarLibro(int isbn );
}
