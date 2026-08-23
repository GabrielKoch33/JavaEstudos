package org.gabriel.pessoal;

public class Lista01 {
    /**
    Gere, sem usar nenhuma biblioteca pronta de "é primo", todos os números primos entre 2 e 100 usando o algoritmo do Crivo de Eratosthenes:
    um array de boolean representando cada número, marcando como "não primo" os múltiplos de cada primo encontrado.
    Pesquise: por que esse algoritmo é mais eficiente do que testar divisibilidade número por número?
    Em que ponto você pode usar break para parar de marcar múltiplos mais cedo?
    Saída esperada: os primos impressos separados por vírgula.
    **/
    public static void crivoDeEratosthenes() {
        boolean[] arrNumeros = new boolean[101]; // 0 a 100;
        int lastCheck = (int)Math.sqrt(100);
        int j = 0;
        int i = 0;

        // O crivo define naturalmente que todos os números são primos
        for (i = 0; i < arrNumeros.length; i++){
            arrNumeros[i] = true;
        }

        for (i = 2; i < arrNumeros.length; i++) {
            // Fazemos a busca de múltiplos naqueles que não foram "riscados"
            if (arrNumeros[i]){
                j = i+1;
                // O crivo define a raiz de N como o limite para procurarmos múltiplos
                if (i >= lastCheck){
                    break;
                } else {
                    // Percorremos o vetor eliminando todos os múltiplos possível do atual Nº primo
                    while(j <= 100) {
                        if (j % i == 0) {
                            arrNumeros[j] = false;
                        }
                        j++;
                    }
                }
            }
        }
        // Print
        for (i = 0; i <= arrNumeros.length; i++ ){
            if (arrNumeros[i]){
                System.out.println(i);
            }
        }
    }

    /**
    Validador de Placa de Carro
    Valide se uma String corresponde a um dos dois formatos de placa brasileira:
          - Formato antigo: AAA-9999 (3 letras, hífen, 4 dígitos)
          - Formato Mercosul: AAA9A99 (3 letras, 1 dígito, 1 letra, 2 dígitos)
    Teste com pelo menos 5 placas diferentes (algumas válidas, outras não) declaradas em um array de Strings, e imprima o resultado da validação de cada uma.
    Pesquise: métodos da classe Character que dizem se um char é letra ou dígito.
    Você vai precisar percorrer a String caractere por caractere — cuidado com o tamanho fixo esperado em cada posição.
     **/
    public static void validadorPlacaCarro(){
        String placa = "AAA-9999"; // AAA9A99
        char[] arrPlaca = new char[8];
        int digit = 0; 
        int letter = 0; 
        int hifen = 0;
        // no formato Mercosul o último índice será null
        if (placa.length() == 8){
            // Formato Antigo
            placa.getChars(0, placa.length(), arrPlaca,0);
            for (char l: arrPlaca){
                if (l == '-'){
                    hifen += 1; 
                } else if (Character.isDigit(l)) {
                    digit += 1;
                } else if (Character.isLetter(l)){
                    letter += 1;
                }
            }
            if (hifen == 1 && digit == 4  && letter == 3) {
                System.out.println("Formato Válido!");
            }
        } else if (placa.length() == 7) {
            // Formato Mercosul
            placa.getChars(0,placa.length(), arrPlaca,0);
            for (char l: arrPlaca){
                if (l == '\u0000'){
                    continue;
                }
                else if (Character.isDigit(l)){
                    digit += 1;
                } else if (Character.isLetter(l)){
                    letter += 1;
                }
            }
            if (digit == 3 && letter == 4){
                System.out.println("Formato Válido!");
            }
        } else {
            System.out.println("Formato Inválido");
        }

    }

    public static void main (String[] args) {
        crivoDeEratosthenes();
        validadorPlacaCarro();

//==== Exercício 3 ====
//Caixa Eletrônico (Dispensador de Notas)
//Dado um valor a sacar (ex: R$ 385) e um array com as notas disponíveis ({100, 50, 20, 10, 5, 2}).
//Calcule a quantidade de cada nota usando o algoritmo guloso (sempre usa a maior nota possível primeiro).
//Depois, teste com um valor que não é múltiplo de 2 (ex: R$ 387) e trate esse caso — o que deveria acontecer?
//Pesquise: a diferença entre / e % para números inteiros em Java, e por que a ordem do array de notas (decrescente) importa tanto aqui.
//
//
//==== Exercício 4 ====
//Jogo da Velha — Verificador de Vencedor
//Declare uma matriz char[3][3] já preenchida manualmente com 'X', 'O' e espaços vazios simulando um tabuleiro finalizado. Escreva a lógica que verifica se houve vencedor, checando:
//        - as 3 linhas
//        - as 3 colunas
//        - as 2 diagonais
//
//Teste com pelo menos 3 tabuleiros diferentes (vitória em linha, em diagonal, e empate).
//Pesquise: como percorrer diagonais de uma matriz usando índices — repare no padrão entre matriz[i][i] e a diagonal secundária.
//
//
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
//Pesquise: por que a média pode dar um resultado "estranho" se você usar int em vez de double na divisão. E o que muda no cálculo da mediana se a quantidade de elementos for par.
//
//
//==== Exercício 7 ====
//Matriz Mágica (Magic Square)
//Verifique se uma matriz int[3][3], preenchida manualmente por você, é um quadrado mágico: a soma de cada linha, cada coluna e as duas diagonais deve ser igual.
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
    }
}