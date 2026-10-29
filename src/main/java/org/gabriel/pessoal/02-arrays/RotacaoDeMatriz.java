package org.gabriel.pessoal.revisao.arrays;

/**
 * <h2>Rotação e espiral de matriz</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code int[][]}, índices, transposição, trabalho in-place</p>
 *
 * <h3>Objetivo</h3>
 * <p>Dominar a manipulação de índices em matrizes sem alocar estruturas extras.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Implemente: (a) {@code transpor(int[][] m)} para matriz quadrada, in-place; (b) {@code rotacionarHorario(int[][] m)} para NxN, in-place (dica: transpor e depois inverter cada linha); (c) {@code imprimirEspiral(int[][] m)} para matriz MxN qualquer, que imprime os elementos em espiral no sentido horário a partir do canto superior esquerdo.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Nas operações (a) e (b) não pode criar uma segunda matriz.</li>
 *   <li>A espiral deve funcionar para matrizes retangulares (3x5, 5x3, 1x4, 4x1).</li>
 *   <li>Criar o método {@code imprimir(int[][])} com {@code printf} alinhado e reutilizá-lo nos testes.</li>
 *   <li>Testar com matrizes 1x1, 2x2, 3x3 e 4x4 e conferir manualmente.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * Entrada 3x3:    Rotação 90 graus:  Espiral:
 * 1 2 3          7 4 1              1 2 3 6 9 8 7 4 5
 * 4 5 6          8 5 2
 * 7 8 9          9 6 3
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code rotacionarAntiHorario} e uma rotação por {@code k} quartos de volta sem repetir código.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Para a espiral, mantenha quatro limites ({@code topo, base, esquerda, direita}) e vá encolhendo.</p>
 */
public class RotacaoDeMatriz {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
