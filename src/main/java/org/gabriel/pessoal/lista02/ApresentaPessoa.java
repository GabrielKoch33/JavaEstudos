package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.Pessoa;

/**
 * Exercício 08 — {@code this} Explícito: Pessoa.
 * <p>
 * Crie uma classe {@code Pessoa} cujo construtor recebe parâmetros com o
 * mesmo nome dos atributos ({@code nome}, {@code idade}). Use
 * {@code this.nome = nome} para deixar claro qual é qual.
 * <p>
 * Depois, crie um método {@code apresentar()} que chama outro método
 * {@code imprimirDetalhes(Pessoa pessoa)} passando {@code this} como
 * argumento (ou seja, o objeto passa a si mesmo para outro método).
 * <p>
 * <b>Pesquise:</b> por que, sem o {@code this.} na atribuição do
 * construtor, {@code nome = nome} simplesmente não funcionaria (o que o
 * Java entenderia ali)?
 */
public class ApresentaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 45);
        pessoa.apresentar();
        // Método pessoa chama apresentar, apresentar sabe qual objeto/instância chamou ele
        // passa essa referência como argumento para imprimirDetalhes
    }
}