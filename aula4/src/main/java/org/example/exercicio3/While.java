package org.example.exercicio3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Os números entre 100 e 150: ");
        for (int valor =100; valor <150; valor++ ){
            if(valor%2==0){
                System.out.println("Valores pares: "+ valor);

            }


        }

    }
}
