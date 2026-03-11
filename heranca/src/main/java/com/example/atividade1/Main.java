package com.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("AMD", "Ryzen 7 7500", "180 hz");
        Memoria memoria1 = new Memoria("Kingston Fury", "DDR4", 1000);
        Placa_mae placa1 = new Placa_mae("TUF", "sdsad", "323RF");
        Capacidade capacidade1 = new Capacidade("AMD","SLA", "1TB", "SATA");
        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placa1.toString());
        System.out.println(capacidade1.toString());


    }
}
