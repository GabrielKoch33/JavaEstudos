package org.gabriel.devdojo.poo.classes.polimorfismo.testes;

import org.gabriel.devdojo.poo.classes.polimorfismo.Computador;
import org.gabriel.devdojo.poo.classes.polimorfismo.Produto;
import org.gabriel.devdojo.poo.classes.polimorfismo.Relatorio;

public class BtestePoli {
    static void main() {
        Produto computador = new Computador("Mac", 7000);
        Relatorio.emitirRelatorioFiscal(computador);
    }
}
