package io.ruben.consume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ruben.consume.model.Ejemplar;
import io.ruben.consume.service.EjemplarService;

@RestController
public class EjemplarController {
    @Autowired
    EjemplarService service;

    @PostMapping(value="/ejemplar/{isbn}/{nombre}/{paginas}/{precio}")
    public List<Ejemplar> altaEjemplar(@PathVariable int isbn, @PathVariable String nombre, @PathVariable int paginas, @PathVariable int precio){
        Ejemplar ejemplar = new Ejemplar(isbn, nombre, paginas, precio);
        return service.nuevoEjemplar(ejemplar);
    }
}
