package com.example.api_criptografada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wellcome {
    @GetMapping("/")
    public String bemVindo(){
        return "Seja Bem-Vindo.";
    }

}
