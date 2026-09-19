package org.gabriel.pessoal.ecommerce;

public class Pagamento {
    private String instituicao;
    private Cliente titular;
    private double saldoConta;
    private double limiteCartao;
    private FormasDePagamento formasDePagamento;

    public enum FormasDePagamento {
        PIX,
        CREDITO,
        DEBITO,
    }
}
