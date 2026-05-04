package com.github.gabrielAugustosc.api.jogos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jogos")
public class Jogo {
    @Id
    private Long id;
 
    @Column(name = "titulo", nullable = true)
    private String titulo;
 
    @Column(name = "genero", nullable = false)
    private String genero;
 
    @Column(name = "ano_lancamento", nullable = false)
    private Integer anoLancamento;
 
    @Column(name = "nota", nullable = false)
    private Double nota;
 
    @Column(name = "disponivel", nullable = false)
    private Boolean disponivel;

     @Column(name = "descricao")
    private String descricao;
 
    public Long getId() {
        return id;
    }
}
