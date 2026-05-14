package com.example.atividade_api.dto;

import com.example.atividade_api.model.AlunoModel;

public class AlunoResponseDTO {
    private String nome;
    private String email;
    private String matricula;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public AlunoResponseDTO(AlunoModel aluno){
        this.nome = aluno.getNome();
        this.email = getEmail();
        this.matricula = getMatricula();

    }
}
