package com.example.atv1;

public class Main {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();



        System.out.println("Divisão: " + divisao.calcular(30,40));
        System.out.println("Multiplicação: " + multiplicacao.calcular(3, 10));
        System.out.println("Soma: " + soma.calcular(8, 5));
        System.out.println("Subtração: " + subtracao.calcular(588, 456));
    }


}
