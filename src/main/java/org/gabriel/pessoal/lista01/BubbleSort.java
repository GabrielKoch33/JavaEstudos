package org.gabriel.pessoal.lista01;

public class BubbleSort {
    /**
    Bubble Sort com Contagem de Trocas <br><br>
    Implemente o algoritmo Bubble Sort manualmente em um array de inteiros, mas além de ordenar, conte quantas trocas (swaps) foram necessárias e quantas comparações foram feitas no total.<br><br>
    Depois, teste com um array já ordenado e um array ordenado ao contrário — compare os números de trocas/comparações entre os dois casos.<br><br>

    Pesquise: por que o Bubble Sort se comporta tão diferente em um array já ordenado vs. um totalmente invertido — isso tem a ver com a complexidade do algoritmo.
    */
    public static void main(String[] args){
        //==== Exercício 10 ====
        System.out.println("Bubble Sort");
        int[] arrOrdenado = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrDesordenado = {8, 4, 3, 9, 6, 7, 10, 5, 1, 2};
        int contSwaps = 0;
        int contComparacoes = 0;

        for (int i = 0; i < arrOrdenado.length-1; i++){
            contSwaps = 0;
            for (int j = 0; j < arrOrdenado.length-i- 1; j++){
                if (arrOrdenado[j] > arrOrdenado[j+1]){
                    int temp = arrOrdenado[j];
                    arrOrdenado[j] = arrOrdenado[j+1];
                    arrOrdenado[j+1] = temp;
                    contSwaps++;
                }
                contComparacoes++;
                if (contSwaps == 0){ break;}
            }
        }
        for (int num : arrOrdenado) {
            System.out.println(num);
        }
        System.out.println("Trocas: " + contSwaps + " Comparações: " + contComparacoes);
        System.out.println("-------------------------------");

        for (int i = 0; i < arrDesordenado.length-1; i++){
            for (int j = 0; j < arrDesordenado.length-i- 1; j++){
                if (arrDesordenado[j] > arrDesordenado[j+1]){
                    int temp = arrDesordenado[j];
                    arrDesordenado[j] = arrDesordenado[j+1];
                    arrDesordenado[j+1] = temp;
                    contSwaps++;
                }
                contComparacoes++;
            }
        }
        for (int num : arrDesordenado){
            System.out.println(num);
        }
        System.out.println("Trocas: " + contSwaps + " Comparações: " + contComparacoes);
    }
}
