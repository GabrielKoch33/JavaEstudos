/**
 * <h2>Interfaces + Polimorfismo</h2>
 *
 * <p>Crie a interface {@code Notificador} com o metodo {@code boolean enviar(String destino, String mensagem)}.</p>
 *
 * <p>Implementacoes:</p>
 * <ul>
 *   <li>{@code NotificadorEmail}: so envia se o destino contiver "@"; imprime a mensagem simulando o envio.</li>
 *   <li>{@code NotificadorSms}: so envia se o destino tiver 11 digitos e a mensagem ate 160 caracteres.</li>
 *   <li>{@code NotificadorPush}: sempre envia, prefixando a mensagem com "[PUSH]".</li>
 * </ul>
 *
 * <p>Crie a classe {@code CentralDeNotificacoes} que:</p>
 * <ol>
 *   <li>Recebe uma {@code List<Notificador>} pelo construtor (programe para a <b>interface</b>,
 *       nunca para as classes concretas).</li>
 *   <li>Tem o metodo {@code int disparar(String destino, String mensagem)}, que tenta todos os
 *       notificadores e retorna quantos conseguiram enviar.</li>
 *   <li>Tem o metodo {@code void adicionar(Notificador n)} para registrar novos canais.</li>
 * </ol>
 *
 * <p>No {@code main}:</p>
 * <ul>
 *   <li>Monte a central com os tres canais e dispare mensagens para destinos diferentes
 *       (um e-mail, um telefone).</li>
 *   <li>Crie um {@code Notificador} como <b>classe anonima</b> e outro como <b>lambda</b>
 *       (a interface possui um unico metodo abstrato) e adicione na central.</li>
 * </ul>
 *
 * <p><b>Pense:</b> o que voce precisaria alterar em {@code CentralDeNotificacoes} para adicionar
 * um novo canal (ex.: WhatsApp)? Se a resposta for "nada", o polimorfismo esta bem aplicado.</p>
 */
public class SistemaDeNotificacoes {

    public static void main(String[] args) {
        // TODO
    }
}
