/**
 * <h2>Interfaces</h2>
 *
 * <p>Crie a interface {@code Exportavel} com:</p>
 * <ul>
 *   <li>{@code String exportar()}: metodo abstrato.</li>
 *   <li>{@code default String nomeDoArquivo()}: retorna o nome simples da classe
 *       em minusculas (dica: {@code getClass().getSimpleName()}) seguido de {@code ".txt"}.</li>
 *   <li>{@code static boolean validar(String conteudo)}: retorna {@code false} se o conteudo
 *       for nulo ou vazio.</li>
 *   <li>Uma constante {@code String SEPARADOR = ";"}.</li>
 * </ul>
 *
 * <p>Crie tambem a interface {@code Auditavel} com {@code String registrarAuditoria()}.</p>
 *
 * <p>Implemente:</p>
 * <ul>
 *   <li>{@code Produto} (nome, preco): implementa {@code Exportavel}.</li>
 *   <li>{@code Cliente} (nome, email): implementa {@code Exportavel} <b>e</b> {@code Auditavel}
 *       (heranca multipla de tipo via interfaces).</li>
 * </ul>
 *
 * <p>No {@code main}, exporte um objeto de cada classe usando {@code SEPARADOR}, valide o conteudo
 * com {@code Exportavel.validar(...)} e imprima {@code nomeDoArquivo()}. Depois sobrescreva
 * {@code nomeDoArquivo()} em {@code Cliente} para retornar {@code ".csv"}.</p>
 *
 * <p><b>Pense:</b> o que acontece se duas interfaces tiverem um metodo {@code default} com a
 * mesma assinatura e uma classe implementar as duas? Teste e resolva.</p>
 */
public class ContratoDeExportacao {

    public static void main(String[] args) {
        // TODO
    }
}
