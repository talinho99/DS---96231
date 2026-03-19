package com.example.revisao;

public abstract class CargoDeConfianca  extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String cpf, String dataAdmissao, String dataNascimento, String nome, String rg, double salarioBase, Sexo sexo, Bonificacao bonificacao) {
        super(cpf, dataAdmissao, dataNascimento, nome, rg, salarioBase, sexo);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
