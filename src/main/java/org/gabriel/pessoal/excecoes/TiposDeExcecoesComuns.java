package org.gabriel.pessoal.excecoes;

/**
 * <h2>Exceções 03 — Exceções comuns, multi-catch e ordem dos catch</h2>
 *
 * <p>Crie um método {@code executar(int opcao)} que, conforme a opção, provoca de propósito:</p>
 * <ol>
 *   <li>{@link ArithmeticException} (divisão por zero com inteiros);</li>
 *   <li>{@link ArrayIndexOutOfBoundsException};</li>
 *   <li>{@link NullPointerException} (chamar método em String nula);</li>
 *   <li>{@link NumberFormatException} ({@code Integer.parseInt("abc")});</li>
 *   <li>{@link ClassCastException} (cast inválido de Object para Integer);</li>
 *   <li>nenhuma exceção.</li>
 * </ol>
 *
 * <p>No {@code main}, chame o método para as opções de 1 a 6 e trate assim:</p>
 * <ul>
 *   <li>um catch com <b>multi-catch</b> ({@code A | B}) para Arithmetic e ArrayIndexOutOfBounds;</li>
 *   <li>um catch separado para NullPointerException;</li>
 *   <li>um catch para {@link RuntimeException} como "rede de segurança" (posicionado corretamente!).</li>
 * </ul>
 *
 * <p><b>Responda em comentário:</b></p>
 * <ol>
 *   <li>O que acontece se você colocar {@code catch (RuntimeException e)} ANTES dos mais específicos?</li>
 *   <li>Por que no multi-catch as duas exceções não podem ter relação de herança entre si?</li>
 * </ol>
 */
public class TiposDeExcecoesComuns {
    public static void main(String[] args) {
        // TODO
    }
}
