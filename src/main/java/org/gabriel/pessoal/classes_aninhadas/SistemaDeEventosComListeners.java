package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 08 — Desafio: sistema de eventos com listeners</h2>
 *
 * <p>Crie um {@code BotaoVirtual} (nome) que aceita vários listeners e os dispara ao chamar
 * {@code clicar()}.</p>
 *
 * <ul>
 *   <li>Interface <b>nested</b> {@code BotaoVirtual.OnClickListener} com {@code void aoClicar(BotaoVirtual origem)}.</li>
 *   <li>{@code adicionarListener(OnClickListener)} e {@code removerListener(OnClickListener)}.</li>
 *   <li>Uma <b>inner class</b> {@code Historico} que registra, dentro do botão, cada clique
 *       (contagem e horário via {@link java.time.LocalTime}) e permite consultar os últimos N.</li>
 * </ul>
 *
 * <p>No {@code main}, registre listeners de TODOS os tipos para o mesmo botão:</p>
 * <ol>
 *   <li>uma <b>anônima</b> que imprime "Clicou em [nome]";</li>
 *   <li>uma <b>classe local</b> declarada no {@code main} que conta cliques e se remove ao chegar a 3
 *       (cuidado ao remover durante a iteração: {@link java.util.ConcurrentModificationException}!);</li>
 *   <li>uma <b>static nested</b> {@code ContadorGlobal} (fora do botão, ou dentro do arquivo) que soma
 *       cliques em um contador estático;</li>
 *   <li>um <b>lambda</b> que imprime o horário.</li>
 * </ol>
 *
 * <p>Clique 5 vezes e verifique o comportamento. Resolva o problema da
 * {@code ConcurrentModificationException} iterando sobre uma cópia da lista.</p>
 *
 * <p><b>Reflita em comentário:</b> quando você escolheria cada tipo (nested, inner, local, anônima, lambda)
 * no mundo real? Escreva uma regra de bolso para cada um.</p>
 */
public class SistemaDeEventosComListeners {
    public static void main(String[] args) {
        // TODO
    }
}
