package org.gabriel.pessoal.lista02.classesExtras;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nomeProd, double precoProd, int qtdProd) {
        this.nome = nomeProd;
        this.preco = precoProd ;
        this.quantidade = qtdProd;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
