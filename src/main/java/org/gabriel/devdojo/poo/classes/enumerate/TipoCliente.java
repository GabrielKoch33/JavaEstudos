package org.gabriel.devdojo.poo.classes.enumerate;


/**
 * - O tipo dos dados é igual ao nome do enum (no caso tipo é TipoCliente)
 * - Os valores são constantes final e static, podendo ser acessadas via NomeEnum.VALOR;
 * - Não se pode fazer NomeEnum.VALOR = NOVO VALOR;
 * - Nesse caso o Enum é default (apenas acessível para classes do mesmo pacote)
 * - Porem pode ser public, private etc...
 **/
enum TipoCliente { //
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int VALOR;

    /**
     * Construtores de Enum são private por padrão, afinal
     * **/
    TipoCliente(int valor) {
        this.VALOR = valor;
    }

    public int getValor() {
        return VALOR;
    }
}
