package com.example.revisao;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private final double premio = 1.1;

    public Diretor(String cpf, String dataAdmissao, String dataNascimento, String nome, String rg, double salarioBase, Sexo sexo, Bonificacao bonificacao) {
        super(cpf, dataAdmissao, dataNascimento, nome, rg, salarioBase, sexo, bonificacao);
    }

    public double getPremio() {
        return premio;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo: " + getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligando: " + getNome());

    }

    @Override
    public double obterSalarioFinal() {
        return Bonificacao.DIRETOR.getValor() * super.salarioBase;

    }


    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
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
