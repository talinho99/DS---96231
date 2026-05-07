package com.example.api_jogo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class JogadorRequestDTO {
    @NotBlank(message = "O nome é Obrigatório.")
    @Size(min = 7,max = 12, message = "O nome deve ter entre 7 e 12 caracteres.")
    private String nome;


    @NotBlank(message = "O email é Obrigatório.")
    @Email(message = "Escreve um e-mail válido.")
    private String email;


    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 6,max = 12,message = "A senha deve ter entre 6 a 12 caracteres.")
    private String senha;


    @NotBlank(message = "O telefone é Obrigatório.")
    private String telefone;

    private Long id;

    public JogadorRequestDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JogadorRequestDTO() {
    }

    public JogadorRequestDTO(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome é Obrigatório.") @Size(min = 7, max = 12, message = "O nome deve ter entre 7 e 12 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é Obrigatório.") @Size(min = 7, max = 12, message = "O nome deve ter entre 7 e 12 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é Obrigatório.") @Email(message = "Escreve um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é Obrigatório.") @Email(message = "Escreve um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 12, message = "A senha deve ter entre 6 a 12 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 6, max = 12, message = "A senha deve ter entre 6 a 12 caracteres.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "O telefone é Obrigatório.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O telefone é Obrigatório.") String telefone) {
        this.telefone = telefone;
    }
}
