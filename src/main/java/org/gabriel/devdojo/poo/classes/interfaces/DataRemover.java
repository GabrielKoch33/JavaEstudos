package org.gabriel.devdojo.poo.classes.interfaces;

public interface DataRemover {

    /**
     * Toda variável numa interface (assim como enum) são constantes.
     * <public> <static> <final>
     * **/
    String DATA_BASE_CONECTION_STR = "abcdefghijklmnopqrstuvwxyz";
    int NUM_MAX_CONNECTIONS = 2;

    /**
     * Todo método em uma interface é public (pode ser 'herdado') e abstract (sem corpo e implementação obrigatória)
     * **/
    void removerData();

    /**
     * Métodos static de interface NÃO podem ser sobrescritos e nem chamados
     * via objetos de uma classe que implemente sua interface.
     * Sua chamada é exclusiva via NomeInterface.metodoStatic();
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
