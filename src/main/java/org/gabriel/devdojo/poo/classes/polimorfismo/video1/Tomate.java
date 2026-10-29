package org.gabriel.devdojo.poo.classes.polimorfismo.video1;

import org.gabriel.devdojo.poo.classes.polimorfismo.etc.ImpostosPorCategoria;

public class Tomate extends Produto {
    private String dataValidade;

    public Tomate (String nome, double valor, String dataValidade) {
        super(nome, valor, ImpostosPorCategoria.ALIMENTO);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public int idadeMinima() {
        return 3;
    }


}
