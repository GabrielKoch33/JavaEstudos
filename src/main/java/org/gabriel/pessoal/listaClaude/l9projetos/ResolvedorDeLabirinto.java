package org.gabriel.pessoal.revisao.projetos;

/**
 * <h2>Projeto: resolvedor de labirinto</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> matriz {@code char[][]}, recursão com retrocesso, fila própria com array</p>
 *
 * <h3>Objetivo</h3>
 * <p>Aplicar recursão e matrizes a um problema de busca.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Receba um labirinto como {@code String[]} (<code>#</code> parede, <code>.</code> caminho livre, <code>S</code> início, <code>E</code> saída). Encontre um caminho da entrada à saída usando recursão com retrocesso (backtracking) e marque o caminho com <code>*</code>.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Mover-se nas 4 direções, sem passar duas vezes pela mesma célula (marcar visitadas).</li>
 *   <li>Desmarcar a célula ao retroceder; o caminho final só pode conter o que de fato leva à saída.</li>
 *   <li>Se não houver caminho, informar isso claramente.</li>
 *   <li>Imprimir o labirinto original e o resolvido, e a quantidade de passos do caminho encontrado.</li>
 *   <li>Testar com labirinto sem solução, com solução única, e um com vários caminhos.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * #######
 * #S..#.#
 * #.#...#
 * #.#.#E#
 * #######
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Encontrar o <b>menor</b> caminho usando busca em largura com uma fila implementada com array.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>O caminho achado pelo backtracking não é necessariamente o mais curto; é isso que o desafio extra corrige.</p>
 */
public class ResolvedorDeLabirinto {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
