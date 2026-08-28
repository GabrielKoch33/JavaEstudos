package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class CompressaoRLE {

    private String runLengthEncoding(String frase) {
        String fraseCodificada = "";
        char[] arrFrase = frase.toCharArray();
        int i = 0;

        while (i < frase.length()) {
            int contCharAtual = 1;
            char charAtual = frase.charAt(i);
            int j = i;

            while (j + 1 < arrFrase.length && j < arrFrase.length) {
                if (arrFrase[j] == arrFrase[j+1]) {
                    contCharAtual++;
                    j++;
                } else {
                    //valueOf converte num -> str
                    fraseCodificada += charAtual + String.valueOf(contCharAtual);
                    break;
                    /*StringBuilder nos ajudaria a evitar criar cópias da frase na memória
                    * Ele funcionaria como uma única variável de tamanho flexível (ArrayList)*/
                }
            }
            i = j + 1;
        }
        return fraseCodificada;
    }

    /**
     * Compressão RLE (Run-Length Encoding) <br><br>
     * Implemente uma compressão simples de String: transforme "aaabbbccccd" em "a3b3c4d1" — cada caractere seguido da quantidade de vezes que se repete consecutivamente.<br><br>
     * Pesquise: por que concatenar String num loop grande é considerado ineficiente em Java,
     * (o curso ainda vai chegar nesse tópico — dê uma espiada em StringBuilder por curiosidade, mesmo sem usar ainda se preferir ficar só no que já viu).
     */
    public static void main(String[] args) {
        //==== Exercício 8 ====
        CompressaoRLE rle = new CompressaoRLE();
        Scanner input = new Scanner(System.in);

        System.out.println("RLE - Digite uma sequência de caracteres para compactar. ex: 'aaaabbbcc'");
        String frase = input.next();
        System.out.println(rle.runLengthEncoding(frase));

    }
}
