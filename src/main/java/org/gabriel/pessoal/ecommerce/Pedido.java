package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> pedidos;
    private double valorFinal;
    {
        this.pedidos = new ArrayList<>();
    }

    public Pedido(ItemPedido item) {
        adicionaItemAoPedido(item);
    }

    public Pedido(Carrinho carrinho) {
        List<ItemPedido> listaCarrinho = carrinho.getCarrinho();
        for (ItemPedido itemCarrinho : listaCarrinho) {
            adicionaItemAoPedido(itemCarrinho);
            carrinho.removeItemCarrinho(itemCarrinho);
        }
    }

    private void adicionaItemAoPedido(ItemPedido item) {
        this.pedidos.add(item);
        this.valorFinal += item.getValorItem();
    }

    public double getValorFinal() {
        return this.valorFinal;
    }

    public List<ItemPedido> getPedido() {
        return List.copyOf(this.pedidos);
    }
}

