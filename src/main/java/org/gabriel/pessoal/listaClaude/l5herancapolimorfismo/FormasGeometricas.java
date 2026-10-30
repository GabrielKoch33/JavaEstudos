package org.gabriel.pessoal.revisao.heranca;

/**
 * <h2>Formas geométricas e ordenação por área</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> classe abstrata, herança multinível, polimorfismo, {@code instanceof} com padrão</p>
 *
 * <h3>Objetivo</h3>
 * <p>Modelar uma hierarquia com vários níveis e tratar tudo por um tipo base.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe abstrata {@code Forma} com {@code area()}, {@code perimetro()} e {@code nome()}. Filhas: {@code Circulo}, {@code Retangulo}, {@code Quadrado} (herdando de {@code Retangulo}) e {@code TrianguloRetangulo}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Um {@code Forma[]} misto com pelo menos 8 formas.</li>
 *   <li>Ordenar o array por área crescente com um algoritmo seu (não use {@code Arrays.sort}).</li>
 *   <li>Imprimir uma tabela alinhada: nome, área e perímetro com 2 casas decimais.</li>
 *   <li>Usar {@code instanceof} com padrão ({@code if (f instanceof Circulo c)}) para listar só os círculos e somar seus raios.</li>
 *   <li>O {@code Quadrado} deve impedir lados diferentes: o construtor só recebe um lado.</li>
 *   <li>Responder em comentário: faz sentido {@code Quadrado} herdar de {@code Retangulo} se as formas fossem mutáveis? (pesquise o princípio de substituição de Liskov).</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Transformar {@code Forma} em uma hierarquia {@code sealed} (Java 17+) e usar {@code switch} com padrões.</li>
 * </ul>
 */
public class FormasGeometricas {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
