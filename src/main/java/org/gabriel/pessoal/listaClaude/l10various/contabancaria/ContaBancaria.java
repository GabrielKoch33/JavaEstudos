package org.gabriel.pessoal.listaClaude.l10various.contabancaria;

public abstract class ContaBancaria implements Conta{
    /**
     * Atributos protected para acessar nas filhas
    **/
    protected String titular;
    protected String conta;
    protected double saldo;

    public ContaBancaria(String titular, String conta, double saldo) {
        this.titular = titular;
        this.conta   = conta;
        this.saldo   = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public final void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.exibirSaldo();
        }
    }

//    public abstract void sacar(double valor);
//
//    abstract void aplicarRendimento();

    @Override
    public void exibirSaldo() {
        System.out.println(this.saldo);
    }
}
