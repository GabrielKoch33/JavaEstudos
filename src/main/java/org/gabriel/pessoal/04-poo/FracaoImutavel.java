package org.gabriel.pessoal.revisao.poo;

/**
 * <h2>Fração racional imutável</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> classe imutável, {@code final}, MDC, normalização, {@code equals}/{@code hashCode}, {@code compareTo}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Projetar uma classe imutável com invariantes garantidas pelo construtor.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe {@code Fracao} imutável. Toda fração é guardada simplificada e com o sinal no numerador. Operações: {@code somar}, {@code subtrair}, {@code multiplicar}, {@code dividir}, {@code inverter}, {@code comparar}, cada uma devolvendo uma <b>nova</b> fração.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Atributos {@code private final}; sem setters.</li>
 *   <li>O construtor simplifica pelo MDC (Euclides) e normaliza o sinal: <code>new Fracao(2, -4)</code> vira <code>-1/2</code>.</li>
 *   <li>Denominador zero deve ser rejeitado (lançar {@code IllegalArgumentException} com mensagem clara).</li>
 *   <li>{@code equals}/{@code hashCode} coerentes: <code>1/2</code> e <code>2/4</code> são iguais.</li>
 *   <li>{@code toString} imprime <code>3/4</code>, e <code>5</code> (sem barra) quando o denominador é 1.</li>
 *   <li>Método estático {@code Fracao.deDecimal(double)} aproximando com precisão razoável.</li>
 *   <li>Testar com somas encadeadas (1/2 + 1/3 + 1/6 deve dar 1).</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Detectar overflow nas operações com {@code Math.multiplyExact} e tratá-lo.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Simplificar já no construtor garante que a igualdade seja só comparar numerador e denominador.</p>
 */
public class FracaoImutavel {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
