package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.Cliente;

import java.util.Scanner;

/**
 * Exercício 04 — Leitura de Dados pelo Console: Cadastro de Cliente.
 * <p>
 * Use {@code Scanner} para ler nome, idade e email do teclado, valide que
 * a idade não seja negativa, e só então crie o objeto {@code Cliente} com
 * esses dados. Imprima os dados do cliente cadastrado.
 * <p>
 * <b>Pesquise:</b> onde faz mais sentido colocar a validação da idade — no
 * {@code main} antes de criar o objeto, ou dentro do próprio
 * construtor/setter de {@code Cliente}? Pensa nas vantagens de cada
 * abordagem.
 */
public class CadastroCliente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, email;
        int idade;

        // Lógica na main: Válida as entradas e só então cria o objeto.
        while (true) {
            System.out.println("Seu nome: ");
            nome = ler.nextLine();
            System.out.println("Sua idade: ");
            idade = ler.nextInt();
            if (idade < 0) {
                System.out.println("Idade Inválida, tente novamente!");
                continue;
            }
            ler.nextLine();
            System.out.println("Seu email");
            email = ler.nextLine();
            Cliente cli1 = new Cliente(nome,idade,email);
            cli1.imprime();
            break;
        }

        // Lógica no construtor: cria um objeto, se as entradas forem inválidas teremos um objeto
        // com atributos vazios, porém ainda temos o objeto.

        System.out.println("Seu nome: ");
        nome = ler.nextLine();
        System.out.println("Sua idade: ");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Seu email");
        email = ler.nextLine();
        Cliente cli2 = new Cliente(nome,idade,email);
        cli2.imprime();
    }
}