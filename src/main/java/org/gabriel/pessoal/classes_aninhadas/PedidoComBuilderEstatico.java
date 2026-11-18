package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 06 — Builder como static nested class</h2>
 *
 * <p>Implemente a classe imutável {@code Pedido} com os campos: {@code cliente} (obrigatório),
 * {@code produto} (obrigatório), {@code quantidade} (padrão 1), {@code cupom} (opcional) e
 * {@code urgente} (padrão false).</p>
 *
 * <ul>
 *   <li>O construtor de {@code Pedido} deve ser {@code private} e receber um {@code Builder}.</li>
 *   <li>{@code Pedido.Builder} é uma <b>static nested class</b> pública, com métodos encadeáveis
 *       ({@code cliente(..)}, {@code produto(..)}, {@code quantidade(..)}, {@code cupom(..)}, {@code urgente(..)})
 *       e {@code build()}.</li>
 *   <li>{@code build()} valida: cliente/produto não nulos nem vazios e quantidade {@code > 0},
 *       lançando {@link IllegalStateException} ou {@link IllegalArgumentException} com mensagem clara.</li>
 * </ul>
 *
 * <p>Uso esperado no {@code main}:</p>
 * <pre>
 * Pedido p = new Pedido.Builder().cliente("Ana").produto("Teclado").quantidade(2).urgente(true).build();
 * </pre>
 *
 * <p><b>Responda:</b> por que o Builder precisa ser static? E por que ele consegue chamar o
 * construtor private de {@code Pedido}?</p>
 */
public class PedidoComBuilderEstatico {
    public static void main(String[] args) {
        // TODO
    }
}
