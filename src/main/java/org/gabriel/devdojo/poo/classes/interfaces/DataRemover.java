package org.gabriel.devdojo.poo.classes.interfaces;

public interface DataRemover {

    /**
     * Toda variavel dentro de uma interface (assim como enum) são constantes
     * **/
    String DATA_BASE_CONECTION_STR = "abcdefghijklmnopqrstuvwxyz";
    int NUM_MAX_CONNECTIONS = 2;

    /**
     * Todo método em uma interface é public (pode ser 'herdado') e abstract (sem corpo e implementação obrigatória)
     * **/
    void removerData();

    /**
     * Um método static ao ser sobrescrito continua pertencendo a interface, o mesmo não é modificado pela classe
     * **/
    static boolean validaConexao() {
        int x = 10;
        if (x > NUM_MAX_CONNECTIONS) {
            System.out.println(DATA_BASE_CONECTION_STR);
            return false;
        }
        return true;
    }
}
