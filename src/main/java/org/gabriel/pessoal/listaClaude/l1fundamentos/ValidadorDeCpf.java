package org.gabriel.pessoal.revisao.fundamentos;

/**
 * <h2>Validador de CPF</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code String}, {@code char}, aritmética com caracteres, laços, métodos {@code static}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Implementar do zero o algoritmo de validação de CPF, sem bibliotecas externas.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie o método {@code static boolean valido(String cpf)}. Ele deve aceitar o CPF com ou sem pontuação (<code>529.982.247-25</code> ou <code>52998224725</code>).</p>
 * <p>O cálculo dos dígitos verificadores usa pesos decrescentes: o 1º dígito usa os pesos 10 a 2 sobre os 9 primeiros dígitos; o 2º usa os pesos 11 a 2 sobre os 10 primeiros. Somam-se os produtos e calcula-se o resto da divisão por 11; se o resto for menor que 2 o dígito é 0, senão é {@code 11 - resto}.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Rejeitar strings com tamanho diferente de 11 dígitos (após remover a pontuação).</li>
 *   <li>Rejeitar entradas com caracteres que não sejam dígitos, pontos ou hífen.</li>
 *   <li>Rejeitar CPFs com todos os dígitos iguais (<code>111.111.111-11</code> passa na conta, mas é inválido).</li>
 *   <li>Converter caractere em número com {@code c - '0'}, sem usar {@code Integer.parseInt} em cada caractere.</li>
 *   <li>Separar a lógica em métodos pequenos: {@code limpar}, {@code calcularDigito} e {@code valido}.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * valido("529.982.247-25") -&gt; true
 * valido("52998224725")    -&gt; true
 * valido("111.111.111-11") -&gt; false
 * valido("529.982.247-24") -&gt; false
 * valido("abc")            -&gt; false
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Criar {@code String gerar()} que devolve um CPF válido aleatório já formatado.</li>
 *   <li>Ler CPFs do {@code Scanner} até o usuário digitar <code>sair</code>.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Você não precisa de regex; um laço por {@code charAt} e um {@code StringBuilder} resolvem a limpeza.</p>
 */
public class ValidadorDeCpf {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
