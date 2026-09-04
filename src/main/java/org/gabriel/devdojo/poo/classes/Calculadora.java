package org.gabriel.devdojo.poo.classes;

public class Calculadora {
    // Testando atributos

    public void saudacoes (String nome) {
        System.out.println("Seja bem vindo(a) à Calculadora, " + nome);
        return; // returns normalmente devolvem valores, mas para métodos void podemos usar 'return;' como se fosse um "break"
    }
    public int somaDoisNumeros(double num1, double num2) {
        return (int) (num1 + num2);
    }

    public int subtraiDoisNumeros(double num1, double num2) {
        return (int) (num1 - num2);
    }

    public double divisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double multiplicacaoDoisNumeros(double num1, double num2) {
        return num1 * num2;
    }

    public int somaVarios (int[] numerosArr) {
        int soma = 0;
        for (int num : numerosArr) {
            soma += num;
        }
        return soma;
    }
    // caso queria mais parâmetros ALÉM dos passados ao varargs, os mesmo OBRIGATÓRIAMENTE vem antes do vargars
    // public int abc (int a, double b, int... varargs) {}
    public int somaVarargs (int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

}
