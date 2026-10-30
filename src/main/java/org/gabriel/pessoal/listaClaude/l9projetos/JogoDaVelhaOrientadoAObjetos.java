package org.gabriel.pessoal.revisao.projetos;

/**
 * <h2>Projeto: jogo da velha orientado a objetos</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> classes e responsabilidades, matriz, enum, encapsulamento, laço de jogo</p>
 *
 * <h3>Objetivo</h3>
 * <p>Separar bem responsabilidades entre classes ao modelar um jogo.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Implemente o jogo da velha de console com as classes {@code Tabuleiro}, {@code Jogador}, {@code Jogo} e o enum {@code Marca} (X, O, VAZIO).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>O {@code Tabuleiro} cuida só do estado e das regras de posição ({@code marcar}, {@code estaLivre}, {@code venceu(Marca)}, {@code cheio}).</li>
 *   <li>O {@code Jogo} cuida do fluxo: alternar jogadores, ler jogadas, detectar vitória e empate.</li>
 *   <li>Validar jogadas fora do tabuleiro ou em posição ocupada, pedindo de novo.</li>
 *   <li>A detecção de vitória não pode ter oito {@code if} copiados: use laços sobre linhas, colunas e diagonais.</li>
 *   <li>Tabuleiro de tamanho N configurável (3 por padrão), com vitória por N em linha.</li>
 *   <li>Placar acumulado ao longo de várias partidas e pergunta se quer jogar de novo.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Jogador computador que bloqueia a vitória do adversário e, quando possível, vence.</li>
 * </ul>
 */
public class JogoDaVelhaOrientadoAObjetos {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
