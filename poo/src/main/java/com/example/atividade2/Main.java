package com.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Gobila", "3","vira lata" );
        Cliente cliente1 = new Cliente("Guga", "18", pet1);

        Cliente cliente2 = new Cliente("Mario", "55", new Pet("hulk", "6", "Pastor Alemão"));

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade do Pet: " + cliente1.getPet().getIdade());
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Raça do Pet: " + cliente2.getPet().getRaca());




    }

}
