package it.unicam.cs.GeoCultura.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IController<T, ID> {

    @PostMapping
    ResponseEntity<?> crea(@RequestBody T entity);

    @GetMapping("/{id}")
    ResponseEntity<?> getById(@PathVariable ID id);

    @GetMapping("/getAll")
    ResponseEntity<?> getAll();

    @PutMapping
    ResponseEntity<?> modifica(@RequestBody T entity);

    @DeleteMapping("/{id}")
    ResponseEntity<?> elimina(@PathVariable ID id);
}
