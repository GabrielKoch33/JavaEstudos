package org.gabriel.pessoal.revisao.heranca;

/**
 * <h2>Upcast, downcast e a escolha de métodos sobrecarregados</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> upcast, downcast, {@code ClassCastException}, {@code getClass}, tipo estático vs dinâmico</p>
 *
 * <h3>Objetivo</h3>
 * <p>Diferenciar o tipo da variável (em tempo de compilação) do tipo do objeto (em tempo de execução).</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie {@code Animal}, {@code Cachorro} e {@code Gato}, cada um com {@code emitirSom()} e a filha com um método exclusivo ({@code buscarBolinha()} no cachorro, {@code arranharSofa()} no gato).</p>
 * <p>Crie também uma classe com três métodos sobrecarregados {@code descrever(Animal a)}, {@code descrever(Cachorro c)} e {@code descrever(Object o)}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Chamar o método exclusivo a partir de uma variável {@code Animal} e transcrever o erro do compilador.</li>
 *   <li>Fazer o downcast seguro com {@code instanceof} e o inseguro, provocando e capturando a {@code ClassCastException}.</li>
 *   <li>Chamar {@code descrever} com uma variável declarada como {@code Animal} que aponta para um {@code Cachorro} e explicar por que a escolha da sobrecarga ignora o tipo real.</li>
 *   <li>Mostrar a diferença entre {@code instanceof} e {@code getClass() ==} usando um objeto de subclasse.</li>
 *   <li>Passar {@code null} para os três métodos sobrecarregados e explicar qual é escolhido e por quê.</li>
 * </ul>
 */
public class ConversaoDeReferencias {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
