package org.gabriel.pessoal.revisao.heranca;

/**
 * <h2>Folha de pagamento polimórfica</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> herança, classe abstrata, {@code super}, {@code protected}, polimorfismo, sobrescrita</p>
 *
 * <h3>Objetivo</h3>
 * <p>Usar herança e polimorfismo para tratar tipos diferentes de funcionário por uma interface comum.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie a classe abstrata {@code Funcionario} (nome, matrícula, salário-base em centavos) com o método abstrato {@code calcularSalario()}. Subclasses: {@code Gerente} (bônus fixo + participação por meta), {@code Vendedor} (comissão sobre vendas) e {@code Horista} (valor/hora, horas trabalhadas, hora extra com adicional de 50% acima de 160 horas).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Construtores das filhas chamam o do pai com {@code super(...)}.</li>
 *   <li>Guardar todos os funcionários em um único {@code Funcionario[]} e gerar a folha com um laço que não usa {@code instanceof}.</li>
 *   <li>{@code toString} sobrescrito na base e <b>estendido</b> nas filhas com {@code super.toString()}.</li>
 *   <li>Cada subclasse anotada com {@code @Override} nos métodos sobrescritos.</li>
 *   <li>Um método {@code static double maiorSalario(Funcionario[] fs)} e outro que devolve o total da folha.</li>
 *   <li>Provar que {@code new Funcionario(...)} não compila e transcrever o erro em comentário.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Adicionar {@code Estagiario} sem alterar nenhuma linha do código que gera a folha.</li>
 * </ul>
 */
public class FolhaDePagamentoPolimorfica {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
