package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Jamile", 32, "719075","jamile123@gmail.com", Sexo.FEMININO,
        new Endereco("Rua A", "30", "do lado da padaria", "5289", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(pessoa1.toString());
    
    
    }

}
