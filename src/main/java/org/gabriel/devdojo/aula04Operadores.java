package org.gabriel.devdojo;

import java.util.Scanner;

public class aula04Operadores {
    public static void main (String[] args) {
        // + - * / %
        // < <= > >= == !=
        // && || !
        // = += -= *= /= %=
        // (incrementadores +1) -> i++ i-- (pós-incremento) --i ++i (pré-incremento)

        Scanner ler = new Scanner(System.in);

        double num1 = 10;
        int num2 = 20;

        System.out.println("Concatenação: " + num1 + num2);
        // parênteses força a operação acontecer primeiro;
        System.out.println("Soma real: " + (num1 + num2));

        double resultDiv  = num1 / num2; // 0.5
        System.out.println(resultDiv);
        // a divisão entre dois números inteiros sempre resultará em um inteiro;
        // para obter o resultado real considere converter um dos valores para double/float;

        int number = ler.nextInt();
        int resto = number % 2; // mod
        if (resto == 0){
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }

        boolean isGreaterTen = number > 10;
        boolean isLowerTen = number < 10;
        boolean isEqualTen = number == 10;
        boolean isZero = number != 0;
        System.out.println("É maior que 10? " + isGreaterTen);
        System.out.println("É menor que 10? " + isLowerTen);
        System.out.println("É igual a 10? " + isEqualTen);
        System.out.println("É diferente de 0? " + isZero);

        int age = ler.nextInt();
        boolean isDrug = true;

        if ( age >= 18 && isDrug ){
            System.out.println("Maior de idade e bêbado!");
        } else if ( age <= 18 && !isDrug ) {
            System.out.println("Apenas menor de idade!");
        } else if ( age <= 18 && isDrug ) {
            System.out.println("Menor de idade E bêbado");
        } else {
            System.out.println("Pode dirigir =)");
        }
    }
}
