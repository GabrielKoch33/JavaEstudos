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

        calculadora.saudacoes(nome);
        System.out.println(calculadora.somaDoisNumeros(num1,num2));
        System.out.println(calculadora.subtraiDoisNumeros(num1,num2));
        System.out.println(calculadora.divisaoDoisNumeros(num1,num2));
        System.out.println(calculadora.multiplicacaoDoisNumeros(num1,num2));
    }
}
