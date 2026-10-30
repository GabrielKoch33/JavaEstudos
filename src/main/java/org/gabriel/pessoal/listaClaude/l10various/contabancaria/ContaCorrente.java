package org.gabriel.pessoal.listaClaude.l10various.contabancaria;

public class ContaCorrente extends ContaBancaria {


    public ContaCorrente(String titular, String conta, double saldo) {
        super(titular, conta, saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        exibirSaldo();
        if (this.saldo < 0)
            System.out.println("seu saldo esta negativo");
    }

    @Override
    public void aplicarRendimento() {
        this.saldo += (this.saldo * 0.0);
        System.out.println("rendimento na CC: "+0.0);
    }
}
