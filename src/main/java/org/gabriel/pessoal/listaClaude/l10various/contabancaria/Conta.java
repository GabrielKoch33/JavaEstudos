package org.gabriel.pessoal.listaClaude.l10various.contabancaria;

public interface Conta {

    abstract void depositar(double valor);

    public abstract void sacar(double valor);

    abstract void aplicarRendimento();

    public void exibirSaldo();
}
