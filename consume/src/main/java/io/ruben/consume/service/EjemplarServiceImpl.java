package io.ruben.consume.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.ruben.consume.model.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService {

    @Autowired
    RestTemplate template;

    private String url = "http://localhost:8080/libros";
    @Override
    public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar){
        template.postForLocation(url+ "libro", ejemplar);

        return Arrays.asList(template.getForObject(url+"libros", Ejemplar[].class));
    }
}
