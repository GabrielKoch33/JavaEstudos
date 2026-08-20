package org.gabriel.pessoal;
import java.awt.desktop.SystemSleepEvent;
import java.net.IDN;
import java.util.Scanner;

public class Basics {
    /*
    * Se estivessemos em uma grande aplicação teriamos esse arquivo como
    * class Main, contendo o único método main() de todo o projeto.
    * Seria ele o responsável por instanciar as demais classes/métodos
    */
    public static void main (String[] args){
        /* Criando variáveis e atribuindo o input a elas;
         nextLine() lê strings, incluindo espaços;
         nextInt() lê inteiros;
         next() lê apenas a primeira cadeia string;
         nextDouble() lê decimal;
         'ler' é o objeto que receberá dados do teclado;
        */
        Scanner ler = new Scanner(System.in);

        System.out.println("Type your name: ");
        String nameUser = ler.nextLine();

        System.out.println("Type your age (do not include month's!): ");
        int ageUser = ler.nextInt();

        System.out.println("Type your sex: ");
        char sexUser = ler.next().charAt(0);

        System.out.println("Inform your monthly salary: ");
        double monthlySalary = ler.nextDouble();

        System.out.println("Informe your Personal ID or CPF (only numbers): ");
        final String idUser = ler.nextLine();

        System.out.println("Name: " + nameUser);
        System.out.println("Personal ID/CPF: " + idUser);
        System.out.println("Age: " + ageUser);
        System.out.println("Annual Salary: " + (monthlySalary * 12));

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        /*
        * Apesar de parecerem iguais, cada um possui seu uso;
        * O de cima é um for loop normal, o qual percorre enquanto a condição for falsa;
        * O de baixo é um for-each loop, o qual é exclusivo para percorrer listas e coleções;
        * */
        int[] years = {2007, 2008, 2009, 2010, 2015,2026};
        for ( int year : years){
            System.out.println("Actual value: " + year);
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
