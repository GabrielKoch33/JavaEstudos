package org.gabriel.devdojo.poo.classes.enumerate;

// Nesse caso o Enum é default (apenas acessível para classes do mesmo pacote)
// Porem pode ser public, private etc...
enum TipoCliente { //
    PESSOA_FISICA,
    PESSOA_JURIDICA
    // tipo dos dados é igual ao nome do enum (no caso tipo é TipoCliente)
    // - os valores são constantes final e static, podendo ser acessadas via NomeEnum.VALOR;
    // - não se pode fazer NomeEnum.VALOR = NOVO VALOR;
}
