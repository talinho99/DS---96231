package com.example.atividade2;

public class Main {
    public static void main(String[] args) {

        Fisica fisica1 = new Fisica("Joana", "7198564", "0665641", "0846321", "02/08/1989");
        Juridica juridica1 = new Juridica("João", "7448458", "120846", "10507");

        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
