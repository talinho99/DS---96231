package com.example.api_jogo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagem")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
