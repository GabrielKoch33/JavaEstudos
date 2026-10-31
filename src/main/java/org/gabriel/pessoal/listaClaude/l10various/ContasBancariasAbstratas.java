package org.gabriel.pessoal.listaClaude.l10various;

import org.gabriel.pessoal.listaClaude.l10various.contabancaria.Conta;
import org.gabriel.pessoal.listaClaude.l10various.contabancaria.ContaBancaria;
import org.gabriel.pessoal.listaClaude.l10various.contabancaria.ContaCorrente;
import org.gabriel.pessoal.listaClaude.l10various.contabancaria.ContaPoupanca;

/**
 * <h2>Classes Abstratas</h2>
 *
 * <p>Crie a classe <b>abstrata</b> {@code ContaBancaria} com {@code titular}, {@code numero} e
 * {@code saldo} (private, com getter), inicializados por construtor.</p>
 *
 * <p>Metodos:</p>
 * <ul>
 *   <li>{@code depositar(double valor)}: concreto, ignora valores &lt;= 0.</li>
 *   <li>{@code sacar(double valor)}: <b>abstrato</b> (cada tipo de conta tem sua regra).</li>
 *   <li>{@code aplicarRendimentoMensal()}: <b>abstrato</b>.</li>
 *   <li>{@code exibirExtrato()}: concreto, e usa os metodos acima (Template Method simples).</li>
 * </ul>
 *
 * <p>Subclasses:</p>
 * <ul>
 *   <li>{@code ContaCorrente}: permite saldo negativo ate um limite de cheque especial;
 *       nao rende.</li>
 *   <li>{@code ContaPoupanca}: nao permite saldo negativo; rende 0,5% ao mes.</li>
 * </ul>
 *
 * <p>No {@code main}:</p>
 * <ol>
 *   <li>Tente instanciar {@code ContaBancaria} diretamente e comente o erro obtido.</li>
 *   <li>Guarde uma conta de cada tipo em um {@code ContaBancaria[]}, faca depositos, saques
 *       (inclusive um invalido) e aplique o rendimento em todas num unico loop.</li>
 *   <li>Como o saldo e {@code private}, as subclasses precisam alterar o saldo. Resolva isso
 *       sem tornar o atributo {@code public} (dica: metodo {@code protected}).</li>
 * </ol>
 *
 * <p><b>Pense:</b> por que uma classe abstrata pode ter construtor e atributos, e uma interface
 * (classica) nao?</p>
 */
public class ContasBancariasAbstratas {

    public static void main(String[] args) {
        // TODO
        ContaPoupanca cp = new ContaPoupanca("Eu","9-3",13);
        ContaCorrente cc = new ContaCorrente("Eu","9-3",10);

        ContaBancaria[] contas = {cp,cc};
        double vlr = 100;
        double desc = 1000;
        for (int i = 0; i < contas.length; i++) {
            ContaBancaria c = contas[i];
            c.depositar(vlr);
            c.sacar(desc);
        }
        System.out.println("============");

        // usando como tipo o da Inteface Conta
        // como contabancaria implementa ela, suas filhas tambem herdam os metodos
        for (Conta conta : contas) {
            conta.aplicarRendimento();     // especial para cada filha
            conta.depositar(1000); // unica na Pai
            conta.sacar(1400);     // especial para cada filha
            conta.sacar(800);
            conta.exibirSaldo();           // unica na Pai
        }
    }
}
