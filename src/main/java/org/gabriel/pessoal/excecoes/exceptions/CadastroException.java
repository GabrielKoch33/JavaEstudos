package org.gabriel.pessoal.excecoes.exceptions;

public class CadastroException extends Exception {
    public CadastroException(String message) {
        super("Erro de cadastro: "+message);
    }
}
