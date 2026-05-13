package com.example.atividade_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "tab_aluno")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    @Email(message = "O e-mail deve ser válido.")
    private String email;

    @Column(nullable = false,unique = true)
    private String matricula;

    @Column(nullable = false)
    private String senha;

    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, String email, String matricula, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public @Email(message = "O e-mail deve ser válido.") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "O e-mail deve ser válido.") String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
