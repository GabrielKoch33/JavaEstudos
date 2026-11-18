package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 04 — Local class e variáveis effectively final</h2>
 *
 * <p>Crie um método {@code static List<Integer> filtrarMultiplos(List<Integer> numeros, int divisor)}
 * que declare, DENTRO do método, uma <b>classe local</b> {@code FiltroDeMultiplos} com:</p>
 * <ul>
 *   <li>um método {@code boolean aceita(int n)} que usa a variável {@code divisor} do método
 *       (captura de variável);</li>
 *   <li>um contador interno de quantos números foram aceitos.</li>
 * </ul>
 *
 * <p>O método instancia a classe local, percorre a lista e retorna os números aceitos,
 * imprimindo o contador no final.</p>
 *
 * <p><b>Experimentos (anote os erros de compilação em comentário):</b></p>
 * <ol>
 *   <li>Altere o valor de {@code divisor} dentro do método DEPOIS de declarar a classe local.
 *       O que o compilador diz sobre "effectively final"?</li>
 *   <li>Tente declarar a classe local com o modificador {@code static} ou {@code public}. O que acontece?</li>
 *   <li>Tente usar a classe local fora do método.</li>
 * </ol>
 *
 * <p><b>Pense:</b> por que variáveis capturadas precisam ser final ou effectively final?
 * (Dica: pense no tempo de vida da variável local versus o do objeto.)</p>
 */
public class ClasseLocalEmMetodo {
    public static void main(String[] args) {
        // TODO
    }
}
