package org.gabriel.pessoal.ecommerce;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Nome Produto: "+this.produto.getNome()+" | Quantidade Comprada: "+quantidade;
    }

    public double getValorItem() {
        return produto.getPrecoUnit() * quantidade;
    }

    public Produto getProduto() {
        return produto;
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
}

