package org.gabriel.devdojo.poo.classes.exceptions;

import java.io.IOException;
import java.io.InvalidObjectException;

public class Exemplo02 {

    private static int lancador01() throws ArithmeticException {
        int a, b;
        a = 10;
        b = 0;
        return a/b;
    }

    public static int calculadoraBurra() throws IllegalArgumentException, InvalidObjectException {
        try {
            return lancador01();
        }
        catch (ArithmeticException e) {
            if (54 < 545) throw new IllegalArgumentException("Erro de divisão", e);
            else throw new InvalidObjectException("Erro doido", e);
        }
    }

    public static void main(String[] args) {
        try {
            calculadoraBurra();
        }
        /**
         * Usamos '|' para ter um 'leque' de exceções que podem ser capturadas
         * **/
        catch (IllegalArgumentException | InvalidObjectException e) {
            System.out.println(e.getMessage() + "\n"+e.getCause());
        }
        finally {
            System.out.println("tratamento completo");
            System.out.println("Ocorre sem que o try acontece (ou o catch)");
        }
    }
}
