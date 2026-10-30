package org.gabriel.pessoal.listaClaude.l6interfaces;

/**
 * <h2>Comparable, Comparator e ordenação com vários critérios</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code Comparable}, {@code Comparator}, classes anônimas, {@code Arrays.sort}, estabilidade</p>
 *
 * <h3>Objetivo</h3>
 * <p>Usar as interfaces padrão do Java para ordenar objetos.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie {@code Aluno} (nome, matrícula, média, idade) implementando {@code Comparable<Aluno>} com ordem natural por matrícula. Em seguida, crie comparadores para: nome (sem diferenciar maiúsculas), média decrescente, e média decrescente com desempate por nome.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Ordenar um {@code Aluno[]} com {@code Arrays.sort(array)} (ordem natural) e com {@code Arrays.sort(array, comparador)}.</li>
 *   <li>Implementar os comparadores primeiro como classes separadas, depois como classes anônimas.</li>
 *   <li>Garantir que {@code compareTo} seja consistente com {@code equals} e explicar em comentário o que acontece se não for.</li>
 *   <li>Não usar subtração para comparar ({@code a.idade - b.idade}); explicar o risco de overflow e usar {@code Integer.compare}.</li>
 *   <li>Demonstrar a estabilidade da ordenação: ordene por média e depois por nome e observe o resultado.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Reescrever os comparadores com expressões lambda e {@code Comparator.comparing(...).thenComparing(...)}.</li>
 * </ul>
 */
public class ComparavelEOrdenacao {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
