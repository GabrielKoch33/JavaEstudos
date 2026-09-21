package org.gabriel.pessoal.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> estoque;

    public Estoque() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProdutoEstoque(Produto produto, int qtdDisponivel) {
        this.estoque.put(produto,qtdDisponivel);
    }

    public Map<Produto, Integer> getEstoque() {
        return estoque;
    }

    public boolean isEmpty() {
        return estoque.isEmpty();
    }

    public int getQtdItem(Produto produto) {
        return estoque.get(produto);
    }

    public void decresceQtdOuRemoveItem(Produto produto, int qtdComprada) {
        this.estoque.put(produto,qtdComprada);
        if (this.estoque.get(produto) <= 0) {
            this.estoque.remove(produto);
        }
    }

    public void aumentaQtdItem(Produto produto, int valor) {
        this.estoque.put(produto,valor);
    }
}
