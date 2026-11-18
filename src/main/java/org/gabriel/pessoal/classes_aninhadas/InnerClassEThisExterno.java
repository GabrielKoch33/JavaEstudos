package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 03 — Instanciação de inner, shadowing e Outer.this</h2>
 *
 * <p>Crie a classe {@code Externa} com o campo {@code String nome = "externa"} e uma inner class
 * {@code Interna} com o campo {@code String nome = "interna"}.</p>
 *
 * <p>Na {@code Interna}, crie um método {@code revelar(String nome)} que receba um parâmetro
 * também chamado {@code nome} e imprima os TRÊS valores:</p>
 * <ul>
 *   <li>o parâmetro ({@code nome});</li>
 *   <li>o campo da própria inner ({@code this.nome});</li>
 *   <li>o campo da classe externa ({@code Externa.this.nome}).</li>
 * </ul>
 *
 * <p>No {@code main}, instancie a inner de DUAS formas:</p>
 * <ol>
 *   <li>criando antes um objeto externo: {@code Externa e = new Externa(); Externa.Interna i = e.new Interna();}</li>
 *   <li>por um método {@code criarInterna()} dentro da própria Externa.</li>
 * </ol>
 *
 * <p>Depois, crie DUAS instâncias de Externa com nomes diferentes e uma inner de cada uma;
 * mostre que cada inner enxerga a SUA externa.</p>
 *
 * <p><b>Responda:</b> por que {@code new Externa.Interna()} não compila quando Interna não é static?</p>
 */
public class InnerClassEThisExterno {
    public static void main(String[] args) {
        // TODO
    }
}
