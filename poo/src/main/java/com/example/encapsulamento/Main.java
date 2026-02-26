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
    Cliente cliente1 = new Cliente("Italo",17);
    
    System.out.println("Nome: " + cliente1.getNome());
    System.out.println("Nome: " + cliente1.getIdade());


   Pet pet1 = new Pet("Gobila", 3, "Vira-lata", "Pequeno", "Ração");
    System.out.println("Nome do Pet: " + pet1.getNome());
    System.out.println("Idade do Pet: " + pet1.getIdade());
    System.out.println("Raça do Pet: " + pet1.getRaca());
    System.out.println("Porte do Pet: " + pet1.getPorte());
    System.out.println("Alimentação do Pet: " + pet1.getAlimentacao());
 
    




   Livro livro1 = new Livro("Harry Potter", "James", 200, 290.70);
   System.out.println("\nTítulo: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor() + "\nPáginas: " + livro1.getPaginas() + "Preço: " + livro1.getPreco());

   Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 250, 450.00);
   System.out.println("Título do Livro: " + livro2.getTitulo() + "Autor: " + livro2.getAutor() + "Páginas: "+ livro2.getPaginas() + "Preço: "+ livro2.getPreco());
 
   

    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("João");
    funcionario1.setCargo("Gerente");
    funcionario1.setSalario(5000.20);

    System.out.println("Nome do Funcionário: " + funcionario1.getNome());
    System.out.println("Cargo do Funcionário: " + funcionario1.getCargo());
    System.out.println("Salário do Funcionário: " + funcionario1.getSalario());

    


    Aluno aluno1 = new Aluno("João", "joao123@gmail.com");
    System.out.println("Nome do Aluno: " + aluno1.getNome());
    System.out.println("Nome do Email: " + aluno1.getEmail());


    Veiculo veiculo1 = new Veiculo("ABC-1234", "Preto", 5, 50, 180.0, 12.5);
    System.out.println("Placa: " + veiculo1.getPlaca());
    System.out.println("Cor: " + veiculo1.getCor());
    System.out.println("Passageiros: " + veiculo1.getPassageiros());
    System.out.println("Capacidade do Tanque: " + veiculo1.getCapacidadetanque());
    System.out.println("Velocidade Máxima: " + veiculo1.getVelmax());
    System.out.println("Consumo Médio: " + veiculo1.getConsumomedio());


}
}