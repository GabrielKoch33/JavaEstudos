package org.gabriel.pessoal.lista02.classesExtras;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contPedido = 0;
    private static List<ItemPedido> pedidos;

    public Pedido() {
        pedidos = new ArrayList<>();
    }

    public void adicionaItemPedido(ItemPedido item) {
        pedidos.add(item);
        contPedido++;
    }

    public List<ItemPedido> getPedidos() {
        return pedidos;
    }

    public void listaPedidos() {
        for (ItemPedido item : pedidos) {
            System.out.println(item.getNomeItem()+"- R$"+(item.getQuantidade()* item.getValorUnitario()));
        }
    }
}
