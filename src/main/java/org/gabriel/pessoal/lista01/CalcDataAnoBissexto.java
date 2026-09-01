package org.gabriel.pessoal.lista01;

import java.util.Scanner;

public class CalcDataAnoBissexto {

    private static int dezena (int num){
        return ((num/10) % 10) * 10;
    }

    private static int unidade (int num){
        return num % 10;
    }

    private static boolean eBissexto(int ano){
        int u = unidade(ano);
        int d = dezena(ano);
        int lastTwoDigits = d + u;

        if (lastTwoDigits == 0) {
            return ano % 400 == 0;
            // 2000 % 400 == 0
            // 1900 % 400 == 300
        } else {
            return lastTwoDigits % 4 == 0;
            // 2024 % 4 == 0
            // 2026 % 4 == 2
        }
    }
    /**
    * Ano Bissexto e Diferença de Dias <br>
    * Sem usar nenhuma classe de data (LocalDate, Calendar, etc. — isso vem bem mais na frente do curso):<br><br>
    *         1. Escreva a lógica que determina se um ano é bissexto (regra: divisível por 4, EXCETO séculos que não são divisíveis por 400).<br><br>
    *         2. Dado um dia e mês de um ano, calcule quantos dias já se passaram desde 1º de janeiro daquele ano (considerando se é bissexto ou não para fevereiro).<br><br>
    * Pesquise: por que a regra de ano bissexto tem essa exceção dos séculos — e teste seu código com o ano 2000 e o ano 1900.
    */
    public static void main(String[] args) {
        //==== Exercício 9 ====
        int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDiaPassados = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um ano: ");
        int ano = input.nextInt();
        System.out.println("Informe um mês (o número, não o nome): ");
        int mes = input.nextInt();
        System.out.println("Informe um dia: ");
        int dia = input.nextInt();

        mes--; // Para ir de acordo com os índices do array, caso o user informe Janeiro (01), decrementamos 1 para ir para o índice zero
        if (eBissexto(ano)){
            meses[1] += 1;
            while (i < mes ){
                totalDiaPassados += meses[i];
                i++;
            }
            System.out.println("É um ano bissexto!");
        } else {
            while (i < mes ){
                totalDiaPassados += meses[i];
                i++;
            }
            System.out.println("Não é um ano bissexto!");
        }
        totalDiaPassados += dia - 1;
        System.out.println("Se passaram no total, desde o dia 1º de Janeiro, " + totalDiaPassados + " dias!");
    }
}
