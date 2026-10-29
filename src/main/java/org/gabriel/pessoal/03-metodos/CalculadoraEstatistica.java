package org.gabriel.pessoal.revisao.metodos;

/**
 * <h2>Calculadora estatística com sobrecarga e varargs</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> sobrecarga, varargs, arrays, {@code Math}, promoção de tipos</p>
 *
 * <h3>Objetivo</h3>
 * <p>Praticar sobrecarga e varargs e entender como o compilador escolhe qual método chamar.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie uma classe utilitária com os métodos {@code media}, {@code mediana}, {@code moda} e {@code desvioPadrao}, cada um em duas versões sobrecarregadas: {@code int...} e {@code double...}. Crie também {@code maximo(int primeiro, int... demais)} e compare com {@code maximo(int...)}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Chamadas sem nenhum argumento devem devolver {@code Double.NaN} (documente).</li>
 *   <li>A mediana não pode alterar o array recebido: trabalhe em uma cópia.</li>
 *   <li>A moda deve devolver todos os valores empatados (pense no tipo de retorno).</li>
 *   <li>Escreva chamadas de teste com {@code int}, {@code double}, {@code byte}, {@code long} e array pronto, e comente qual versão foi escolhida em cada uma.</li>
 *   <li>Teste {@code media()} e {@code maximo()} sem argumentos, anote o que acontece (compila? é ambíguo?) e explique no comentário.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code percentil(double p, double... valores)} com interpolação linear.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>O compilador escolhe pela versão mais específica aplicável; descubra a ordem das fases (sem boxing, com boxing, com varargs).</p>
 */
public class CalculadoraEstatistica {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
