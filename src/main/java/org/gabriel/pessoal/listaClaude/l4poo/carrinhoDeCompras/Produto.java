package org.gabriel.pessoal.listaClaude.l4poo.carrinhoDeCompras;

public class Produto {

    String nome;

    double preco;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: '"+this.nome+
               "Preço: "+this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
