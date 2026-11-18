/**
 * <h2>Exceções 04 — try-with-resources, AutoCloseable e suppressed</h2>
 *
 * <p>Crie a classe {@code ConexaoFalsa implements AutoCloseable} com:</p>
 * <ul>
 *   <li>um nome (para identificar no log);</li>
 *   <li>construtor que imprime "Abrindo [nome]";</li>
 *   <li>{@code consultar(String sql)} que imprime a consulta e lança {@link IllegalStateException}
 *       se o SQL estiver vazio;</li>
 *   <li>{@code close()} que imprime "Fechando [nome]" e, opcionalmente (via flag), lança
 *       {@link RuntimeException} para simular falha ao fechar.</li>
 * </ul>
 *
 * <p>Experimentos no {@code main}:</p>
 * <ol>
 *   <li>Abra UMA conexão em um try-with-resources e consulte normalmente.</li>
 *   <li>Abra DUAS conexões no mesmo try ({@code try (A a = ...; B b = ...)}) e observe a ORDEM de fechamento.</li>
 *   <li>Faça {@code consultar("")} lançar exceção E {@code close()} também lançar.
 *       No catch, imprima a exceção principal e percorra {@code e.getSuppressed()}.</li>
 * </ol>
 *
 * <p><b>Responda em comentário:</b> qual a diferença entre usar try-with-resources e fechar no {@code finally}?
 * Qual das duas exceções "vence" e qual vira suppressed?</p>
 */
public class ConexaoComTryWithResources {
    public static void main(String[] args) {
        // TODO
    }
}
