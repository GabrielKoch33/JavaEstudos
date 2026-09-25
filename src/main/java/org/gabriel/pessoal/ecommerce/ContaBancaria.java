package org.gabriel.pessoal.ecommerce;

public class ContaBancaria {
    private String instituicao;
    private double saldoConta;

    public ContaBancaria(String instituicao, double saldoConta) {
        this.instituicao = instituicao;
        this.saldoConta = saldoConta;
    }

    @Override
    public String toString() {
        return " | Instituição: "+instituicao+" | Saldo: "+saldoConta;
    }

    public boolean podeComprar(double valor) {
        return valor >= 0 && valor <= this.saldoConta;
    }

    public void descontaSaldo(double valor) {
        this.saldoConta -= valor;
    }

    public void recebeDinheiro (double valor) {
        this.saldoConta += valor;
    }

    //Getters && Setters Padrões//
    public String getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
