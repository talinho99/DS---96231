package com.example.encapsulamento;

public class Veiculo {
    private String placa;
    private String cor;
    private int passageiros;
    private int capacidadetanque;
    private double velmax;
    private double consumomedio;
    
    public Veiculo(String placa, String cor, int passageiros, int capacidadetanque, double velmax,
            double consumomedio) {
        this.placa = placa;
        this.cor = cor;
        this.passageiros = passageiros;
        this.capacidadetanque = capacidadetanque;
        this.velmax = velmax;
        this.consumomedio = consumomedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(int capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    public double getVelmax() {
        return velmax;
    }

    public void setVelmax(double velmax) {
        this.velmax = velmax;
    }

    public double getConsumomedio() {
        return consumomedio;
    }

    public void setConsumomedio(double consumomedio) {
        this.consumomedio = consumomedio;
    }


}
