package pe.edu.galaxy.training.java.ms.ms.gestion.productos.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface GenericRest<T> {

    @GetMapping
    public ResponseEntity<T> findLike();
}
