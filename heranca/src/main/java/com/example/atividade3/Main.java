package com.example.atividade3;

public class Main {
    public static void main(String[] args) {

        Engenheiro engenheiro1 = new Engenheiro("Ítalo","italoengen@gmail.com" , 2050, new Endereco("Rua A", "259", "Paralela", "20558", "Salvador"),"50536");
        
        System.out.println(engenheiro1.toString());
        
    }

}
