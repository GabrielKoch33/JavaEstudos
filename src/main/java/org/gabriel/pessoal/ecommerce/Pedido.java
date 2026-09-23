package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> pedidos;
    private double valorFinal;
    {
        pedidos = new ArrayList<>();
    }

    public Pedido(ItemPedido itemPedido) {
        this.pedidos.add(itemPedido);
        for (ItemPedido item : pedidos) {
            this.valorFinal += item.getValorItem();
        }
    }

    public List<ItemPedido> getPedido() {
        return List.copyOf(this.pedidos);
    }

    public double getValorFinal() {
        return valorFinal;
    }
}

