package io.ruben.consume.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ejemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int isbn;
    private String nombre;
    private int duracion;
    private int precio;

    public Ejemplar() {

    }

    public Ejemplar(int isbn, String nombre, int duracion, int precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
