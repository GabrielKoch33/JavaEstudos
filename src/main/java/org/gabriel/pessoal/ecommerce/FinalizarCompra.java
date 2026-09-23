package org.gabriel.pessoal.ecommerce;

public class FinalizarCompra {

    public static void finaliza(Pedido pedido, Usuario usuario) {
        usuario.comprar(pedido.getValorFinal());
    }
}