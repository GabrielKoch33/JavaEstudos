package org.gabriel.pessoal.excecoes.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(String nomeUsuario) {
        super("Usuário não encontrado: "+nomeUsuario);
    }
}
