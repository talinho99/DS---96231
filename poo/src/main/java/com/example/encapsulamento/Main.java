package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
     //ALGORITMO:
    // String nome;
    // int idade;

    // nome = "ítalo";
    // idade = 17;


    //POO - Programação Orientada a Objetos ENCAPSULAMENTO
    // Cliente cliente1 = new Cliente();
    // cliente1.nome= "Italo";
    // cliente1.idade=17;

     // Pet pet1 = new Pet();
    // pet1.nome = "Gobila";
    // pet1.idade = 3;
//  System.out.println("Nome: " + cliente1.nome);
//     System.out.println("Idade: " + cliente1.idade);

//     System.out.println("Nome: " + pet1.nome);
//     System.out.println("Idade: " + pet1.idade);
    

// ENCAPSULAMENTO
    Cliente cliente1 = new Cliente();
    cliente1.setNome("Italo");
    cliente1.setIdade(17);

    
   Pet pet1 = new Pet();
   pet1.setNome("Gobila");
   pet1.setIdade(3);
    
System.out.println("Nome: " + cliente1.getNome());
System.out.println("Nome: " + cliente1.getIdade());

System.out.println("Nome: " + pet1.getNome());
System.out.println("Nome: " + pet1.getIdade());



   Livro livro1 = new Livro();
    livro1.setTitulo("O Senhor dos Anéis");
    livro1.setValor(50.5);

    System.out.println("Título do Livro: " + livro1.getTitulo());
    System.out.println("Valor do Livro: " + livro1.getValor());


    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("João");
    funcionario1.setCargo("Gerente");
    funcionario1.setSalario(5000.20);

    System.out.println("Nome do Funcionário: " + funcionario1.getNome());
    System.out.println("Cargo do Funcionário: " + funcionario1.getCargo());
    System.out.println("Salário do Funcionário: " + funcionario1.getSalario());

    }

}
