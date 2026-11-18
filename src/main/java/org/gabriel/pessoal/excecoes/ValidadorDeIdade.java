package org.gabriel.pessoal.excecoes;

/**
 * <h2>Exceções 01 — Unchecked, throw, try/catch/finally</h2>
 *
 * <p>Crie um método estático {@code validarIdade(int idade)} que:</p>
 * <ul>
 *   <li>lance {@link IllegalArgumentException} com mensagem clara se a idade for menor que 0 ou maior que 150;</li>
 *   <li>retorne normalmente caso contrário.</li>
 * </ul>
 *
 * <p>No {@code main}, teste os valores {@code 25, -3, 200, 0} em um laço.
 * Cada tentativa deve ficar dentro de um {@code try/catch}, imprimindo a mensagem da exceção.
 * Use um bloco {@code finally} que imprima "Validação encerrada" ao fim de CADA tentativa.</p>
 *
 * <p><b>Responda em comentário no fim do arquivo:</b></p>
 * <ol>
 *   <li>Por que o método não precisa declarar {@code throws}?</li>
 *   <li>O {@code finally} executa mesmo quando a exceção NÃO é lançada? E se houver um {@code return} no try?</li>
 * </ol>
 */
public class ValidadorDeIdade {
    public static void main(String[] args) {
        // TODO
    }
}
