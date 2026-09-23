package org.gabriel.pessoal.ecommerce;

public class FinalizarCompra {
    private Pedido pedido;
    private Usuario usuario;

    public boolean finaliza(Pedido pedido, Usuario usuario) {
        return usuario.descontaSaldo(pedido.getValorFinal());
    }
}