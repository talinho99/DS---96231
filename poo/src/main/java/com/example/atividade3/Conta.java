package com.example.atividade3;

public class Conta {
    private String banco;
    private int agencia;
    private int numeroconta;
    private String tipoconta;
    private double saldo;
    private double limitedisp;
    public Conta(String banco, int agencia, int numeroconta, String tipoconta, double saldo, double limitedisp) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.tipoconta = tipoconta;
        this.saldo = saldo;
        this.limitedisp = limitedisp;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumeroconta() {
        return numeroconta;
    }
    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
    public String getTipoconta() {
        return tipoconta;
    }
    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimitedisp() {
        return limitedisp;
    }
    public void setLimitedisp(double limitedisp) {
        this.limitedisp = limitedisp;
    }
    
    

}
