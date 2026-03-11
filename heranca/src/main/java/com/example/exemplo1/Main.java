package com.example.exemplo1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guga", 20, "03/11/2025", "Cartão de Crédito");
        Funcionario funcionario1 = new Funcionario("Gobila",30, "02/08/2022", "Recruta", 1.100);

        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());

    }




}
