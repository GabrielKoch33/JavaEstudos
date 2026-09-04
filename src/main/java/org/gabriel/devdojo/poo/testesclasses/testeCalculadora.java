package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.Calculadora;

import java.util.Scanner;

public class testeCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite o primeiro valor: ");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double num2 = ler.nextDouble();

        int[] numeros = {1,7,8,7,4,14,5,6,7,9,12};
        calculadora.saudacoes(nome);
        System.out.println(calculadora.somaDoisNumeros(num1,num2));
        System.out.println(calculadora.subtraiDoisNumeros(num1,num2));
        System.out.println(calculadora.divisaoDoisNumeros(num1,num2));
        System.out.println(calculadora.multiplicacaoDoisNumeros(num1,num2));
        System.out.println("Usando array de inteiros como parâmetro");                  // -1
        System.out.println(calculadora.somaVarios(numeros));
        System.out.println("Usando array de inteiros como parâmetro");
        System.out.println(calculadora.somaVarios(new int[] {1,2,3,5,4,6,8,7}));        // -2
        System.out.println("Usando varargs para enviar muitos valores");
        System.out.println(calculadora.somaVarargs(1,2,3,4,5,6,7,8,9,10)); // -3
    }
}
