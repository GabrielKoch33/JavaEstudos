package org.gabriel.pessoal.revisao.enums;

/**
 * <h2>Baralho com enums</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code enum}, {@code compareTo} de enum, {@code ordinal}, embaralhamento, arrays de objetos</p>
 *
 * <h3>Objetivo</h3>
 * <p>Modelar um domínio real com enums combinados a classes comuns.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie os enums {@code Naipe} (com símbolo e cor) e {@code Valor} (com valor numérico e rótulo). Crie {@code Carta} (naipe, valor) e {@code Baralho} com as 52 cartas em um array.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Gerar as 52 cartas com dois laços sobre {@code values()}.</li>
 *   <li>Embaralhar com o algoritmo de Fisher-Yates (sem {@code Collections.shuffle}).</li>
 *   <li>{@code distribuir(int quantidade)} devolve um array com as cartas do topo e as remove do baralho; pedir mais do que existe deve ser recusado.</li>
 *   <li>{@code Carta} implementa {@code Comparable}: compara primeiro por valor, depois por naipe, usando a ordem de declaração dos enums.</li>
 *   <li>Ordenar uma mão de 5 cartas e identificar se há par, trinca, flush (mesmo naipe) ou sequência.</li>
 *   <li>Imprimir as cartas como <code>A♠</code>, <code>10♥</code> etc.</li>
 * </ul>
 */
public class BaralhoComEnums {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
