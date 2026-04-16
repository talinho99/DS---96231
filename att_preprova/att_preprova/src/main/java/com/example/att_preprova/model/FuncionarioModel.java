package com.example.att_preprova.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionarios")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private double salario;
    private String email;

    @Enumerated (EnumType.STRING)
    private Setor setor;
    @Enumerated (EnumType.STRING)
    private Sexo sexo;

    public FuncionarioModel() {
    }

    public FuncionarioModel(Long id, String nome, int idade, double salario, String email, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.email = email;
        this.setor = setor;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
