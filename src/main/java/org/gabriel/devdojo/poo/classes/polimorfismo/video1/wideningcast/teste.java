package org.gabriel.devdojo.poo.classes.polimorfismo.video1.wideningcast;

import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Computador;
import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Produto;
import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Tomate;
import org.gabriel.devdojo.poo.classes.polimorfismo.etc.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class teste {
    /**
     * Widening Cast, onde a variável é de um tipo mais geral, enquanto o objeto é de um tipo mais específico.
     * Widening = Amplo
     * **/
    public static void main(String[] args) {
        Produto tomate = new Tomate("Tomate Bolinha", 14,"14/02/2026");
        Produto pc = new Computador("Lenovo", 1200);
        Produto pc1 = new Computador("Pc Xuxa", 10000);
        Produto tomate3 = new Tomate("Tomate Cereja", 10,"24/05/2001");

        List<Produto> itens = new ArrayList<>();
        System.out.println("Widening Cast (Aumentando o tipo do objeto)");

        // Todos as subclasses de produto possuem esse método
        for (Produto item : itens) {
            System.out.println(item.idadeMinima());
        }

        Tomate t1 = new Tomate("Tomate Bolinha", 14,"14/02/2026");
        t1.setDataValidade("25/01/2026");

        Relatorio.emitirRelatorioFiscal(t1);
    }
}
