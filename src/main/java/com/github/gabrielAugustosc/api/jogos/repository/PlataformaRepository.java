package com.github.gabrielAugustosc.api.jogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gabrielAugustosc.api.jogos.models.Plataforma;

@Repository
public interface PlataformaRepository extends JpaRepository<Plataforma, Long>{

    
}