package org.gabriel.devdojo.poo.classes.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Teste03 {
    public static void main(String[] args) {
        lerArquivo();
    }

    /**
     * Try with Resources.
     * Usado para quando métodos, objetos ou conexões precisam obrigatoriamente (ou é bom) que sejam fechadas.
     * Ao iniciar o objeto no () do try, o mesmo é morto ao fim do try/catch
     * Muito usado em conexões de banco de dados.
     * Pode ser instanciada mais de uma variavel dentro desse bloco, mas separar elas por ';'.
     * Para que se possa usar o Try with Resources, a objeto deve implementar a interface Closable
     * **/
    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            System.out.println("Sucesso");
        } catch (IOException e) {
            System.out.println("Erro tratado");
        }
    }
}
