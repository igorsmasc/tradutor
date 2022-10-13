package com.letscode.tradutor.controller;

import com.letscode.tradutor.model.Texto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradutorController {

    @PostMapping("/traduzir")
    public String traduzirTexto(@RequestBody Texto texto) {
        if(texto.getIdioma1().equalsIgnoreCase("ptbr") ) {
            if (texto.getIdioma2().equalsIgnoreCase("ingles")) {
                if(texto.getTexto().equalsIgnoreCase("Ola")) {
                    return "Hello";
                } else if(texto.getTexto().equalsIgnoreCase("Obrigado")) {
                    return "Thanks";
                }

            }
        }

        return "Idioma indisponivel";
    }

}
