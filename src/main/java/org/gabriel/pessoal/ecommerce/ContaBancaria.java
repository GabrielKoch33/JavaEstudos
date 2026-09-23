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
        return " "+instituicao+" | "+saldoConta;
    }

    public boolean podeDescontar(double valor) {
        return valor >= 0 && valor <= this.saldoConta;
    }

    public boolean descontaSaldo(double valor) {
        if (!podeDescontar(valor)) {
            return false;
        }
        this.saldoConta -= valor;
        return true;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
