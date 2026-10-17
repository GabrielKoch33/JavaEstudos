package org.gabriel.devdojo.poo.classes.polimorfismo;

import org.gabriel.devdojo.poo.classes.polimorfismo.etc.ImpostosPorCategoria;

public class Tomate extends Produto {
    public Tomate (String nome, double valor) {
        super(nome, valor, ImpostosPorCategoria.ALIMENTO);
    }
}
