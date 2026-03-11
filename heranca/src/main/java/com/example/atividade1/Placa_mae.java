package com.example.atividade1;

public class Placa_mae extends Hardware{
    private String soquete;

    public Placa_mae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
}
