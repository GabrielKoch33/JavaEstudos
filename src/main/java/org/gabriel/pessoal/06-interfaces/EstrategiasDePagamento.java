package org.gabriel.pessoal.revisao.interfaces;

/**
 * <h2>Estratégias de pagamento com interface</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> interface, polimorfismo, aberto/fechado, composição</p>
 *
 * <h3>Objetivo</h3>
 * <p>Aplicar interface para adicionar comportamentos novos sem modificar o código existente.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Defina a interface {@code Pagamento} com {@code boolean autorizar(long valorEmCentavos)}, {@code long taxa(long valor)} e {@code String descricao()}. Implemente {@code Pix} (sem taxa), {@code CartaoCredito} (com parcelas e juros compostos a partir da 4ª parcela, limite) e {@code Boleto} (taxa fixa e prazo).</p>
 * <p>Crie {@code ProcessadorDePedidos} que recebe um {@code Pagamento} e processa uma lista de valores.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>O {@code ProcessadorDePedidos} só conhece a interface, nunca as classes concretas.</li>
 *   <li>Cartão recusa compras que ultrapassem o limite disponível, e o limite diminui a cada compra aprovada.</li>
 *   <li>Imprimir um resumo final: total aprovado, total recusado e total de taxas cobradas.</li>
 *   <li>Provar o princípio aberto/fechado: crie {@code Cripto} em um arquivo novo e use no {@code main} sem alterar o processador.</li>
 *   <li>Armazenar diferentes pagamentos em um {@code Pagamento[]} e iterar.</li>
 * </ul>
 */
public class EstrategiasDePagamento {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
