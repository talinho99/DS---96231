package com.example.revisao.dto;

import com.example.revisao.model.UnidadeFederativa;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EnderecoRequestDTO {
    @NotBlank(message = "O CEP é obrigatório.")
    private String cep;

    @NotBlank(message = "O logradouro é obrigatório.")
    private String logradouro;

    @NotBlank(message = "O número é obrigatório.")
    private String numero;

    @NotBlank(message = "A cidade é obrigatória.")
    private String cidade;

    @NotNull (message = "A UF é obrigatória.")
    private UnidadeFederativa uf;

    public EnderecoRequestDTO() {
    }

    public EnderecoRequestDTO(String cep, String logradouro, String numero, String cidade, UnidadeFederativa uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public @NotBlank(message = "O CEP é obrigatório.") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "O CEP é obrigatório.") String cep) {
        this.cep = cep;
    }

    public @NotBlank(message = "O logradouro é obrigatório.") String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(@NotBlank(message = "O logradouro é obrigatório.") String logradouro) {
        this.logradouro = logradouro;
    }

    public @NotBlank(message = "O número é obrigatório.") String getNumero() {
        return numero;
    }

    public void setNumero(@NotBlank(message = "O número é obrigatório.") String numero) {
        this.numero = numero;
    }

    public @NotBlank(message = "A cidade é obrigatória.") String getCidade() {
        return cidade;
    }

    public void setCidade(@NotBlank(message = "A cidade é obrigatória.") String cidade) {
        this.cidade = cidade;
    }

    public @NotNull(message = "A UF é obrigatória.") UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(@NotNull(message = "A UF é obrigatória.") UnidadeFederativa uf) {
        this.uf = uf;
    }
}
