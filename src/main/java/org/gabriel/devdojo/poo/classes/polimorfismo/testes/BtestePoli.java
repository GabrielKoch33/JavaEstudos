package org.gabriel.devdojo.poo.classes.polimorfismo.testes;

import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Computador;
import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Produto;
import org.gabriel.devdojo.poo.classes.polimorfismo.etc.Relatorio;

public class BtestePoli {
    static void main() {
        Produto computador = new Computador("Mac", 7000);
        Relatorio.emitirRelatorioFiscal(computador);
    }
}
