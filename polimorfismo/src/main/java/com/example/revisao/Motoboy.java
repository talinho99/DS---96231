package com.example.revisao;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    public Motoboy(String cpf, String dataAdmissao, String dataNascimento, String nome, String rg, double salarioBase, Sexo sexo, String placaDaMoto) {
        super(cpf, dataAdmissao, dataNascimento, nome, rg, salarioBase, sexo);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.getSalarioBase();
    }
}