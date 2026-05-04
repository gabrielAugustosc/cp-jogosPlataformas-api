package com.github.gabrielAugustosc.api.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gabrielAugustosc.api.jogos.models.Jogo;


@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {
    
}
