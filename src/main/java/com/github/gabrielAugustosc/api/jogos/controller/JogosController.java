package com.github.gabrielAugustosc.api.jogos.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/jogos")
@RestController
public class JogosController {
    @GetMapping
    public String ListarJogos(){
        return "Jogos no catálago: Stardew Valley, God of War, GTA 6";
    }

    @GetMapping("/destaques")
    public String JogosDestaques(){
        return "Jogo em destaque: GTA6";
    }
}