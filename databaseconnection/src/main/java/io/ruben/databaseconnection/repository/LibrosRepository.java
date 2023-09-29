package io.ruben.databaseconnection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.ruben.databaseconnection.model.Libro;

public interface LibrosRepository extends JpaRepository<Libro, Integer> {

}