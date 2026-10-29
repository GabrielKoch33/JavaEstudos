package org.gabriel.pessoal.revisao.fundamentos;

/**
 * <h2>Crivo de Eratóstenes</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code boolean[]}, laços aninhados, {@code printf}, {@code System.nanoTime}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Gerar primos com um algoritmo eficiente e comparar o desempenho com a abordagem ingênua.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Leia um número {@code N} (até 5 milhões) e liste todos os primos até {@code N} usando o Crivo de Eratóstenes com um {@code boolean[]}.</p>
 * <p>Em seguida, imprima as estatísticas: quantidade de primos, maior intervalo entre dois primos consecutivos e quantidade de pares de primos gêmeos (diferença 2).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Imprimir os primos alinhados em colunas de 10 por linha usando {@code printf} com largura fixa.</li>
 *   <li>O laço externo do crivo só precisa ir até a raiz quadrada de {@code N}; o interno começa em {@code i * i}.</li>
 *   <li>Implementar também {@code primoPorTentativa(int n)} (divisão por tentativa até a raiz) e medir o tempo dos dois métodos para o mesmo {@code N} com {@code System.nanoTime()}.</li>
 *   <li>Mostrar o tempo de cada abordagem em milissegundos com 3 casas decimais.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * N = 50
 *  2  3  5  7 11 13 17 19 23 29
 * 31 37 41 43 47
 * Total: 15 | Maior gap: 6 (23 -&gt; 29) | Pares gêmeos: 6
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Fatorar um número usando um crivo de menor fator primo (SPF) guardado em {@code int[]}.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Cuidado com o estouro: {@code i * i} com {@code int} estoura para {@code N} grande. Pense em {@code long}.</p>
 */
public class CrivoDeEratostenes {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
