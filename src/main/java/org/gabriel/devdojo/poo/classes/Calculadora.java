package org.gabriel.devdojo.poo.classes;

public final class Calculadora {
    // Testando atributos

    public static void saudacoes (String nome) {
        System.out.println("Seja bem vindo(a) à Calculadora, " + nome);
    }

    public static int somaDoisNumeros(double num1, double num2) {
        return (int) (num1 + num2);
    }

    public static int subtraiDoisNumeros(double num1, double num2) {
        return (int) (num1 - num2);
    }

    public static double divisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public static double multiplicacaoDoisNumeros(double num1, double num2) {
        return num1 * num2;
    }

    public static int somaVarios (int[] numerosArr) {
        int soma = 0;
        for (int num : numerosArr) {
            soma += num;
        }
        return soma;
    }
    // caso queria mais parâmetros ALÉM dos passados ao varargs, os mesmo OBRIGATÓRIAMENTE vem antes do vargars
    // public int abc (int a, double b, int... varargs) {}
    public static int somaVarargs (int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

}
