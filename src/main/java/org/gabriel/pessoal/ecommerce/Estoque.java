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

}
