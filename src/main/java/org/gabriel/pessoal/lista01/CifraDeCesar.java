package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class CifraDeCesar {

    public void codificadorCesar(String frase, int numDesloca) {
        // Revisar melhores formas de escrever esse execício e torna-lo menos verboso

        char[] arrCharFrase = frase.toLowerCase().toCharArray();
        char[] arrFraseCodificada = new char[arrCharFrase.length];
        char[] arrFraseDecodificada = new char[arrCharFrase.length];
        String pontuacoes = "!.,;:?'()[]{}--_/";
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        if (numDesloca == 0) {
            System.out.println(frase);
        } else {
            for (int i = 0; i < arrCharFrase.length; i++) {
                if (Character.isWhitespace(arrCharFrase[i]) ||
                        pontuacoes.indexOf(arrCharFrase[i]) >= 0) {
                    arrFraseCodificada[i] = arrCharFrase[i];
                } else if (alfabeto.indexOf(arrCharFrase[i]) != 0 &&
                        (alfabeto.indexOf(arrCharFrase[i]) + 1) % arrCharFrase.length == 0 ||
                        ((int) arrCharFrase[i] + numDesloca > 90)) {
                    arrFraseCodificada[i] = (char) (64 + numDesloca);
                } else {
                    // bloco de transformação
                    int asciiCharNum = (int) arrCharFrase[i];
                    asciiCharNum += numDesloca;
                    arrFraseCodificada[i] = (char) asciiCharNum;
                    /*
                     * Não consegui fazer e me recuso a copiar da IA
                     * arrFraseCodificada[i] = (char) (((arrCharFrase[i] - baseAscii + numDesloca) % 26) + baseAscii);
                     * */
                }
            }
            for (char letra : arrFraseCodificada) {
                System.out.println(letra);
            }
        }
    }

    /**
     * Cifra de César<br><br>
     * Implemente a Cifra de César: dado um deslocamento (ex: 3).<br><br>
     * Transforme cada letra de uma String para a letra "deslocada" no alfabeto (A vira D, Z vira C — precisa dar a volta!).
     * Mantenha espaços e pontuação intactos.<br><br>
     * Depois, escreva a lógica inversa: dado o texto cifrado e o deslocamento, decifre de volta ao original.<br><br>
     * Pesquise: como converter um char para seu valor numérico (ASCII) e vice-versa,
     * e como o operador % resolve o problema de "dar a volta" no alfabeto sem usar if.
     */
    public static void main(String[] args) {
        //==== Exercício 5 ====
        Scanner input = new Scanner(System.in);
        CifraDeCesar codCifraCesar = new CifraDeCesar();

        System.out.println("Digite a frase que você deseja codificar: ");
        String frase = input.nextLine();
        System.out.println("Digite o valor de deslocamento: ");
        int numDesloca = input.nextInt();

        codCifraCesar.codificadorCesar(frase, numDesloca);
    }
}
