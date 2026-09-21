package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<ItemPedido> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public List<ItemPedido> getCarrinho() {
        return carrinho;
    }

    public boolean isEmpty() {
        return carrinho.isEmpty();
    }

    public void adicionaItemCarrinho(ItemPedido itemPedido) {
        this.carrinho.add(itemPedido);
    }
}
