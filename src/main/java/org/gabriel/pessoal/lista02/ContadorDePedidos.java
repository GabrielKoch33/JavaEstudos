package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.ItemPedido;
import org.gabriel.pessoal.lista02.classesExtras.Pedido;

/**
 * Exercício 09 — Contador Automático de Pedidos ({@code static}).
 * <p>
 * Crie uma classe {@code Pedido} que, toda vez que um novo pedido for
 * criado, receba automaticamente um número sequencial (1, 2, 3...) sem
 * você precisar passar esse número manualmente no construtor.
 * <p>
 * <b>Pesquise:</b> por que esse contador de sequência precisa ser
 * {@code static} — o que aconteceria se ele fosse um atributo de
 * instância normal?
 */
public class ContadorDePedidos {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        ItemPedido item1 = new ItemPedido("Bola", 2, 3.48);
        ItemPedido item2 = new ItemPedido("Fogão", 3, 50.0);
        ItemPedido item3 = new ItemPedido("TV", 1, 150);
        ItemPedido item4 = new ItemPedido("Jóia", 4, 99.9);
        ItemPedido item5 = new ItemPedido("Vidraça", 3, 15);

        pedido.adicionaItemPedido(item1);
        pedido.adicionaItemPedido(item2);
        pedido.adicionaItemPedido(item3);
        pedido.adicionaItemPedido(item4);
        pedido.adicionaItemPedido(item5);

        pedido.listaPedidos();
    }
}