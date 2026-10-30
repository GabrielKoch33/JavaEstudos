package org.gabriel.pessoal.listaClaude.l4poo;

/**
 * <h2>Conta bancária encapsulada</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> encapsulamento, construtores sobrecarregados, {@code this(...)}, {@code static}, {@code toString}, {@code equals}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Modelar uma classe com regras de negócio protegidas por encapsulamento.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Modele a classe {@code ContaBancaria} com número (gerado automaticamente de forma sequencial a partir de 1000), titular e saldo em <b>centavos</b> ({@code long}).</p>
 * <p>Operações: {@code depositar}, {@code sacar}, {@code transferir(ContaBancaria destino, long valor)}. Todas devolvem {@code boolean} indicando sucesso e registram a movimentação.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Todos os atributos {@code private}, sem {@code setSaldo}; o saldo só muda por operações.</li>
 *   <li>Dois construtores: um completo (titular e saldo inicial) e outro só com titular que delega com {@code this(titular, 0)}.</li>
 *   <li>Rejeitar valores zero ou negativos e saques acima do saldo.</li>
 *   <li>Manter o histórico das últimas 10 movimentações em um array circular (sobrescrevendo as mais antigas).</li>
 *   <li>{@code toString} formata o saldo em reais (ex.: <code>R$ 1.234,56</code>) a partir dos centavos.</li>
 *   <li>{@code equals} e {@code hashCode} baseados apenas no número da conta.</li>
 *   <li>No {@code main}, cobrir: transferência válida, saldo insuficiente, valor negativo e conta transferindo para ela mesma.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Cobrar tarifa de R$ 2,50 em transferências acima de R$ 1.000,00, sem duplicar a lógica.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Dinheiro em {@code double} acumula erro de arredondamento; por isso a exigência de centavos em {@code long}.</p>
 */
public class ContaBancaria {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
