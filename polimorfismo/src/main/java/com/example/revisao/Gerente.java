package com.example.revisao;

public class Gerente extends CargoDeConfianca{
    public Gerente(String cpf, String dataAdmissao, String dataNascimento, String nome, String rg, double salarioBase, Sexo sexo, Bonificacao bonificacao) {
        super(cpf, dataAdmissao, dataNascimento, nome, rg, salarioBase, sexo, bonificacao);
    }

    @Override
    public double obterSalarioFinal() {
        return Bonificacao.GERENTE.getValor() * super.salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
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
}
