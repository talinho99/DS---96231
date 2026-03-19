package com.example.revisao;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("0666971", "02/02/2024", "05/08/1999", "Joana","205640", 1000.0, Sexo.FEMININO,Bonificacao.GERENTE);
        Diretor diretor = new Diretor("02221", "02/06/2023", "08/09/1880","James", "061611", 4500.0, Sexo.MASCULINO, Bonificacao.DIRETOR);
        Motoboy motoboy = new Motoboy("098412","04/03/2022","0906/2004","Marcos","065161",1600.0, Sexo.MASCULINO,"063216");


        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

        diretor.admitir(motoboy);

    }
}
