package org.gabriel.pessoal.revisao.projetos;

/**
 * <h2>Projeto: caixa eletrônico com cédulas</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> enum, algoritmo guloso, {@code Scanner}, validação de entrada, encapsulamento</p>
 *
 * <h3>Objetivo</h3>
 * <p>Combinar um enum útil com um algoritmo clássico e um menu seguro.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Simule um caixa eletrônico. O enum {@code Cedula} (R$ 200, 100, 50, 20, 10, 5, 2) guarda o valor e a quantidade disponível no caixa. Um saque deve ser entregue com o menor número possível de cédulas, respeitando o estoque.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Algoritmo guloso: da maior para a menor cédula, usando {@code values()}.</li>
 *   <li>Se o valor não puder ser formado (ex.: R$ 3,00 sem notas de 1) ou faltar cédula, recusar com mensagem clara e sem alterar o estoque.</li>
 *   <li>Descobrir um valor em que o guloso falha mesmo existindo combinação possível com o estoque limitado, e documentar em comentário.</li>
 *   <li>Senha de 4 dígitos com no máximo 3 tentativas, depois bloqueio da conta.</li>
 *   <li>Menu: saldo, saque, depósito e extrato (últimas 5 operações).</li>
 *   <li>Entradas não numéricas não podem lançar exceção sem tratamento.</li>
 * </ul>
 */
public class CaixaEletronicoNoConsole {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
