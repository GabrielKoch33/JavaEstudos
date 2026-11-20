package org.gabriel.pessoal.excecoes.exceptions;

public class SenhaFracaException extends CadastroException {
    public SenhaFracaException(String senha) {
        super("Senha muito fraca: "+senha+"\nCrie uma senha com no mínimo 8 caracteres e um número!");
    }
}
