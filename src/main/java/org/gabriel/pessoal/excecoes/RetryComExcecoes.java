/**
 * <h2>Exceções 07 — Retry, laço com tratamento e exceção de domínio</h2>
 *
 * <p>Simule um serviço instável: {@code ServicoExterno.chamar()} falha aleatoriamente
 * (use {@code Math.random() < 0.7}) lançando a checked {@code FalhaTemporariaException}.</p>
 *
 * <p>Implemente {@code executarComRetry(int maxTentativas)} que:</p>
 * <ul>
 *   <li>tenta chamar o serviço até {@code maxTentativas} vezes;</li>
 *   <li>a cada falha, imprime "Tentativa N falhou" e espera um pouco
 *       ({@code Thread.sleep}) — trate a {@link InterruptedException} corretamente
 *       (restaurando a flag com {@code Thread.currentThread().interrupt()});</li>
 *   <li>se todas falharem, lança {@code TentativasEsgotadasException} (unchecked) com a ÚLTIMA falha como causa;</li>
 *   <li>se alguma der certo, retorna o resultado imediatamente.</li>
 * </ul>
 *
 * <p>Teste com 3 tentativas. Rode várias vezes e observe os dois caminhos.</p>
 *
 * <p><b>Pense:</b> por que é perigoso "engolir" exceção com {@code catch (Exception e) {}} vazio?</p>
 */
public class RetryComExcecoes {
    public static void main(String[] args) {
        // TODO
    }
}
