/**
 * <h2>Widening e Narrowing Cast</h2>
 *
 * <p>Crie a hierarquia: {@code Veiculo} (com {@code placa} e {@code acelerar()}), e as subclasses
 * {@code Carro} (com {@code abrirPortaMalas()}) e {@code Moto} (com {@code empinar()}).</p>
 *
 * <p>No {@code main}, resolva em ordem:</p>
 * <ol>
 *   <li><b>Widening:</b> atribua um {@code Carro} a uma variavel do tipo {@code Veiculo} (sem cast).
 *       Tente chamar {@code abrirPortaMalas()} por ela e anote o erro de compilacao como comentario.</li>
 *   <li><b>Narrowing:</b> converta essa mesma variavel de volta para {@code Carro} com cast explicito
 *       e chame {@code abrirPortaMalas()}.</li>
 *   <li><b>ClassCastException:</b> crie uma {@code Moto} referenciada como {@code Veiculo}, tente
 *       fazer cast para {@code Carro} e capture a excecao com {@code try/catch}.</li>
 *   <li><b>instanceof:</b> escreva o metodo {@code static void operar(Veiculo v)} que acelera o veiculo
 *       e, usando {@code instanceof} com pattern matching ({@code v instanceof Carro c}),
 *       executa a acao especifica de cada tipo com seguranca.</li>
 *   <li><b>Primitivos:</b> faca widening ({@code int} para {@code double}) e narrowing
 *       ({@code double} para {@code int}, e {@code int} para {@code byte} com valor 200).
 *       Imprima os resultados e explique em comentario o que aconteceu com a perda de dados.</li>
 * </ol>
 *
 * <p><b>Pense:</b> o que muda na <i>referencia</i> e o que continua igual no <i>objeto</i>
 * quando voce faz o cast?</p>
 */
public class ConversaoDeTiposEmVeiculos {

    public static void main(String[] args) {
        // TODO
    }
}
