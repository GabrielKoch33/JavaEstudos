package org.gabriel.pessoal.listaClaude.l4poo.carrinhoDeCompras;

public class ItemPedido {

    Produto produto;

    int quantidade;

    double precoDeCompra;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoDeCompra = produto.getPreco();
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "Nome: " + produto +
                ", Quantidade: " + quantidade +
                ", Preço comprado: " + precoDeCompra +
                '}';
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }
}
