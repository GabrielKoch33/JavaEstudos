package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<ItemPedido> carrinho;

    public Carrinho() {
        carrinho = new ArrayList<>();
    }

    public void adicionaItemCarrinho(ItemPedido itemPedido) {
        this.carrinho.add(itemPedido);
    }

    public void removeItemCarrinho(ItemPedido item) {
        this.carrinho.remove(item);
    }

    public List<ItemPedido> getCarrinho() {
        return carrinho;
    }

    public boolean isEmpty() {
        return carrinho.isEmpty();
    }

    public boolean updateCarrinho(String produtoNome, int novaQuantidade) {
        for (ItemPedido item : carrinho) {
            if (item.nomeProduto().equals(produtoNome)) {
                item.setQuantidade(novaQuantidade);
                return true;
            }
        }
        return false;
    }
}
