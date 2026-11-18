package org.gabriel.pessoal.excecoes;

/**
 * <h2>Exceções 05 — Encadeamento (cause), relançar e traduzir exceções</h2>
 *
 * <p>Simule 3 camadas: {@code Repositorio} → {@code Servico} → {@code main} (controller).</p>
 *
 * <ul>
 *   <li>{@code Repositorio.buscarPorId(int id)} lança {@code RepositorioException} (checked, customizada)
 *       com uma mensagem e uma causa original ({@link java.io.IOException} simulada).</li>
 *   <li>{@code Servico.obterUsuario(int id)} chama o repositório, captura {@code RepositorioException}
 *       e lança {@code ServicoException} (unchecked) <b>preservando a causa</b>
 *       ({@code new ServicoException("msg", e)}).</li>
 *   <li>No {@code main}, capture {@code ServicoException} e imprima a mensagem, a causa
 *       ({@code getCause()}) e a causa da causa, percorrendo a cadeia com um laço {@code while}.</li>
 * </ul>
 *
 * <p>Depois, faça um {@code catch} que apenas relança a mesma exceção ({@code throw e;}) após logar
 * e compare com criar uma nova SEM passar a causa. Anote em comentário o que se perde no stack trace.</p>
 *
 * <p><b>Dica:</b> chame {@code e.printStackTrace()} e procure a linha "Caused by:".</p>
 */
public class ExcecaoEncadeadaEmCamadas {
    public static void main(String[] args) {
        // TODO
    }
}
