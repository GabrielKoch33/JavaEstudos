package org.gabriel.pessoal.revisao.arrays;

/**
 * <h2>Boletim com matriz de notas</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code double[][]}, arrays paralelos, ordenação por índice, {@code foreach}, {@code printf}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Processar dados tabulares mantendo a associação entre nomes e linhas da matriz.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Você tem {@code String[] alunos} e {@code double[][] notas} (cada linha é um aluno; cada coluna, uma prova; todos com o mesmo número de provas). Gere o boletim: média de cada aluno, média da turma em cada prova, aluno com maior e menor média, e a situação final (média >= 7 aprovado; entre 5 e 7 recuperação; abaixo de 5 reprovado).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Imprimir uma tabela formatada com nomes alinhados à esquerda e notas com 1 casa decimal.</li>
 *   <li>Gerar um ranking dos alunos por média decrescente <b>sem perder o nome associado</b>: ordene um array de índices, não o array de notas.</li>
 *   <li>A matriz deve ter ao menos 6 alunos e 4 provas, e um dos alunos deve ter a nota mais alta apenas na última prova.</li>
 *   <li>Usar {@code foreach} onde não precisar do índice e {@code for} clássico onde precisar.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Descartar a menor nota de cada aluno antes de calcular a média, sem alterar a matriz original.</li>
 * </ul>
 */
public class BoletimComMatrizDeNotas {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
