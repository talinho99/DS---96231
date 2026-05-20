package com.example.revisao.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ClienteRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotNull(message = "Os dados de endereço são obrigatórios.")
    @Valid // Diz ao Spring para validar também as anotações dentro do EnderecoRequestDTO
    private EnderecoRequestDTO endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, EnderecoRequestDTO endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotNull(message = "Os dados de endereço são obrigatórios.") @Valid EnderecoRequestDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull(message = "Os dados de endereço são obrigatórios.") @Valid EnderecoRequestDTO endereco) {
        this.endereco = endereco;
    }
}
