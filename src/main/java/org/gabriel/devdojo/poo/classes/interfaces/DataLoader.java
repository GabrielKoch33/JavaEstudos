package org.gabriel.devdojo.poo.classes.interfaces;

public interface DataLoader {

    /**
     * Um problema gerado pelas interfaces legadas é que adicionar novos métodos abstract faria softwares antigos quebrarem,
     * obrigando os mesmos a implementar os novos métodos, a solução foi permitir a existência de métodos não-abstratos dentro das
     * interfaces, dessa forma o método NÃO É OBRIGATÓRIO implementar (o método deverá ter um corpo base)
     * **/
    default boolean habilitarAdicionais() {
        System.out.println("Ligando extensões");
        var conexao = getConexao();
        return true;
    }

    private String getConexao() {
        System.out.println("Retornando dados de conexão");
        return "host:20202;database:'banco_teste';senha:3322";
    }

    void load();

}
