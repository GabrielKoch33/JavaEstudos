package org.gabriel.devdojo.poo.classes.enumerate;

public class ClienteTeste {
    /**
     * Usamos Enums para armazenar dados que são "padronizados" ou que são imutáveis, repetitivos e estão em um leque limitado de opções;
     * e podem ser gerais e exteriores
     * ao software (como dias da semana, meses do ano, períodos do dia, status, etc...)
     * **/
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Gabriel", "PESSOA_FÍSICA"); // VÁLIDO
        Cliente cli2 = new Cliente("Ana", "PESSOA_JURÍDICA"); // VÁLIDO
        Cliente cli3 = new Cliente("Ana", "PessoaJurídica"); // INVÁLIDO
        Cliente cli4 = new Cliente("Ana", "pessoa física"); // INVÁLIDO

        Cliente cliEnum1 = new Cliente("Jorge", 23, TipoCliente.PESSOA_JURIDICA);
        Cliente cliEnum2 = new Cliente("Paulo", 4, TipoCliente.PESSOA_FISICA);
    }
}
