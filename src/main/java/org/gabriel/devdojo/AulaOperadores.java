package org.gabriel.devdojo;

import java.util.Scanner;

public class AulaOperadores {
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
        // operador ternário;
        double heightPeople = ler.nextDouble();
        String resultado = heightPeople > 1.70 ? "Entre" : "Entrada Proibida";
        // tipo variável = (condição) ? caso_true : caso_false;
        System.out.println(resultado);

        int dayOfWeek = ler.nextInt();
        switch (dayOfWeek){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Dia não criado ainda");
            // Usamos break pq sempre que o case é verdadeiro ele executa o bloco atual + seguintes
        }

        System.out.println("Pick one food: ");
        System.out.println("1 - Pizza\n 2 - Hamburguer\n 3 - Pastel");
        int option = ler.nextInt();
        switch (option){
            case 1:
                System.out.println("You have ordered a Pizza!");
                break;
            case 2:
                System.out.println("You have ordered a Hamburger!");
                break;
            case 3:
                System.out.println("You have ordered a Pastel!");
                break;
            default:
                System.out.println("Choose a valid option!");
        }
    }
}
