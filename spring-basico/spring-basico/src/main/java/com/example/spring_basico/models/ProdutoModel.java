package com.example.spring_basico.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataDeCompra;
    private String dataDeVencimaneto;
    private double preco;

    public ProdutoModel() {
    }

    public ProdutoModel(Long id, String nome, String dataDeCompra, String dataDeVencimaneto, double preco) {
        this.id = id;
        this.nome = nome;
        this.dataDeCompra = dataDeCompra;
        this.dataDeVencimaneto = dataDeVencimaneto;
        this.preco = preco;
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

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getDataDeVencimaneto() {
        return dataDeVencimaneto;
    }

    public void setDataDeVencimaneto(String dataDeVencimaneto) {
        this.dataDeVencimaneto = dataDeVencimaneto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
