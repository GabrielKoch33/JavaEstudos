package org.gabriel.pessoal.listaClaude.l5herancapolimorfismo;

/**
 * <h2>O contrato de equals e hashCode com herança</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> {@code equals}, {@code hashCode}, simetria, transitividade, {@code getClass} vs {@code instanceof}</p>
 *
 * <h3>Objetivo</h3>
 * <p>Entender por que implementar {@code equals} corretamente em hierarquias é difícil.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie {@code Ponto} (x, y) e {@code PontoColorido extends Ponto} (com cor). Implemente {@code equals} e {@code hashCode} em ambos.</p>
 * <p>Primeiro faça uma versão com {@code instanceof} e demonstre, por código, que a <b>simetria</b> é violada ({@code p.equals(pc)} diferente de {@code pc.equals(p)}). Depois corrija usando {@code getClass()} e demonstre que agora as propriedades valem.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Provar por código as cinco propriedades: reflexiva, simétrica, transitiva, consistente e {@code equals(null)} falso.</li>
 *   <li>{@code hashCode} compatível: objetos iguais precisam ter o mesmo hash. Demonstre o que quebra se você sobrescrever só {@code equals}.</li>
 *   <li>Ao final, escrever em comentário por que composição (um {@code Ponto} dentro do {@code PontoColorido}) evita o problema.</li>
 * </ul>
 */
public class ContratoDeEquals {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
