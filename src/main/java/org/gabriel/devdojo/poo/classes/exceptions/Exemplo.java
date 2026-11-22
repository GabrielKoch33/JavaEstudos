package org.gabriel.devdojo.poo.classes.exceptions;

import java.io.File;
import java.io.IOException;

public class Exemplo {

    /**
     * Exceções que herdam de runtime NÃO precisam obrigatoriamente propagar via throws
     * assim como também quem chama não é obrigado a tratar via try catch (vai dar erro caso caia no catch).
     * Sendo assim o uso de throws opcional.
     * **/
    public static void validaIdade(int age) {
        if (age < 18) {
            throw new testeRuntime("bola");
        }
        System.out.println("Idade correta!");
    }

    /**
     * Exceções checked (herdam de Exception) além de é claro lançar via throw new
     * elas também devem ser propagadas via throws.
     * Quem chamou o método 'perigoso' deve tratar ou então lançar novamente via throws
     * **/
    public static void lancaException(int age) throws testeException {
        if (age == 20) {
            throw new testeException("Erro cabuloso");
        }
    }

    public static void main(String[] args) {
        // erros
        // problemas externos ao desenvolvedor e ao código
        // podem se referir a erros na jvm, no hardware, falta de recursos
        // não possuem tratamentos

        int[] arr = {1,2,3};
        try {
            System.out.println("tentando acessar índice inexistente");
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        }
        System.out.println("fluxo comum aqui");

        Object obj = null;
        try {
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            System.out.println("Objeto null");
        }

        File f = new File("arquivo.txt");
        try {
            // caso ocorra erro, quaisquer coisas abaixo do ponto de erro são ignoradas
            boolean isFileCreated = f.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) { // caso ocorra erro, não quebre o script e trate ele (nunca deixe em branco)// ;
            e.printStackTrace();
            System.out.println("erro de leitura");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("erro de divisão por 0");
        }
        // caso não ocorra erro, o compilador pula para essa linha e volta ao código normal

        try {
            validaIdade(15);
        } catch (testeRuntime e) {
            System.out.println("idade menor de 18");
        }

        validaIdade(78);

        try {
            lancaException(45);
        } catch (testeException e) {
            System.out.println("erro cabuloso");
        }


    }
}
