package com.example.atividade3;

public class Funcionario {
    private  int codigofuncionario;
    private  String nome;
    private  String endereco;
    private  int telefone;
    private  String email;
    private  Conta conta;
    public Funcionario(int codigofuncionario, String nome, String endereco, int telefone, String email, Conta conta) {
        this.codigofuncionario = codigofuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.conta = conta;
    }
    public int getCodigofuncionario() {
        return codigofuncionario;
    }
    public void setCodigofuncionario(int codigofuncionario) {
        this.codigofuncionario = codigofuncionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    

}
