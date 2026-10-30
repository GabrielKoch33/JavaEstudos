package org.gabriel.pessoal.revisao.poo;

/**
 * <h2>Estoque de produtos com array dinâmico manual</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> associação, array de objetos, crescimento manual, remoção com deslocamento, {@code Arrays.copyOf}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Construir uma estrutura de dados simples por conta própria antes de usar {@code ArrayList}.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie {@code Produto} (código, nome, preço em centavos, quantidade, estoque mínimo) e {@code Estoque}, que guarda os produtos em um {@code Produto[]} que cresce sozinho (dobra de tamanho quando enche).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Métodos de {@code Estoque}: {@code adicionar}, {@code removerPorCodigo}, {@code buscarPorCodigo}, {@code registrarEntrada}, {@code registrarSaida}, {@code valorTotal}, {@code abaixoDoMinimo()} (devolve array só com os produtos críticos).</li>
 *   <li>A remoção deve deslocar os elementos para a esquerda sem deixar buracos e anular a última posição.</li>
 *   <li>Não permitir dois produtos com o mesmo código.</li>
 *   <li>Saída de quantidade maior que a disponível deve ser recusada com retorno {@code false}.</li>
 *   <li>Nenhum uso de {@code ArrayList}, {@code List} ou {@code Map}.</li>
 *   <li>No {@code main}, forçar pelo menos duas expansões do array e uma remoção no meio.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code ordenarPorNome()} e {@code ordenarPorValorEmEstoque()} sem {@code Arrays.sort}.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Separe o atributo {@code tamanho} (quantos itens existem) da {@code capacidade} (tamanho do array).</p>
 */
public class EstoqueDeProdutos {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
