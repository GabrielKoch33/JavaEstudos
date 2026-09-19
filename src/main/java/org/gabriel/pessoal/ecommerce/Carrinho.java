package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<ItemPedido> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public void adicionaAoCarrinho(ItemPedido ItemProduto) {
        this.carrinho.add(ItemProduto);
    }

    public boolean removerDoCarrinho(ItemPedido ItemProduto) {
        return this.carrinho.remove(ItemProduto);
    }
}
