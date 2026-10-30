package org.gabriel.pessoal.listaClaude.l4poo.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    Cliente cliente;

    List<ItemPedido> itens;

    double desconto;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void notaFiscal() {
        for (ItemPedido item : this.itens) {
            System.out.println(item.toString());
        }
    }

    public double getSubtotal() {
        double sumPrecos = 0;
        for (ItemPedido item : this.itens) {
            sumPrecos += (item.getPrecoDeCompra() * item.getQuantidade());
        }
        return sumPrecos;
    }

    public double getTotal() {
        double total = getSubtotal();
        double desconto = calculaDesconto(total);
        return total - (total * desconto);
    }

    public double calculaDesconto(double subtotal) {
        Double total = (Double) subtotal;
        return (double) switch (total) {
            case Double t when t > 200 && t <= 500 -> 0.05;
            case Double t when t > 500 -> 0.1;
            default -> 0.0;
        };
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return List.copyOf(this.itens);
    }

    public void setItens(ItemPedido itemComprado) {
        for (ItemPedido item : this.itens) {
            if (item == itemComprado ) {
                item.setQuantidade(item.getQuantidade()+ itemComprado.getQuantidade());
            }
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
