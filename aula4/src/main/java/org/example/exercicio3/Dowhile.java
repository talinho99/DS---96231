package org.example.exercicio3;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        int avaliacao;
        do{
            Scanner ler = new Scanner(System.in);
            System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas: ");
            avaliacao = ler.nextInt();
        } while (avaliacao <1|| avaliacao > 5);
        System.out.println("Obrigado!");
    }

}
