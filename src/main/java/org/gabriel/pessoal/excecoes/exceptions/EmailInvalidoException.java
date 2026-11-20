package org.gabriel.pessoal.excecoes.exceptions;

public class EmailInvalidoException extends CadastroException {
    public EmailInvalidoException(String email) {
        super("Email inválido: "+email);
    }
}
