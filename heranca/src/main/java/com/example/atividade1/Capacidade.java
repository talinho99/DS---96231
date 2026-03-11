package com.example.atividade1;

public  class Capacidade  extends Hardware{
    private String capacidadeArmazenamento;
    private String tipoConexao;

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "Capacidade{" +
                "capacidadeArmazenamento='" + capacidadeArmazenamento + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Capacidade(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;





    }
}
