package org.gabriel.pessoal.revisao.heranca;

/**
 * <h2>Sobrescrita, ocultação e armadilhas de construtores</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> sobrescrita, ocultação de campos e métodos estáticos, ordem dos construtores, {@code protected}, pacotes</p>
 *
 * <h3>Objetivo</h3>
 * <p>Expor as diferenças sutis entre sobrescrever e ocultar, e o perigo de chamar métodos sobrescrevíveis no construtor.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Monte a hierarquia {@code Pai} e {@code Filho} e <b>escreva a previsão</b> antes de rodar cada caso:</p>
 * <p>(1) campo com o mesmo nome nas duas classes, acessado por uma variável do tipo {@code Pai} que referencia um {@code Filho}; (2) método de instância sobrescrito, chamado pelo mesmo tipo de variável; (3) método {@code static} com a mesma assinatura nas duas classes (oculta, não sobrescreve), chamado pela mesma variável; (4) construtor do {@code Pai} que chama um método sobrescrito pelo {@code Filho}, onde o método da filha lê um campo da filha ainda não inicializado; (5) sobrescrita ampliando a visibilidade ({@code protected} para {@code public}) e a tentativa de reduzir.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Colocar {@code Pai} e {@code Filho} em pacotes diferentes e comprovar o que {@code protected} permite e proíbe, tanto por herança quanto por uma instância do pai.</li>
 *   <li>Mostrar em comentário a saída real e uma explicação curta para cada caso.</li>
 *   <li>Explicar por que chamar método sobrescrevível dentro de construtor é considerado má prática.</li>
 * </ul>
 */
public class SobrescritaOcultacaoEConstrutores {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
