package org.gabriel.pessoal.revisao.poo;

/**
 * <h2>Ordem de inicialização de classes e objetos</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> blocos {@code static}, blocos de instância, inicializadores de campo, construtores, {@code this(...)}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Prever com precisão a ordem em que o Java executa cada parte de uma classe.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe {@code Rastreador} com: um campo estático com inicializador, um bloco {@code static}, um campo de instância com inicializador, um bloco de instância e três construtores encadeados com {@code this(...)}. Cada um deve imprimir uma mensagem identificando-se.</p>
 * <p>Antes de executar, escreva a ordem esperada para: (1) o primeiro {@code new Rastreador()}; (2) o segundo {@code new Rastreador()}; (3) um acesso a um campo {@code static} sem criar objeto.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Um comentário com a previsão antes de cada trecho de teste.</li>
 *   <li>Provar que o bloco {@code static} roda uma única vez, mesmo com vários objetos.</li>
 *   <li>Provar que o bloco {@code static} só roda quando a classe é usada pela primeira vez (e não ao iniciar o programa).</li>
 *   <li>Mostrar o que acontece quando um inicializador de campo usa um campo declarado <i>depois</i> dele.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Repetir o experimento com uma classe filha e descobrir a ordem completa pai/filha (estático, instância, construtor).</li>
 * </ul>
 */
public class OrdemDeInicializacao {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
