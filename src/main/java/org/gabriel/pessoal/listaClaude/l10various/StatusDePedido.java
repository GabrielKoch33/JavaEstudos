/**
 * <h2>Enums</h2>
 *
 * <p>Crie o enum {@code StatusPedido} com os valores: {@code AGUARDANDO_PAGAMENTO}, {@code PAGO},
 * {@code EM_SEPARACAO}, {@code ENVIADO}, {@code ENTREGUE} e {@code CANCELADO}.</p>
 *
 * <p>Cada valor deve ter, via construtor (privado):</p>
 * <ul>
 *   <li>{@code String descricao} (texto amigavel para exibir ao cliente);</li>
 *   <li>{@code boolean finalizado} ({@code true} para {@code ENTREGUE} e {@code CANCELADO}).</li>
 * </ul>
 *
 * <p>Metodos do enum:</p>
 * <ul>
 *   <li>{@code StatusPedido proximo()}: retorna o proximo status do fluxo normal
 *       (use {@code ordinal()} e {@code values()}); de {@code ENTREGUE} e {@code CANCELADO}
 *       lanca {@code IllegalStateException}.</li>
 *   <li>{@code boolean podeCancelar()}: so e possivel cancelar antes de {@code ENVIADO}.</li>
 *   <li>Um metodo abstrato {@code double calcularFrete(double valorPedido)} sobrescrito por
 *       valor (corpo proprio por constante): {@code ENTREGUE} e {@code CANCELADO} retornam 0,
 *       os demais retornam 5% do valor do pedido.</li>
 * </ul>
 *
 * <p>No {@code main}:</p>
 * <ol>
 *   <li>Percorra todos os valores com {@code for-each} em {@code values()} imprimindo nome,
 *       descricao e ordinal.</li>
 *   <li>Converta a String {@code "PAGO"} para enum com {@code valueOf} e trate o caso de uma
 *       String invalida ({@code IllegalArgumentException}).</li>
 *   <li>Use um {@code switch} (com a sintaxe moderna {@code ->}) para imprimir uma mensagem
 *       diferente por status.</li>
 *   <li>Simule um pedido avancando com {@code proximo()} ate ser finalizado.</li>
 *   <li>Compare enums com {@code ==} e explique em comentario por que isso e seguro
 *       (diferente de Strings).</li>
 * </ol>
 */
public class StatusDePedido {

    public static void main(String[] args) {
        // TODO
    }
}
