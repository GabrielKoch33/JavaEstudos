package org.gabriel.devdojo;
import java.util.Scanner;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        Scanner ler = new Scanner(System.in);
        final byte numByte = 127; //-128
        final short numShort = 32767; // -32768
        final long numLong = 900000000; // actually is: 9.000.000.000.000.000.000

        System.out.println("Digite um número: ");
        int number = ler.nextInt();

        if (number < 10) {
            System.out.println("Number is lower than 10");
        } else if (number > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("Number is equal to 10");
        }
    }
}