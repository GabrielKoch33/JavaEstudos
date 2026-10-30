package org.gabriel.pessoal.revisao.metodos;

/**
 * <h2>Passagem de parâmetros: valor, referência e imutabilidade</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> passagem por valor, referências, {@code String} imutável, {@code final}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Eliminar de vez a dúvida clássica: o Java passa tudo por valor, inclusive referências.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe interna estática {@code Pessoa} (com {@code nome} e {@code idade}) e os métodos abaixo. Antes de executar, <b>escreva a previsão</b> do que o {@code main} imprime em cada caso:</p>
 * <p>(1) {@code incrementar(int x)}; (2) {@code preencher(int[] v)} que altera um elemento; (3) {@code trocar(int[] v)} que faz {@code v = new int[]{9,9}}; (4) {@code envelhecer(Pessoa p)} que altera um campo; (5) {@code substituir(Pessoa p)} que faz {@code p = new Pessoa(...)}; (6) {@code maiuscula(String s)} que faz {@code s = s.toUpperCase()}; (7) um {@code swap(int a, int b)} que não troca nada; (8) {@code swap(int[] v, int i, int j)} que troca de verdade.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Um método por caso e uma linha de {@code System.out.println} no {@code main} mostrando o valor antes e depois.</li>
 *   <li>Ao final, escreva um comentário de 3 linhas com a regra geral do Java para passagem de parâmetros.</li>
 *   <li>Explicar no comentário por que {@code String} parece se comportar como tipo por valor.</li>
 *   <li>Mostrar como um método pode proteger o parâmetro com {@code final} e o que isso realmente impede.</li>
 * </ul>
 */
public class PassagemDeParametros {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
