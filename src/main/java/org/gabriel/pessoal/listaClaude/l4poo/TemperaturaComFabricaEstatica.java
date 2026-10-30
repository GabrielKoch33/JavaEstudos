package org.gabriel.pessoal.listaClaude.l4poo;

/**
 * <h2>Temperatura com fábricas estáticas e constantes</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code static}, {@code final}, construtor privado, fábricas estáticas, classe utilitária</p>
 *
 * <h3>Objetivo</h3>
 * <p>Entender o que pertence à classe e o que pertence ao objeto.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie {@code Temperatura} imutável guardando sempre o valor em Kelvin. O construtor é {@code private}; a criação acontece por {@code deCelsius}, {@code deFahrenheit} e {@code deKelvin}. Métodos {@code emCelsius()}, {@code emFahrenheit()}, {@code emKelvin()}.</p>
 * <p>Crie também {@code Validacoes}, uma classe utilitária (construtor privado, só métodos estáticos) com ao menos 3 validadores reutilizáveis.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Constantes {@code public static final} para o zero absoluto e os pontos de congelamento e ebulição da água.</li>
 *   <li>Temperaturas abaixo do zero absoluto são rejeitadas.</li>
 *   <li>Um contador estático de quantas temperaturas já foram criadas.</li>
 *   <li>Um bloco {@code static} que pré-cria e guarda as constantes {@code ZERO_ABSOLUTO} e {@code AMBIENTE}.</li>
 *   <li>No {@code main}, chamar um método estático por meio de uma instância, ver o aviso do compilador e comentar por que é má prática.</li>
 *   <li>Tentar acessar um membro de instância de dentro de um método estático e transcrever o erro.</li>
 * </ul>
 */
public class TemperaturaComFabricaEstatica {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
