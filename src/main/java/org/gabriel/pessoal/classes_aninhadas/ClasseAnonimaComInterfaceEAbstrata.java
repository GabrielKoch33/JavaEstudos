package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 05 — Anonymous classes</h2>
 *
 * <p>Crie a interface {@code Desconto} ({@code double aplicar(double valor)}) e a classe abstrata
 * {@code Notificador} (construtor que recebe {@code String canal}; método abstrato {@code enviar(String msg)}).</p>
 *
 * <p>No {@code main}, SEM criar classes nomeadas que as implementem:</p>
 * <ol>
 *   <li>crie 3 descontos usando <b>classes anônimas</b>: 10% fixo, "leve 3 pague 2" e um desconto
 *       que usa uma variável local effectively final capturada (ex.: percentual lido de uma variável);</li>
 *   <li>crie 2 notificadores anônimos estendendo a abstrata e chamando o construtor com argumento
 *       ({@code new Notificador("email") { ... }});</li>
 *   <li>ordene uma {@code List<String>} por tamanho usando um {@code Comparator<String>} anônimo.</li>
 * </ol>
 *
 * <p>Depois, REESCREVA o item 1 e o Comparator com <b>lambdas</b> e compare.</p>
 *
 * <p><b>Responda em comentário:</b></p>
 * <ol>
 *   <li>Por que um lambda NÃO substitui a anônima de {@code Notificador}?</li>
 *   <li>O que {@code this} significa dentro de uma anônima vs. dentro de um lambda?</li>
 *   <li>Qual o nome do arquivo .class gerado para uma anônima? (Rode e veja a pasta de saída.)</li>
 * </ol>
 */
public class ClasseAnonimaComInterfaceEAbstrata {
    public static void main(String[] args) {
        // TODO
    }
}
