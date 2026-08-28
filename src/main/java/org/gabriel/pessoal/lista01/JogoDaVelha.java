package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class JogoDaVelha {

    // private = somente essa classe tem acesso ao método (Visibilidade);
    // static = não é necessário instânciar um objeto para usar o método (Comportamento & Herança);
    // int = substitui o 'void' e indica qual o tipo de retorno do método;
    private static int verificaLinha(char[][] matriz) {

        for (int l = 0; l < matriz.length; l++) {
            char firstValue = matriz[l][0];
            boolean isRowValid = true;
            for (int c = 1; c < matriz[l].length; c++) {
                if (matriz[l][c] != firstValue) {
                    isRowValid = false;
                    break; // sai do loop interno;
                }
            }
            if (isRowValid) {
                return l + 1; // l + 1 para visualmente mais fail para o usuário; ex = [0] -> linha 1
            }
        }
        return 0;
    }

    private static int verificaColuna(char[][] matriz) {
        for (int c = 0; c < matriz.length; c++) {
            char firstValue = matriz[0][c];
            boolean isRowValid = true;
            for (int l = 1; l < matriz[c].length; l++) {
                if (matriz[l][c] != firstValue) {
                    isRowValid = false;
                    break;
                }
            }
            if (isRowValid) {
                return c + 1;
            }
        }
        return 0;
    }

    private static boolean verificaDiagonalPrincipal(char[][] matriz) {
        char firstValue = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            if (matriz[l][l] != firstValue) {
                return false;
            }
        }
        return true;
    }

    private static boolean verificaDiagonalSecundaria(char[][] matriz) {
        char firstValue = matriz[0][2];
        int i = 0;
        // Como 'c' sempre seria setado no ultimo elemento da linha, precisávamos de algo para decrementar automáticamente
        // usamos o break após o if para evitar comparar com o resto da linha
        for (int l = 0; l < matriz.length; l++) {
            for (int c = matriz[l].length - 1; c >= 0; c--) {
                if (matriz[l][c - i] != firstValue) {
                    return false;
                }
                ++i;
                break;
            }
        }
        return true;
    }

    /**
     * Jogo da Velha — Verificador de Vencedor
     * Declare uma matriz char[3][3] já preenchida manualmente com 'X', 'O' e espaços vazios simulando um tabuleiro finalizado.
     * Escreva a lógica que verifica se houve vencedor, checando:
     * - as 3 linhas
     * - as 3 colunas
     * - as 2 diagonais
     * Teste com pelo menos 3 tabuleiros diferentes (vitória em linha, em diagonal, e empate).
     * Pesquise: como percorrer diagonais de uma matriz usando índices — repare no padrão entre matriz[i][i] e a diagonal secundária.
     **/
    public void verificaVencedor() {
        Scanner input = new Scanner(System.in);
        char[][] matriz = new char[3][3];

        // Usuário preenche a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                String dado = input.next();
                matriz[linha][coluna] = dado.trim().charAt(0);
            }
        }
        /*
         * A diferença entre usar um for loop tradicional (utilizando indices) e usar foreach é que o
         * foreach apenas entrega uma cópia, uma referência do valor atual. Ao contrário, o for tradicional
         * nos permite manipular diretamente o valor na memória.
         * */
        for (char[] linha : matriz) {
            for (char colunaElemento : linha) {
                System.out.print(colunaElemento + " ");
            }
            System.out.println();
        }

        int valorLinha = verificaLinha(matriz);
        int valorColuna = verificaColuna(matriz);
        if (valorLinha != 0) {
            System.out.println("Houve vencedor na linha: " + valorLinha + "!");
        } else if (valorColuna != 0) {
            System.out.println("Houve vencedor na coluna: " + valorColuna + "!");
        } else if (verificaDiagonalPrincipal(matriz)) {
            System.out.println("Houve vencedor na diagonal principal!");
        } else if (verificaDiagonalSecundaria(matriz)) {
            System.out.println("Houve vencedor na diagonal secundária!");
        } else {
            System.out.println("Não houve vencedor!");
        }

    }
}
