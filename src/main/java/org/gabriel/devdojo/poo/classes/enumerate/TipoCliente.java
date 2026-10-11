package org.gabriel.devdojo.poo.classes.enumerate;

/**
 * - O tipo dos dados é igual ao nome do enum (no caso tipo é TipoCliente)
 * - Os valores são constantes final e static, podendo ser acessadas via NomeEnum.DESCRICAO;
 * - Não se pode fazer NomeEnum.DESCRICAO = NOVO DESCRICAO;
 * - Nesse caso o Enum é default (apenas acessível para classes do mesmo pacote)
 * - Porem pode ser public, private etc...
 **/
enum TipoCliente { //
    PESSOA_FISICA("Pessoa Física - CPF"),      // Isso é um objeto
    PESSOA_JURIDICA("Pessoa Jurídica - CNPJ"); // Isso é um objeto

    private final String DESCRICAO; // Cada constante/objeto possui métodos e atributos com valores próprios

    /**
     * Construtores de Enum são privados, só podem ser chamados ao lado da Constante, nunca na Main
     * **/
    TipoCliente(String desc) {
        this.DESCRICAO = desc;
    }

    public static TipoCliente buscaPorValores (String descEnum) {
        for (TipoCliente tpCli : TipoCliente.values()) {
            if ((tpCli.getDescricao()).equals(descEnum)) {

                return tpCli;
            }
            // retornamos a constante/objeto que equivale a descrição
        }
        return null;
    }

    public String getDescricao() {
        return DESCRICAO;
    }
}
