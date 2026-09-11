package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercício 01 — Estoque de Produtos (Array de Objetos).
 * <p>
 * Crie uma classe {@code Produto} (nome, preco, quantidade). Crie um array
 * com pelo menos 5 {@code Produto} e calcule o valor total do estoque
 * (soma de {@code preco * quantidade} de cada um).
 * <p>
 * <b>Pesquise:</b> nada de muito exótico aqui — é só pra você pegar confiança
 * percorrendo um array de objetos (em vez de um array de {@code int}) e
 * acessando os atributos de cada posição.
 */
public class EstoqueDeProdutos {
    private final List<Produto> estoque;
    // estoque = outra_list<> == ERRO

    public EstoqueDeProdutos() {
        this.estoque = new ArrayList<>();
    }

    public void adicionaProduto(Produto prod) {
        this.estoque.add(prod);
    }

    // eu queria remover por valor do nome, mas vi que remover durante uma iteração de lista usando remove() é perigoso.
    // demais formas achei complexo e vou esperar o curso abordar
    public void removeProduto(Produto prod) {
        this.estoque.remove(prod);
    }

    public int valorEstoqueTotal() {
        int totEstoque = 0;
        // é necessária essa verificação?
        // oq ocorreria caso rodássemos o for em uma list vazia?
        // retornaria 0 devido à variável acima?
        if (this.estoque.isEmpty()) {
            return 0;
        }
        for (Produto prod : this.estoque) {
            totEstoque += (int) (prod.getQuantidade() * prod.getPreco());
        }
        return totEstoque;
    }

    public void imprime() {
        System.out.println("NOME        | PREÇO     | QTD");
        for (Produto prod : this.estoque) {
            System.out.print(prod.getNome() + " ");
            System.out.print(prod.getPreco() + " ");
            System.out.print(prod.getQuantidade() + " ");
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Produto banana = new Produto("banana", 12.3, 7);
        Produto pera = new Produto("pera", 34, 3);
        Produto uva = new Produto("uva", 14, 2);
        Produto pessego = new Produto("pessego", 8, 3);

        EstoqueDeProdutos estoqueMercado = new EstoqueDeProdutos();
        estoqueMercado.removeProduto(pessego);

        estoqueMercado.adicionaProduto(banana);
        estoqueMercado.adicionaProduto(pera);
        estoqueMercado.adicionaProduto(uva);

        estoqueMercado.imprime();

        int valor = estoqueMercado.valorEstoqueTotal();
        System.out.println("O valor total do estoque é: "+valor);
    }
}