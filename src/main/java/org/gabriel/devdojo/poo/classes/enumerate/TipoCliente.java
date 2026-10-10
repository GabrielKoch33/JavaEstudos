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

    private final String DESCRICAO;
    // Cada CONSTANTE (que são objetos dentro do Enum) possui uma descrição associada, a descrição é passada pelos () e chama o construtor

    /**
     * Construtores de Enum são private por padrão, afinal não podemos passar argumentos por eles ao usar no código principal
     * Os construtores são chamados ao mencionarmos (carregarmos) os Valores na Main
     * **/
    TipoCliente(String desc) {
        this.DESCRICAO = desc;
    }

    public String getDescricao() {
        return DESCRICAO;
    }
}
