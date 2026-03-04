package com.example.revisao;

public class Main {
public static void main(String[] args) {
    //INSTÂNCIANDO A CLASSE
    Professor professor1 = new Professor("Carlos", "TI");
    Professor professor2 = new Professor("João", "Dados");

    System.out.println("Nome: " + professor1.getNome());
    System.out.println("Disciplina: " + professor1.getDisciplina());
    System.out.println("Nome: " + professor2.getNome());
    System.out.println("Disciplina: " + professor2.getDisciplina());
    
}
}
