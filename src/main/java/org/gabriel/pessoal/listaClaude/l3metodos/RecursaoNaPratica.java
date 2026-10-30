package org.gabriel.pessoal.revisao.metodos;

/**
 * <h2>Recursão na prática</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> recursão, caso base, memoização com array, {@code long}, {@code StringBuilder}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Treinar o raciocínio recursivo em problemas de naturezas diferentes.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Implemente recursivamente: (a) {@code fatorial(int n)} com {@code long}; (b) {@code fibonacciIngenuo(int n)} contando as chamadas e {@code fibonacciMemo(int n)} com array de cache; (c) {@code potencia(long base, int expoente)} por exponenciação rápida (divisão em dois); (d) {@code inverter(String s)}; (e) {@code torreDeHanoi(int discos, char origem, char destino, char auxiliar)} imprimindo cada movimento; (f) {@code permutacoes(String s)} imprimindo todas as permutações.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Mostrar quantas chamadas {@code fibonacciIngenuo(35)} faz e quantas faz {@code fibonacciMemo(35)}.</li>
 *   <li>Em Hanói, confirmar que o total de movimentos é {@code 2^n - 1} contando por código.</li>
 *   <li>Em {@code permutacoes}, não repetir permutações para strings com letras repetidas (ex.: <code>AAB</code> tem 3, não 6).</li>
 *   <li>Descobrir experimentalmente a profundidade em que a recursão causa {@code StackOverflowError}.</li>
 * </ul>
 */
public class RecursaoNaPratica {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
