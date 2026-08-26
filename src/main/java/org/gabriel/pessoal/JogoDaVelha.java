package org.gabriel.pessoal;

public class JogoDaVelha {

/**
 * Jogo da Velha — Verificador de Vencedor
 * Declare uma matriz char[3][3] já preenchida manualmente com 'X', 'O' e espaços vazios simulando um tabuleiro finalizado.
 * Escreva a lógica que verifica se houve vencedor, checando:
 *         - as 3 linhas
 *         - as 3 colunas
 *         - as 2 diagonais
 * Teste com pelo menos 3 tabuleiros diferentes (vitória em linha, em diagonal, e empate).
 * Pesquise: como percorrer diagonais de uma matriz usando índices — repare no padrão entre matriz[i][i] e a diagonal secundária.
**/
    public void verificaVencedor(){
        char[][] matriz = new char[3][3];
        // matriz = {{1,2,3},{4,5,6},{7,8,9}}

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }
    }
}
