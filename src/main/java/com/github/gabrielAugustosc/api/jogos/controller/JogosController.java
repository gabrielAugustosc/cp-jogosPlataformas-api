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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gabrielAugustosc.api.jogos.models.Jogo;
import com.github.gabrielAugustosc.api.jogos.repository.JogoRepository;



@RestController
@RequestMapping("/jogos")
public class JogosController {
    @Autowired
    private JogoRepository repository;
 
    @PostMapping
    public ResponseEntity<Jogo> create(@RequestBody Jogo jogo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(jogo));
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Jogo> findById(@PathVariable Long id) {
        return repository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Jogo>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
     public ResponseEntity<Jogo> update(@PathVariable Long id,
                                       @RequestBody Jogo jogo) {
 
        Optional<Jogo> optJogo = repository.findById(id);
 
        if (optJogo.isPresent()) {
            jogo.setId(id);
            Jogo jogoAlterado = repository.save(jogo);
            return ResponseEntity.ok(jogoAlterado);
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