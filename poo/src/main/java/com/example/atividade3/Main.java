package com.example.atividade3;

public class Main {
public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario(147, "James", "Rua joao Fonseca", 7198866, "joao123@gmail.com", new Conta("Bradesco", 18, 15189,"Poupança", 198.5, 5000.00));

    System.out.println("Funcionário: " + funcionario1.getNome());
    System.out.println("Limite Dísponivel: " + funcionario1.getConta().getLimitedisp());


    
}
}
