package org.gabriel.pessoal.revisao.poo;

/**
 * <h2>Construtor fluente de consultas SQL</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code this} como retorno, encadeamento de métodos, {@code StringBuilder}, arrays de condições</p>
 *
 * <h3>Objetivo</h3>
 * <p>Praticar o padrão fluente (builder), onde cada método devolve o próprio objeto.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe {@code ConsultaSql} que monte um {@code SELECT} por encadeamento: {@code select(...)}, {@code from(...)}, {@code where(...)}, {@code and(...)}, {@code or(...)}, {@code orderBy(...)}, {@code limit(int)} e finalmente {@code build()}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Todos os métodos intermediários devolvem {@code this}.</li>
 *   <li>{@code select} aceita varargs; sem argumentos usa <code>*</code>.</li>
 *   <li>Deve ser possível chamar os métodos em qualquer ordem e o {@code build()} sempre monta a ordem correta da cláusula.</li>
 *   <li>Sem {@code from} o {@code build()} deve falhar com {@code IllegalStateException}.</li>
 *   <li>Guardar as condições em um array que cresce sozinho.</li>
 *   <li>Escapar aspas simples nos valores literais para evitar o problema clássico de injeção (explique no comentário por que isso <b>não</b> substitui consultas parametrizadas).</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * new ConsultaSql().select("nome", "idade").from("alunos")
 *     .where("idade &gt;= 18").and("ativo = true").orderBy("nome").limit(10).build();
 * -&gt; SELECT nome, idade FROM alunos WHERE idade &gt;= 18 AND ativo = true ORDER BY nome LIMIT 10
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Suportar {@code join(tabela, condicao)} e {@code groupBy}.</li>
 * </ul>
 */
public class ConstrutorDeConsultaSql {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
