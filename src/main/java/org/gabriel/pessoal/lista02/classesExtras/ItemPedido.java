package org.gabriel.pessoal.lista02.classesExtras;

public class ItemPedido {
    private String nomeItem;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(String nomeItem, int quantidade, double valorUnitario) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
