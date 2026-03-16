package com.github.gabrielAugustosc.api.jogos.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/plataformas")
@RestController
public class PlataformasController {
    @GetMapping
    public String plataformas(){
        return "Plataformas suportadas: Playstation 5, Xbox Series S, Nintendo Switch e Pc";
    }
    
}
