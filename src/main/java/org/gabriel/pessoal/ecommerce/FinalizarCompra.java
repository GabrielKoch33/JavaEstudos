package org.gabriel.pessoal.ecommerce;

public class FinalizarCompra {
    private Pedido pedido;
    private Usuario usuario;

    public boolean permiteComprar(Pedido pedido, ContaBancaria contaBancaria) {
       return pedido.getValorFinal() < contaBancaria.getSaldoConta();
    }

    public boolean finaliza(Pedido pedido, Usuario usuario) {
        ContaBancaria contaUser = usuario.getContaBancaria();
        if (permiteComprar(pedido, contaUser)) {
            contaUser.descontaSaldo(pedido.getValorFinal());
            return true;
        }
        return false;
    }
}