package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class aLista01 {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Eratosthenes crivo = new Eratosthenes(); // Cria/instancia um objeto da classe
        PlacaDeCarro placa = new PlacaDeCarro(); // Cria/instancia um objeto da classe
        CaixaSaldoEletronico caixa = new CaixaSaldoEletronico(); // Cria/instancia um objeto da classe
        MatrizMagica.JogoDaVelha vencedorJogoDaVelha = new MatrizMagica.JogoDaVelha();
        CifraDeCesar codCifraCesar = new CifraDeCesar();

        System.out.println("Crivo de Eratosthenes: ");
        crivo.crivoDeEratosthenes();             // Acessa o método a partir do objeto criado

        System.out.println("Insira a placaCarro de seu carro: ");
        String placaCarro = input.next();
        placa.validadorPlacaCarro(placaCarro);   // Acessa o método a partir do objeto criado

        System.out.println("Insira o valor da compra: ");
        int valor = input.nextInt();
        caixa.caixaEletronico(valor);                            // Acessa o método a partir do objeto criado

        System.out.println("[1] - Bolinhas | [2] - Xis");
        System.out.println("Quem será que há vencedor?");
        vencedorJogoDaVelha.verificaVencedor();

        System.out.println("Digite a frase que você deseja codificar: ");
        String frase = input.nextLine();
        codCifraCesar.codificadorCesar(frase);
    }
}

//==== Exercício 5 ====
//Cifra de César
//Implemente a Cifra de César: dado um deslocamento (ex: 3).
//Transforme cada letra de uma String para a letra "deslocada" no alfabeto (A vira D, Z vira C — precisa dar a volta!).
//Mantenha espaços e pontuação intactos.
//Depois, escreva a lógica inversa: dado o texto cifrado e o deslocamento, decifre de volta ao original.
//
//Pesquise: como converter um char para seu valor numérico (ASCII) e vice-versa, e como o operador % resolve o problema de "dar a volta" no alfabeto sem usar if.
//
//
//==== Exercício 6 ====
//Estatísticas Manuais (sem Arrays.sort)
//Dado um array de 15 números inteiros gerados com Math.random(), calcule manualmente (sem nenhum método pronto de ordenação ou estatística):
//        - Média
//        - Mediana (isso exige ordenar o array você mesmo — implemente um Bubble Sort)
//        - Moda (valor que mais se repete)
//
//Pesquise: por que a média pode dar um resultado "estranho" se você usar int em vez de double na divisão.
//E o que muda no cálculo da mediana se a quantidade de elementos for par.
//
//
//==== Exercício 7 ====
//Matriz Mágica (Magic Square)
//Verifique se uma matriz int[3][3], preenchida manualmente por você,
//é um quadrado mágico: a soma de cada linha, cada coluna e as duas diagonais deve ser igual.
//Teste com uma matriz que É mágica e outra que não é.
//Pesquise: o exemplo clássico de quadrado mágico 3x3 (números de 1 a 9) — tente montar um você mesmo antes de testar.
//
//
//==== Exercício 8 ====
//Compressão RLE (Run-Length Encoding)
//Implemente uma compressão simples de String: transforme "aaabbbccccd" em "a3b3c4d1" — cada caractere seguido da quantidade de vezes que se repete consecutivamente.
//Pesquise: por que concatenar String dentro de um loop grande é considerado ineficiente em Java,
//(o curso ainda vai chegar nesse tópico — dê uma espiada em StringBuilder por curiosidade, mesmo sem usar ainda se preferir ficar só no que já viu).
//
//
//==== Exercício 9 ====
//Ano Bissexto e Diferença de Dias
//Sem usar nenhuma classe de data (LocalDate, Calendar, etc. — isso vem bem mais na frente do curso):
//        1. Escreva a lógica que determina se um ano é bissexto (regra: divisível por 4, EXCETO séculos que não são divisíveis por 400).
//        2. Dado um dia e mês de um ano, calcule quantos dias já se passaram desde 1º de janeiro daquele ano (considerando se é bissexto ou não para fevereiro).
//
//Pesquise: por que a regra de ano bissexto tem essa exceção dos séculos — e teste seu código com o ano 2000 e o ano 1900.
//
//
//==== Exercício 10 ====
//Bubble Sort com Contagem de Trocas
//Implemente o algoritmo Bubble Sort manualmente em um array de inteiros, mas além de ordenar, conte quantas trocas (swaps) foram necessárias e quantas comparações foram feitas no total.
//Depois, teste com um array já ordenado e um array ordenado ao contrário — compare os números de trocas/comparações entre os dois casos.
//
//Pesquise: por que o Bubble Sort se comporta tão diferente em um array já ordenado vs. um totalmente invertido — isso tem a ver com a complexidade do algoritmo.
