/**
 * <h2>Polimorfismo (sobrescrita)</h2>
 *
 * <p>Crie a classe {@code Funcionario} com {@code nome} e {@code salarioBase}, e o metodo
 * {@code calcularSalarioFinal()}, que por padrao retorna apenas o salario base.</p>
 *
 * <p>Crie as subclasses:</p>
 * <ul>
 *   <li>{@code Gerente}: salario final = base + 20% de bonus + R$ 500 por subordinado
 *       (atributo {@code quantidadeSubordinados}).</li>
 *   <li>{@code Desenvolvedor}: salario final = base + R$ 150 por projeto entregue
 *       (atributo {@code projetosEntregues}).</li>
 *   <li>{@code Estagiario}: nao sobrescreve nada (usa o comportamento padrao).</li>
 * </ul>
 *
 * <p>No {@code main}:</p>
 * <ol>
 *   <li>Crie um array {@code Funcionario[]} com pelo menos um objeto de cada tipo.</li>
 *   <li>Percorra o array imprimindo nome e salario final de cada um, <b>sem usar
 *       {@code instanceof}</b>.</li>
 *   <li>Calcule e imprima o total da folha de pagamento.</li>
 *   <li>Sobrescreva {@code toString()} nas subclasses e use {@code @Override} em tudo.</li>
 * </ol>
 *
 * <p><b>Pense:</b> qual versao de {@code calcularSalarioFinal()} e chamada e quem decide isso
 * (tempo de compilacao ou de execucao)?</p>
 */
public class FolhaDePagamento {

    public static void main(String[] args) {
        // TODO
    }
}
