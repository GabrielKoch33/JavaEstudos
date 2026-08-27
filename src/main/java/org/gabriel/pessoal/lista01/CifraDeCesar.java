package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class CifraDeCesar {
    /**
     * Cifra de César
     * Implemente a Cifra de César: dado um deslocamento (ex: 3).
     * Transforme cada letra de uma String para a letra "deslocada" no alfabeto (A vira D, Z vira C — precisa dar a volta!).
     * Mantenha espaços e pontuação intactos.
     * Depois, escreva a lógica inversa: dado o texto cifrado e o deslocamento, decifre de volta ao original.
     * Pesquise: como converter um char para seu valor numérico (ASCII) e vice-versa,
     * e como o operador % resolve o problema de "dar a volta" no alfabeto sem usar if.
     * */
    public void codificadorCesar (String frase, int numDesloca) {
        // Revisar melhores formas de escrever esse execício e torna-lo menos verboso

        char[] arrCharFrase = frase.toLowerCase().toCharArray();
        char[] arrFraseCodificada = new char[arrCharFrase.length];
        char[] arrFraseDecodificada = new char[arrCharFrase.length];
        String pontuacoes = "!.,;:?'()[]{}--_/";
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        if (numDesloca == 0){
            System.out.println(frase);
        } else {
            for (int i = 0; i < arrCharFrase.length; i++){
                if (Character.isWhitespace(arrCharFrase[i]) ||
                    pontuacoes.indexOf(arrCharFrase[i]) >= 0)
                    {
                        continue;
                    }
                if ((alfabeto.indexOf(arrCharFrase[i]) + 1) % arrCharFrase.length == 0 ||
                    ((int) arrCharFrase[i] + numDesloca > 90))
                    {
                        arrFraseCodificada[i] = (char) (64 + numDesloca);
                    }
                else {
                    // bloco de transformação
                    continue;
                }
            }
            for (char letra : arrFraseCodificada){
                System.out.println(letra);
            }
        }

    }

}
