package org.gabriel.pessoal.revisao.fundamentos;

/**
 * <h2>Campo minado: números e revelação</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> matriz {@code char[][]}, vizinhança, limites de array, recursão simples</p>
 *
 * <h3>Objetivo</h3>
 * <p>Trabalhar com matrizes bidimensionais, controle de limites e recursão numa mecânica de jogo real.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Receba um tabuleiro como {@code String[]} (cada linha é uma string; <code>*</code> é mina e <code>.</code> é vazio). Converta para {@code char[][]} e substitua cada célula vazia pela quantidade de minas nas 8 casas vizinhas (vazio com 0 vizinhas continua <code>.</code>).</p>
 * <p>Depois implemente {@code revelar(linha, coluna)}: se a célula revelada tiver 0 minas vizinhas, revele recursivamente todas as vizinhas (como o jogo real).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Não deixar nenhum acesso fora dos limites: encapsule a checagem em {@code static boolean dentro(int l, int c, char[][] m)}.</li>
 *   <li>Manter duas matrizes: a de valores (gabarito) e a visível ao jogador (<code>#</code> para oculto).</li>
 *   <li>Imprimir a matriz visível com os índices de linha e coluna nas bordas.</li>
 *   <li>Se o jogador revelar uma mina, imprimir o tabuleiro completo e encerrar.</li>
 * </ul>
 *
 * <h3>Exemplo</h3>
 * <pre>
 * Entrada:        Gabarito:
 * ..*..           01*10
 * .....           12321
 * .*...           1*100
 * </pre>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Gerar o tabuleiro aleatoriamente a partir de linhas, colunas e quantidade de minas, garantindo que a primeira jogada nunca seja uma mina.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Use dois vetores {@code int[] dl = {-1,-1,-1,0,0,1,1,1}} e {@code dc} para percorrer os vizinhos sem repetir 8 {@code if}.</p>
 */
public class CampoMinadoContador {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
