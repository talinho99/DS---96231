package com.example.atividade1;

public class Main {
public static void main(String[] args) {
    Endereco endereco1 = new Endereco("Rua A", "16","Salvador");
    Cliente cliente1 = new Cliente("Marta",23 , endereco1);

    System.out.println("Nome: " + cliente1.getNome());
    System.out.println("Cidade: " + cliente1.getEndereco().getLogradouro());
}
}
