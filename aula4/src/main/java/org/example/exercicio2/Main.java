package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {
        String aluno = "italo";
        double nota1 = 6;
        double nota2 = 7;
        double media = (nota1+nota2)/2;

        if (media>=7){
            System.out.println("Aluno:" + aluno + "sua média foi: "+ media + "Você está APROVADO!");

        } else{
            System.out.println("Aluno:" + aluno + "sua média foi: "+ media + "Você está reprovado!");
        }




    }
}
