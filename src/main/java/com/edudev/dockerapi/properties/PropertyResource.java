package com.edudev.dockerapi.properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/properties")
public final class PropertyResource {

    @Autowired
    private Properties repository;

    @GetMapping("/{id}")
    public ResponseEntity<Property> findById(final @PathVariable Integer id) {
        final var entity = repository.findById(id).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Id not found!"));
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping
    public ResponseEntity<List<Property>> listAll() {
        final var entities = repository.findAll();
        return ResponseEntity.ok().body(entities);
    }

    @PostMapping
    public ResponseEntity<Property> insert(final @RequestBody Property property) {
        final Property insertedProperty = repository.save(property);
        final URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(insertedProperty.getId())
                .toUri();

        return ResponseEntity.created(uri).body(insertedProperty);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Property> update(final @PathVariable Long id, final @RequestBody Property property) {
        var updatedProperty = repository.save(property);
        return ResponseEntity.ok().body(updatedProperty);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(final @PathVariable Integer id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
