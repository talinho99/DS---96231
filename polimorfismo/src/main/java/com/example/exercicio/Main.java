package com.example.exercicio;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Marcos", "01/01/2000", Sexo.MASCULINO, Setor.OPERACOES,1000.0, "48653");
        Diretor diretor = new Diretor("Marcela","02/02/2000",Sexo.FEMININO,Setor.RECURSOS_HUMANOS, 2000.0);

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());


        diretor.admitir(motoboy);

        diretor.demitir(motoboy);
    }
}
