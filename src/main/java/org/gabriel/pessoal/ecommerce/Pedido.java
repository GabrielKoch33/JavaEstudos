package org.gabriel.pessoal.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> pedido;
    private double valorFinal;
    {
        pedido = new ArrayList<>();
    }

    public Pedido(ItemPedido itemPedido) {
        this.pedido.add(itemPedido);
        for (ItemPedido item : pedido) {
            this.valorFinal += item.getValorItem();
        }
    }

    public List<ItemPedido> getPedido() {
        return pedido;
    }

    public double getValorFinal() {
        return valorFinal;
    }
}

