package org.gabriel.pessoal.ecommerce;

import java.util.List;

public class Pedido {
    private List<ItemPedido> pedido;
    private double valorFinal;

    public void verPedido() {
        int i = 1;
        if (this.pedido == null) {
            System.out.println("Não é possível fazer um pedido sem produtos, selecione ao menos um item e inicialize a finalização da compra");
            return;
        }
        for (ItemPedido item : pedido) {
            System.out.println("ID" + i + "| PROD. NOME" + item.getProduto().getNome() + "| QTD"+item.getQuantidade());
            i++;
        }
    }
}
