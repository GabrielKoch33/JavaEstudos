package org.gabriel.pessoal.revisao.fundamentos;

/**
 * <h2>Armadilhas dos tipos primitivos</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> casting, overflow, divisão inteira, ponto flutuante, promoção numérica, {@code char}, strings</p>
 *
 * <h3>Objetivo</h3>
 * <p>Treinar a previsão do comportamento do Java antes de executar, corrigindo suas intuições erradas.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Para cada trecho abaixo, escreva em um comentário a sua <b>previsão</b> do que será impresso <u>antes</u> de executar. Depois rode, compare e explique em uma linha o motivo de cada divergência.</p>
 * <p>Trechos: {@code (byte) 200}; {@code 7 / 2} e {@code 7 / 2.0}; {@code 0.1 + 0.2 == 0.3}; {@code Integer.MAX_VALUE + 1}; {@code char c = 'a'; c += 1;} versus {@code c = c + 1;}; {@code (int) 3.99} e {@code (int) -3.99}; {@code Math.round(-2.5)} e {@code Math.round(2.5)}; {@code 1 << 40} versus {@code 1L << 40}; {@code short s = 1; s += 1;}; {@code 5 % -3} e {@code -5 % 3}; {@code "a" + 1 + 2} versus {@code 1 + 2 + "a"}; {@code (char) ('a' + 1)} versus {@code 'a' + 1}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Um método {@code static} por trecho, com nome descritivo.</li>
 *   <li>A linha que não compila ({@code c = c + 1}) deve ficar comentada, com o erro do compilador transcrito.</li>
 *   <li>Ao final, mostre como obter o resultado correto de {@code 0.1 + 0.2} usando {@code BigDecimal} criado a partir de {@code String}.</li>
 *   <li>Mostre como detectar overflow de {@code int} usando {@code Math.addExact}.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>A graça é errar a previsão. Se acertou todas, aumente a dificuldade e invente mais três armadilhas suas.</p>
 */
public class ArmadilhasDePrimitivos {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
