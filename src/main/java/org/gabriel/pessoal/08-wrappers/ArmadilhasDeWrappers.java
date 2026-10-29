package org.gabriel.pessoal.revisao.wrappers;

/**
 * <h2>Wrappers, autoboxing e pegadinhas</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code Integer}, {@code Long}, {@code Character}, autoboxing, cache, {@code NullPointerException}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Compreender o que o compilador faz por trás do autoboxing e onde isso morde.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Para cada situação, escreva a previsão antes de rodar e explique o resultado depois:</p>
 * <p>(1) {@code Integer a = 127, b = 127;} e {@code Integer c = 128, d = 128;} comparados com {@code ==} e com {@code equals}; (2) {@code Integer x = null; int y = x;}; (3) {@code Long l = 1L; l.equals(1)}; (4) {@code new Integer} (obsoleto) versus {@code Integer.valueOf}; (5) soma de {@code Integer} em um laço de 10 milhões de iterações versus {@code int}, medindo o tempo; (6) {@code Character.isDigit}, {@code isLetter}, {@code toUpperCase}; (7) {@code Integer.parseInt("12a")}; (8) {@code Double.compare(0.0, -0.0)} versus {@code 0.0 == -0.0}; (9) {@code Integer.MAX_VALUE} e {@code Integer.MIN_VALUE} com {@code Math.abs}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Um método por situação.</li>
 *   <li>Capturar as exceções e imprimir a mensagem delas, para ver o que o Java informa.</li>
 *   <li>Escrever em comentário uma regra prática para comparar wrappers.</li>
 *   <li>No item (5), explicar o custo do boxing repetido.</li>
 * </ul>
 */
public class ArmadilhasDeWrappers {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
