package org.gabriel.pessoal.lista01;

public class Eratosthenes {
    /**
     Gere, sem usar nenhuma biblioteca pronta de "é primo", todos os números primos entre 2 e 100 usando o algoritmo do Crivo de Eratosthenes:
     um array de boolean representando cada número, marcando como "não primo" os múltiplos de cada primo encontrado.
     Pesquise: por que esse algoritmo é mais eficiente do que testar divisibilidade número por número?
     Em que ponto você pode usar break para parar de marcar múltiplos mais cedo?
     Saída esperada: os primos impressos separados por vírgula.
     **/
    public void crivoDeEratosthenes() {
        boolean[] arrNumeros = new boolean[101]; // 0 a 100;
        int lastCheck = (int)Math.sqrt(100);
        int j = 0;
        int i = 0;

        // O crivo define naturalmente que todos os números são primos
        for (i = 2; i < arrNumeros.length; i++){
            arrNumeros[i] = true;
        }

        for (i = 2; i < arrNumeros.length; i++) {
            // Fazemos a busca de múltiplos naqueles que não foram "riscados"
            if (arrNumeros[i]){
                j = i+1;
                // O crivo define a raiz de N como o limite para procurarmos múltiplos
                //*Existe diferença entre usar >= ou >?
                if (i > lastCheck){
                    break;
                } else {
                    // Percorremos o vetor eliminando todos os múltiplos possível do atual Nº primo
                    while(j <= 100) {
                        if (j % i == 0) {
                            arrNumeros[j] = false;
                        }
                        j++;
                    }
                }
            }
        }
        // Print
        for (i = 2; i < arrNumeros.length; i++ ){
            if (arrNumeros[i]){
                System.out.println(i);
            }
        }
    }
}
