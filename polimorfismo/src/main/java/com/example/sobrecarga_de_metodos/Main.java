package com.example.sobrecarga_de_metodos;

public class Main {
    public static void main(String[] args) {
    Calculadora calc = new Calculadora();


        System.out.println(calc.calcular(1,1));
        System.out.println(calc.calcular(2.0,6.1));
        System.out.println(calc.calcular("Vi","ram?"));
    }
}
