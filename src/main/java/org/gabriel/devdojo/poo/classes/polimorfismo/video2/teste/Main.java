package org.gabriel.devdojo.poo.classes.polimorfismo.video2.teste;

import java.util.List;
import java.util.ArrayList;
import org.gabriel.devdojo.poo.classes.polimorfismo.video2.Computador;
import org.gabriel.devdojo.poo.classes.polimorfismo.video2.Mac;
import org.gabriel.devdojo.poo.classes.polimorfismo.video2.Windows;

public class Main {
    /**
     * SuperClasse var = new SubClasse()
     * - SuperClasse define quais métodos são acessíveis por var
     * - SubClasse define qual versão do método será chamada através do @Override
     * ===========================================================================
     * O Objeto em sí é Subclasse, e o Java sempre prioriza o objeto ao tipo de referência.
     * Fazemos isso quando queremos generalizar e buscar metodos/atributos que existem para quaisquer
     * filhos
     * **/
    public static void main(String[] args) {
        Computador mac = new Mac("Apple",234,32,"UNIX");
        Computador w10 = new Windows("Win10", 256, 8, "Windows");

        List<Computador> computadores = new ArrayList<>();

        computadores.add(mac);
        computadores.add(w10);

        for (Computador pc : computadores) {
            pc.boasVindas();
            System.out.println();
        }

        Mac mac1 = new Mac("Apple2",123,22,"MacInTosh");
        mac1.bloquearFontesPiratas();
        System.out.println("Esse método acima pertence a um objeto Mac, não a um Computador");
    }
}
