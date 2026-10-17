package org.gabriel.devdojo.poo.classes.polimorfismo.testes;

import org.gabriel.devdojo.poo.classes.polimorfismo.Computador;
import org.gabriel.devdojo.poo.classes.polimorfismo.Relatorio;
import org.gabriel.devdojo.poo.classes.polimorfismo.Tomate;

public class AtestePoli {
    static void main() {
        Computador pc = new Computador("Lenovo", 1200);
        Computador pc1 = new Computador("Pc Xuxa", 10000);

        Tomate tomate1 = new Tomate("Tomate Bolinha", 14);
        Tomate tomate3 = new Tomate("Tomate Cereja", 10);

        Relatorio.emitirRelatorioFiscal(pc);
        System.out.println("---------------------------------------------");
        Relatorio.emitirRelatorioFiscal(pc1);
        System.out.println("---------------------------------------------");
        Relatorio.emitirRelatorioFiscal(tomate1);
        System.out.println("---------------------------------------------");
        Relatorio.emitirRelatorioFiscal(tomate3);
        System.out.println("---------------------------------------------");
    }
}
