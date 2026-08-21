package org.gabriel.devdojo;

public class AulaLoops {
    public static void main(String[] args) {

        // Bons exemplos da pré e pós incrementação em loops
        int i = 0;
        while (i <= 5) {
            System.out.println("Índice: " + (++i));
        }
        System.out.println("==============");
        int j = 1;
        while (j <= 5){
            System.out.println("Índice: " +  (j++));
        }

        int z = 20;
        do {
            System.out.println("Esse comando vai ser executado uma vez");
            ++z;
        } while (z <= 10);

        for (int x = 1 ; x < 1000000 ; x++){
            System.out.println("Incremento: " + x);
            if (x == 3000) {
                break;
            }
        }
    }
}