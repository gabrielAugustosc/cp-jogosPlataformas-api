package com.github.gabrielAugustosc.api.jogos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "plataforma")
public class Plataforma {
    @Id
    private Long id;
 
    @Column(name = "nome", nullable = true)
    private String nome;
 
    @Column(name = "fabricante", nullable = false)
    private String fabricante;
 
    @Column(name = "ano_lancamento", nullable = false)
    private Integer anoLancamento;
 
    @Column(name = "preco", nullable = false)
    private Double preco;
 
    @Column(name = "ativa", nullable = false)
    private Boolean ativa;
    
    @Column(name = "geracao")
    private String geracao;
}
