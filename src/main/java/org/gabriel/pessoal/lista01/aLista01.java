package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class aLista01 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Eratosthenes crivo = new Eratosthenes(); // Cria/instancia um objeto da classe
        PlacaDeCarro placa = new PlacaDeCarro(); // Cria/instancia um objeto da classe
        CaixaSaldoEletronico caixa = new CaixaSaldoEletronico(); // Cria/instancia um objeto da classe
        JogoDaVelha vencedorJogoDaVelha = new JogoDaVelha();
        CifraDeCesar codCifraCesar = new CifraDeCesar();

        //==== Exercício 1 ====
        System.out.println("Crivo de Eratosthenes: ");
        crivo.crivoDeEratosthenes();             // Acessa o método a partir do objeto criado

        //==== Exercício 2 ====
        System.out.println("Insira a placa de seu carro: ");
        String placaCarro = input.next();
        placa.validadorPlacaCarro(placaCarro);   // Acessa o método a partir do objeto criado

        //==== Exercício 3 ====
        System.out.println("Insira o valor da compra: ");
        int valor = input.nextInt();
        caixa.caixaEletronico(valor);                            // Acessa o método a partir do objeto criado

        //==== Exercício 5 ====
        System.out.println("[1] - Bolinhas | [2] - Xis");
        System.out.println("Quem será que há vencedor?");
        vencedorJogoDaVelha.verificaVencedor();

        //==== Exercício 5 ====
        input.nextLine();

        System.out.println("Digite a frase que você deseja codificar: ");
        String frase = input.nextLine();
        System.out.println("Digite o valor de deslocamento: ");
        int numDesloca = input.nextInt();
        codCifraCesar.codificadorCesar(frase, numDesloca);

        //==== Exercício 6 ====
        //==== Exercício 7 ====
        //==== Exercício 8 ====
        //==== Exercício 9 ====
        //==== Exercício 10 ====
    }
}