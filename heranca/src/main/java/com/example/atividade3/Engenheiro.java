package com.example.atividade3;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro(String nome, String email, float salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro [nome=" + nome + ", crea=" + crea + ", email=" + email + ", salario=" + salario
                + ", endereco=" + endereco + ", getCrea()=" + getCrea() + ", getNome()=" + getNome() + ", getEmail()="
                + getEmail() + ", getSalario()=" + getSalario() + ", getEndereco()=" + getEndereco() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    

    

    

}
