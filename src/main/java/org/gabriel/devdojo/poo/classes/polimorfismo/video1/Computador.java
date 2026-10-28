package org.gabriel.devdojo.poo.classes.polimorfismo.video1;

import org.gabriel.devdojo.poo.classes.polimorfismo.etc.ImpostosPorCategoria;

public class Computador extends Produto {
    public Computador(String nome, double valor) {
        super(nome, valor, ImpostosPorCategoria.TECNOLOGIA);
    }
}
