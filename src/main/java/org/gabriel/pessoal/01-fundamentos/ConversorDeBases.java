package org.gabriel.pessoal.revisao.fundamentos;

/**
 * <h2>Conversor de bases numéricas</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> divisão e resto, {@code StringBuilder}, {@code char}, laços, validação de entrada</p>
 *
 * <h3>Objetivo</h3>
 * <p>Entender de fato como funciona a representação posicional convertendo números entre bases sem usar as funções prontas do Java.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Implemente {@code static String paraBase(long n, int base)} e {@code static long deBase(String s, int base)} para bases de 2 a 16.</p>
 * <p>Os dígitos acima de 9 usam as letras <code>A</code> a <code>F</code>. Números negativos devem manter o sinal.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Proibido usar {@code Integer.toString(n, base)}, {@code Integer.toBinaryString}, {@code Long.parseLong(s, base)} e similares na solução.</li>
 *   <li>Se a base estiver fora de 2..16, ou a string tiver dígito inválido para a base, devolva {@code null} (ou {@code Long.MIN_VALUE} em {@code deBase}) e documente a escolha.</li>
 *   <li>No {@code main}, faça um autoteste: gere 1000 números aleatórios, converta ida e volta em todas as bases e confirme que o resultado é igual ao original.</li>
 *   <li>Depois do autoteste, compare sua saída com {@code Integer.toString(n, base)} (agora liberado) para validar.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * paraBase(255, 2)   -&gt; "11111111"
 * paraBase(255, 16)  -&gt; "FF"
 * paraBase(-42, 8)   -&gt; "-52"
 * deBase("1A", 16)   -&gt; 26
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Implementar {@code static String somarEmBase(String a, String b, int base)} somando dígito a dígito, sem converter para decimal.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Para montar a string do resto para o quociente, acumule no {@code StringBuilder} e use {@code reverse()} no fim.</p>
 */
public class ConversorDeBases {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
