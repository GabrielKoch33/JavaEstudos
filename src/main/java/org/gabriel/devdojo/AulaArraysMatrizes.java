package org.gabriel.devdojo;

public class AulaArraysMatrizes {
    public static void main(String[] args) {
        // Array != ArrayList
        // Arrays possuem tamanho fixo e tipo de valores únicos
        // ArrayList possuem tamanho dinâmico e "tipos distintos";

        int[] nullArray = null; // null significa que o array não faz referência a nenhum objeto em memória
        int[] emptyArray;       // o array faz referencia a um objeto existente, porém foi iniciado sem elementos
        int[] fixedSizeArray = new int[5]; // cria um array de índices fixos de 0 a 4;
        int[] shortSyntax = {1,2,3,4,5,6}; // cria e define os valores diretamente

        System.out.println(fixedSizeArray); // arrays são objetos na memória
        System.out.println(shortSyntax) ;   // esses prints mostrarão o endereço deles

        // Inserindo valores:
        fixedSizeArray[0] = 10;
        fixedSizeArray[1] = 20;
        fixedSizeArray[2] = 30;

        // Para manipular arrays null/vazios é necessário instância-los a um objeto;
        nullArray = new int[3];
        nullArray[0] = 1;
        nullArray[1] = 2;
        nullArray[2] = 3;

        emptyArray = new int[3];
        emptyArray[0] = (int)5F;
        emptyArray[1] = 6;
        emptyArray[2] = 7;

        // Tamanho Array:
        // .length = para Arrays;
        //  length = para Strings;
        System.out.println(emptyArray.length); // 3
        String texto = "Hello";
        System.out.println(texto.length()); // 5

        // Percorrendo Arrays
        // -> Com for índice [i]
        String[] nomesArray = {"Léo","Luiz","Marcos","Gabriel","Júlio","Ana"};
        for (int i = 0; i < nomesArray.length; i++ ) {
            System.out.println("Prazer, " + nomesArray[i] + " !");
        }
        // -> Com foreach (mais adequado)
        for (String nome : nomesArray) {
            System.out.println("Prazer, " + nome + " !");
        }

        // Arrays sem valores
        String[] noValueArr = new String[3];
        int[] noNumArr = new int[3];
        char[] noChar = new char[3];
        boolean[] noBool = new boolean[3];

        System.out.println(noValueArr[1]);// para Strings, o valor padrão é null
        System.out.println(noNumArr[2]);  // para numéricos, o valor é 0 (ou 0.0);
        System.out.println(noChar[1]);    // para char, espaço em branco (' ');
        System.out.println(noBool[0]);    // para boolean, sempre false;


        // Matrizes / Arrays Multidimensionais
        int[][] arrMatriz = new int[3][3];

        int[][] arrMatriz2 = new int[3][];

        arrMatriz2[0] = new int[2];
        arrMatriz2[1] = new int[4];
        arrMatriz2[2] = new int[]{1,2,3,4,5};

        for (int[] valores : arrMatriz2){
            for (int num : valores){
                continue;
            }
        }

        for (int l = 0 ; l < arrMatriz.length ; l++){
            for (int c = 0 ; c < arrMatriz[l].length ; c++){
                arrMatriz[l][c] = 1;
            }
        }
    }

}
