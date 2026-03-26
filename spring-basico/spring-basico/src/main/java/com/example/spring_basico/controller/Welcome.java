package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controla a classe para criar endpoints.
@RestController
public class Welcome {
//Raiz(Primeiro endpoint é chamado de raiz).
    @GetMapping("/")
    public String mensagem() {
        return "Bem-Vindo!";

    }


    @GetMapping("/dev")
    public String nomeDev() {
        return "Feito por: Ítalo";
    }


}