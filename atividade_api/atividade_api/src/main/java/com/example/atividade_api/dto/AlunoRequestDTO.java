package com.example.atividade_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlunoRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "Deve ter um e-mail válido")
    private String email;

    @NotBlank(message = "O número de matrícula é obrigatório")
    private String matricula;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 6,max = 12, message = "A senha deve ter entre 6 e 12 caracteres.")
    private String senha;

    public AlunoRequestDTO() {
    }


    public AlunoRequestDTO(String nome, String email, String matricula, String senha) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.senha = senha;
    }

    public @NotBlank(message = "O nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ter um e-mail válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O e-mail é obrigatório.") @Email(message = "Deve ter um e-mail válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O número de matrícula é obrigatório") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "O número de matrícula é obrigatório") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 12, message = "A senha deve ter entre 6 e 12 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 12, message = "A senha deve ter entre 6 e 12 caracteres.") String senha) {
        this.senha = senha;
    }
}
