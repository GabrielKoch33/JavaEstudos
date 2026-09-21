package org.gabriel.pessoal.ecommerce;

public class ContaBancaria {
    private String instituicao;
    private Usuario titular;
    private double saldoConta;

    public ContaBancaria(String instituicao, Usuario titular, double saldoConta) {
        this.instituicao = instituicao;
        this.titular = titular;
        this.saldoConta = saldoConta;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void descontaSaldo(double valorPedido) {
        this.saldoConta -= valorPedido;
    }
}
