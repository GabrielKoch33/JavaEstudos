package org.gabriel.pessoal.listaClaude.l7enums;

/**
 * <h2>Máquina de estados com enum</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code enum} com atributos e construtor, {@code values}, {@code valueOf}, {@code ordinal}, {@code switch}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Usar o enum como um tipo rico, com dados e comportamento.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie o enum {@code StatusPedido} com os estados {@code CRIADO}, {@code PAGO}, {@code SEPARADO}, {@code ENVIADO}, {@code ENTREGUE} e {@code CANCELADO}. Cada estado tem uma descrição e um indicador de estado final.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Construtor privado e atributos {@code final} no enum.</li>
 *   <li>Método {@code boolean podeIrPara(StatusPedido destino)} codificando as transições válidas (ex.: de {@code PAGO} só vai para {@code SEPARADO} ou {@code CANCELADO}; estados finais não saem).</li>
 *   <li>Método estático {@code deDescricao(String)} que devolve o enum a partir da descrição, ou {@code null} se não existir.</li>
 *   <li>Uma classe {@code Pedido} que tenta mudar de estado e registra o histórico de transições, recusando as inválidas.</li>
 *   <li>Percorrer {@code values()} imprimindo ordinal, nome e descrição.</li>
 *   <li>Usar {@code switch} sobre o enum e explicar a vantagem de não precisar de {@code default} quando todos os casos são cobertos (em {@code switch} expressão).</li>
 *   <li>Mostrar o que {@code valueOf("inexistente")} faz.</li>
 * </ul>
 */
public class StatusDePedidoComEnum {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
