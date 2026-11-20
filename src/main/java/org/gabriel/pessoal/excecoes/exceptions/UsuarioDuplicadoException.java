package org.gabriel.pessoal.excecoes.exceptions;

public class UsuarioDuplicadoException extends CadastroException {
    public UsuarioDuplicadoException(String email) {
        super("Email já cadastrado: "+email);
    }
}
