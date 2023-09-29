package io.ruben.databaseconnection.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.ruben.databaseconnection.model.Libro;
import io.ruben.databaseconnection.repository.LibrosRepository;

@Service
public class LibrosServiceImpl implements LibrosService {
    @Autowired
    LibrosRepository repository;

    public List<Libro> libros(){
        return repository.findAll();
    }

    @Override
    public Libro buscarLibro(int isbn){
        Optional<Libro> libro = repository.findById(isbn);
        return libro.isPresent() ? libro.get() : null;
    }

    @Override
    public void altaLibro(Libro libro){
        repository.save(libro);
    }

    @Override
    public void actualizarLibro(Libro libro){
        repository.save(libro);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn){
        repository.deleteById(isbn);
        return repository.findAll();
    }
}
