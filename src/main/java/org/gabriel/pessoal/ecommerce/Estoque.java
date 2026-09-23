package org.gabriel.pessoal.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> estoque;

    public Estoque() {
        this.estoque = new HashMap<>();
    }

    public String toString(Produto produto) {
        return produto+" | Quantidade: "+this.estoque.get(produto);
    }

    public void adicionarProdutoEstoque(Produto produto, int qtdDisponivel) {
        this.estoque.put(produto,qtdDisponivel);
    }

    public Map<Produto, Integer> getEstoque() {
        return Map.copyOf(this.estoque);
    }

    public boolean isEmpty() {
        return estoque.isEmpty();
    }

    public int getQtdItem(Produto produto) {
        return estoque.get(produto);
    }

    public boolean decresceQtdOuRemoveItem(Produto produto, int qtdComprada) {
        int qtdItem = getQtdItem(produto) - qtdComprada;
        this.estoque.put(produto,qtdItem);
        if (this.estoque.get(produto) <= 0) {
            this.estoque.remove(produto);
            return true;
        }
        return false;
    }

    public void aumentaQtdItem(Produto produto, int valor) {
        int qtdItem = getQtdItem(produto) + valor;
        this.estoque.put(produto,qtdItem);
    }
}
