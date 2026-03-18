package com.example.exercico2;

public class Motoboy extends Funcionario{
    private String placadaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String placadaMoto) {
        super(nome, cpf, dataNascimento, salarioBase);
        this.placadaMoto = placadaMoto;
    }

    public String getPlacadaMoto() {
        return placadaMoto;
    }

    public void setPlacadaMoto(String placadaMoto) {
        this.placadaMoto = placadaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadaMoto='" + placadaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.getSalarioBase();
    }
}
