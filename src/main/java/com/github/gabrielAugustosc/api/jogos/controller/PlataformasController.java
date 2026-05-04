package com.github.gabrielAugustosc.api.jogos.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.github.gabrielAugustosc.api.jogos.models.Plataforma;
import com.github.gabrielAugustosc.api.jogos.repository.PlataformaRepository;

@RequestMapping("/plataformas")
@RestController
public class PlataformasController {
    @Autowired
    private PlataformaRepository repository;

    @PostMapping
    public ResponseEntity<Plataforma> create(@RequestBody Plataforma plataforma) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(plataforma));
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Plataforma> findById(@PathVariable Long id){
        return repository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
        
    }

    @GetMapping
    public ResponseEntity<List<Plataforma>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plataforma> update(@PathVariable Long id, @RequestBody Plataforma plataforma){
        Optional<Plataforma> optPlataforma = repository.findById(id);

        if (optPlataforma.isPresent()) {
            plataforma.setId(id);
            Plataforma plataformaAlterada = repository.save(plataforma);
            return ResponseEntity.ok(plataformaAlterada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
      @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }    
}
