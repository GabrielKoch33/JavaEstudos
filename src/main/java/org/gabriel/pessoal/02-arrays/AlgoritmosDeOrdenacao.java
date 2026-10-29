package org.gabriel.pessoal.revisao.arrays;

/**
 * <h2>Algoritmos de ordenação e busca binária</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> arrays, laços aninhados, troca de elementos, contagem de operações, {@code java.util.Arrays}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Implementar os algoritmos clássicos e entender na prática as diferenças de custo.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Implemente {@code bubbleSort} (com parada antecipada), {@code selectionSort} e {@code insertionSort} para {@code int[]}. Cada um deve devolver um {@code long[]} com {@code {comparações, trocas}}.</p>
 * <p>Implemente também {@code buscaBinaria(int[] ordenado, int alvo)} com a mesma convenção de retorno de {@code Arrays.binarySearch}: índice se encontrar, ou {@code -(pontoDeInsercao) - 1} se não encontrar.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Nunca ordenar o array original: trabalhe sobre cópias com {@code Arrays.copyOf}.</li>
 *   <li>Gerar arrays aleatórios de 10, 1.000 e 10.000 elementos, além de um já ordenado e outro em ordem inversa.</li>
 *   <li>Confirmar a correção de cada algoritmo comparando com {@code Arrays.sort} via {@code Arrays.equals}.</li>
 *   <li>Imprimir uma tabela: algoritmo x tamanho x comparações x trocas, com {@code printf}.</li>
 *   <li>Testar a busca binária contra {@code Arrays.binarySearch} com 10.000 alvos, existentes e inexistentes.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code mergeSort} e comparar a contagem de operações com os outros.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>O {@code long[]} de retorno pode ser trocado por um contador passado como parâmetro; escolha e justifique.</p>
 */
public class AlgoritmosDeOrdenacao {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
