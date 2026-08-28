package org.gabriel.pessoal.lista01;
import java.util.Scanner;
import java.util.TreeMap;

public class Estatisticas {

    private static int particionamento(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int temp;

        for (int j = left + 1; j <= right; j++) {
            if (arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Troca o pivô (que está em arr[left]) com o elemento na posição i
        temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;
    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index_pivot = particionamento(arr, left, right);
            quickSort(arr, left, index_pivot - 1); // Esquerda 1º pivô
            quickSort(arr, index_pivot + 1, right); // Direita 1º pivô
        }
        return arr;
    }

    private static double mediaArr(int[] arrEstatistica) {
        int sum = 0;
        for (int valor : arrEstatistica) {
            sum += valor;
        }
        return (double) sum / arrEstatistica.length;
        /*
        O operador '/' realiza divisão flutuante quando ao menos um dos operandos é do tipo float ou double
        */
    }

    private static double medianaArr(int[] arrOrdenado) {
        int tamArr = arrOrdenado.length;
        if (tamArr % 2 == 0) {
            int num1 = (tamArr - 1) / 2;
            int num2 = num1 + 1;
            return ((double) arrOrdenado[num1] + (double) arrOrdenado[num2]) / 2;
        } else {
            return arrOrdenado[tamArr / 2];
        }
    }

    private static int modaArr(int[] arr) {
        TreeMap<Integer, Integer> mapValores = new TreeMap<Integer, Integer>();
        for (int num : arr) {
            mapValores.merge(num, 1, Integer::sum);
            // acessa a chave 'num', incrementa em 1, caso não exista, inicia com 1;
        }
        int moda = 0;
        for (int num : mapValores.keySet()) {
            if (mapValores.get(num) > moda) {
                moda = num;
            }
        }
        return moda;
    }

    private void  estatisticasMatematica(int[] arrOrdenado) {

        System.out.println("Média: " + mediaArr(arrOrdenado));
        System.out.println("Mediana: " + medianaArr(arrOrdenado));
        System.out.println("Moda: " + modaArr(arrOrdenado));
    }
    /**
     * Estatísticas Manuais (sem Arrays.sort) <br><br>
     * Dado um array de 15 números inteiros gerados com Math.random(), calcule manualmente (sem nenhum método pronto de ordenação ou estatística):<br><br>
     * - Média <br>
     * - Mediana (isso exige ordenar o array você mesmo — implemente um Bubble Sort)<br>
     * - Moda (valor que mais se repete)<br><br>
     * Pesquise: por que a média pode dar um resultado "estranho" se você usar int em vez de double na divisão.
     * E o que muda no cálculo da mediana se a quantidade de elementos for par.
     **/
    public static void main(String[] args) {
        //==== Exercício 6 ====
        Scanner input = new Scanner(System.in);
        Estatisticas stats = new Estatisticas();
        int[] arrEstatisticas = new int[15];

        for (int i = 0; i < arrEstatisticas.length; i++) {
            arrEstatisticas[i] = (int) (Math.random() * 10);// + 1;
        }
        /*
         Fazemos uma cópia do array original para evitarmos alterar o array original
         Qualquer uso posterior de arrOrdenado já vai estar acessando a referência ordenada
        */
        int[] arrOrdenado = arrEstatisticas.clone();
        quickSort(arrOrdenado, 0, arrEstatisticas.length - 1);

        System.out.println("Array gerado: ");
        for (int num : arrOrdenado) {
            System.out.println(num);
        }

        System.out.println("Estatísticas: ");
        stats.estatisticasMatematica(arrOrdenado);
    }
}