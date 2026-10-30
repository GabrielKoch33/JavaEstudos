package org.gabriel.pessoal.listaClaude.l10various.contabancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca (String titular, String conta, double saldo) {
        super(titular, conta, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.exibirSaldo();
        }
        System.out.println("saldo insuficiente");
    }

    @Override
    public void aplicarRendimento() {
        this.saldo += (this.saldo * 0.05);
        this.exibirSaldo();
        System.out.println("rendimento na CC: "+0.05);
    }
}
