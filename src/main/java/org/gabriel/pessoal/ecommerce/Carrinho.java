package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<ItemPedido> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public boolean adicionaItemCarrinho(ItemPedido itemPedido) {
        this.carrinho.add(itemPedido);
        return true;
    }

    public boolean removeItemCarrinho(ItemPedido item) {
        return this.carrinho.remove(item);
    }

    public List<ItemPedido> getCarrinho() {
        return carrinho;
    }

    public boolean isEmpty() {
        return carrinho.isEmpty();
    }
}
