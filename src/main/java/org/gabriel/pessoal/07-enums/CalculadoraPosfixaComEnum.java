package org.gabriel.pessoal.revisao.enums;

/**
 * <h2>Calculadora posfixa com enum de operações</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> {@code enum} com método abstrato por constante, busca por símbolo, pilha com array</p>
 *
 * <h3>Objetivo</h3>
 * <p>Combinar enum com comportamento próprio em cada constante e uma estrutura de pilha feita à mão.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie o enum {@code Operacao} (SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO, POTENCIA) com símbolo e um método abstrato {@code double aplicar(double a, double b)} implementado em cada constante.</p>
 * <p>Use-o em um avaliador de expressões em notação posfixa (RPN): {@code "3 4 + 2 *"} resulta em 14.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Método estático {@code Operacao.dePorSimbolo(String)} devolvendo a operação, ou {@code null}.</li>
 *   <li>Implementar uma pilha própria de {@code double} com array (empilhar, desempilhar, topo, vazia); sem {@code Stack} nem {@code ArrayDeque}.</li>
 *   <li>Tratar entradas inválidas: operandos insuficientes, token desconhecido, divisão por zero, pilha final com mais de um valor.</li>
 *   <li>Ler as expressões do {@code Scanner} até uma linha vazia.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * "3 4 + 2 *"      -&gt; 14.0
 * "5 1 2 + 4 * + 3 -" -&gt; 14.0
 * "1 +"             -&gt; erro: operandos insuficientes
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Converter uma expressão infixa em posfixa (algoritmo shunting-yard) e avaliar.</li>
 * </ul>
 */
public class CalculadoraPosfixaComEnum {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
