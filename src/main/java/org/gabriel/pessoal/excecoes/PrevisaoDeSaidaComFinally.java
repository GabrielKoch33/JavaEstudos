/**
 * <h2>Exceções 06 — Prever a saída (finally, return, ordem de execução)</h2>
 *
 * <p>Para cada método abaixo, ESCREVA no comentário a saída esperada ANTES de executar.
 * Depois implemente, rode e compare.</p>
 *
 * <ol>
 *   <li>{@code int a()}: try com {@code return 1;} e finally com {@code System.out.println("finally")}.</li>
 *   <li>{@code int b()}: try com {@code return 1;} e finally com {@code return 2;}.
 *       Qual valor retorna? Por que isso é considerado má prática?</li>
 *   <li>{@code int c()}: variável {@code int x = 10;}, try faz {@code return x;} e finally faz {@code x = 20;}.
 *       Qual valor retorna?</li>
 *   <li>{@code void d()}: try lança {@link RuntimeException}("A"), finally lança {@link RuntimeException}("B").
 *       Qual exceção chega ao chamador? O que aconteceu com a outra?</li>
 *   <li>{@code void e()}: try-catch-finally aninhado (try dentro do catch) com prints numerados para
 *       entender a ordem exata de execução.</li>
 *   <li>{@code void f()}: o que acontece com o finally se o try chamar {@code System.exit(0)}?</li>
 * </ol>
 *
 * <p>Monte uma tabelinha em comentário: "previsto vs. real" e anote o que errou.</p>
 */
public class PrevisaoDeSaidaComFinally {
    public static void main(String[] args) {
        // TODO
    }
}
