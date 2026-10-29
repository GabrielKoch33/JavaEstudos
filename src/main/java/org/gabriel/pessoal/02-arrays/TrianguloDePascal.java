package org.gabriel.pessoal.revisao.arrays;

/**
 * <h2>Triângulo de Pascal com array irregular</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> arrays irregulares (jagged), {@code long}, formatação, propriedades matemáticas</p>
 *
 * <h3>Objetivo</h3>
 * <p>Usar arrays bidimensionais onde cada linha tem tamanho diferente.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Gere as primeiras {@code n} linhas do Triângulo de Pascal em um {@code long[][]} cujas linhas têm tamanhos 1, 2, 3, ... n. Cada elemento é a soma dos dois acima.</p>
 * <p>Imprima o triângulo centralizado e verifique duas propriedades: a soma da linha {@code k} é {@code 2^k}, e cada linha é simétrica.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Declarar o array como {@code new long[n][]} e instanciar cada linha separadamente.</li>
 *   <li>Calcular a largura de cada número com base no maior elemento para centralizar a saída corretamente.</li>
 *   <li>Verificar as propriedades por código e imprimir <code>OK</code> ou <code>FALHOU</code> por linha.</li>
 *   <li>Descobrir a partir de qual linha o {@code long} estoura e imprimir essa linha no fim.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * n = 5
 *       1
 *      1 1
 *     1 2 1
 *    1 3 3 1
 *   1 4 6 4 1
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code long combinacao(int n, int k)} usando o próprio triângulo.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Pense no estouro: o valor central da linha 67 já não cabe em {@code long}.</p>
 */
public class TrianguloDePascal {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
