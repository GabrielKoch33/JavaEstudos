package org.gabriel.pessoal.excecoes;

/**
 * <h2>Exceções 02 — Checked exception customizada, throws</h2>
 *
 * <p>Modele uma {@code ContaBancaria} (titular, saldo) com os métodos {@code depositar(double)} e {@code sacar(double)}.</p>
 *
 * <ul>
 *   <li>Crie a exceção <b>checked</b> {@code SaldoInsuficienteException extends Exception}, com os campos
 *       {@code saldoAtual} e {@code valorSolicitado} e um método {@code getFalta()} que retorna a diferença.</li>
 *   <li>{@code sacar} deve declarar {@code throws SaldoInsuficienteException} e lançá-la quando o saldo não bastar.</li>
 *   <li>{@code depositar} deve lançar {@link IllegalArgumentException} (unchecked) para valores {@code <= 0}.</li>
 * </ul>
 *
 * <p>No {@code main}, faça operações válidas e inválidas, tratando cada exceção em um {@code catch} próprio
 * (o catch da checked mostra quanto faltou).</p>
 *
 * <p><b>Desafio extra:</b> tente chamar {@code sacar} sem try/catch e sem throws no {@code main}.
 * Anote em comentário o erro de compilação e explique por que ele acontece.</p>
 */
public class SaqueBancario {
    public static void main(String[] args) {
        // TODO
    }
}
