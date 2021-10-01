package com.edudev.dockerapi.properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
//
//    @PostMapping
//    @ApiOperation("Insert a product")
//    public ResponseEntity<ProductDTO> insert(final @Valid @RequestBody ProductDTO dto) {
//        final ProductDTO insertedDTO = repository.insert(dto);
//        final URI uri = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(insertedDTO.getId())
//                .toUri();
//
//        return ResponseEntity.created(uri).body(insertedDTO);
//    }
//
//    @PutMapping("/{id}")
//    @ApiOperation("Update a existing product by passing its id and a new product dto")
//    public ResponseEntity<ProductDTO> update(final @PathVariable Long id, final @Valid @RequestBody ProductDTO dto) {
//        var dtoUpdated = repository.update(id, dto);
//        return ResponseEntity.ok().body(dtoUpdated);
//    }
//
//    @DeleteMapping("/{id}")
//    @ApiOperation("Delete a product by id")
//    public ResponseEntity<Void> delete(final @PathVariable Long id) {
//        repository.delete(id);
//        return ResponseEntity.noContent().build();
//    }
}
