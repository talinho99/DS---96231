package org.example.exercicio3;

import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = ler.nextInt();

        while (idade<18){
            System.out.println("Acesso Negado!");
            System.out.println("Digite sua Idade: ");
            idade = ler.nextInt();
        }
        System.out.println("Acesso permitido.");
        System.out.println("carregando...");


    }
}
