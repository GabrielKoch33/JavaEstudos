/**
 * <h2>Exceções 09 — Desafio: calculadora de comandos robusta</h2>
 *
 * <p>Leia linhas do teclado ({@link java.util.Scanner}) no formato {@code "operacao n1 n2"}
 * (ex.: {@code soma 10 5}, {@code div 8 0}, {@code sair}) em um laço infinito que só termina com "sair".</p>
 *
 * <p>Regras:</p>
 * <ul>
 *   <li>Operações: {@code soma, sub, mult, div, pot}.</li>
 *   <li>Nenhuma exceção pode derrubar o programa: o laço continua após qualquer erro.</li>
 *   <li>Use exceções <b>customizadas</b> para: operação desconhecida, quantidade errada de argumentos,
 *       divisão por zero (traduzindo a {@link ArithmeticException}).</li>
 *   <li>Use {@link NumberFormatException} para operandos inválidos, mas converta em uma
 *       exceção sua com mensagem amigável, mantendo a causa.</li>
 *   <li>Use try-with-resources para o Scanner.</li>
 *   <li>Ao final (finally ou após o laço), imprima quantos comandos deram certo e quantos falharam, por tipo de erro
 *       (use um {@code Map<String, Integer>} com o nome da classe da exceção).</li>
 * </ul>
 *
 * <p><b>Bônus:</b> permita desfazer o último resultado com o comando {@code undo}, lançando
 * {@code NadaParaDesfazerException} quando não houver histórico.</p>
 */
public class CalculadoraDeComandos {
    public static void main(String[] args) {
        // TODO
    }
}
