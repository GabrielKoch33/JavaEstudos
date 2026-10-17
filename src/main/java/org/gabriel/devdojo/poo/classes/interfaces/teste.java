package org.gabriel.devdojo.poo.classes.interfaces;

public class teste {
    static void main() {
        FileDataLoader file = new FileDataLoader();

        DataRemover.validaConexao();

        System.out.println(DataRemover.NUM_MAX_CONNECTIONS);
        System.out.println(DataRemover.DATA_BASE_CONECTION_STR);

        System.out.println("atributos dentro de interfaces são constantes que só podem ser chamadas daquela forma");
    }
}
