package com.example.atividade1;

public class Memoria extends Hardware {
    private int CapacidadeArmazenamento;

    public Memoria(String marca, String modelo, int capacidadeArmazenamento) {
        super(marca, modelo);
        CapacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getCapacidadeArmazenamento() {
        return CapacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        CapacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "CapacidadeArmazenamento=" + CapacidadeArmazenamento +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
