package org.gabriel.devdojo.poo.classes.exceptions;

import java.io.File;
import java.io.IOException;

public class Exemplo {

    public static void validaIdade(int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
        System.out.println("Idade correta!");
    }

    public static void main(String[] args) {
        // erros
        // problemas externos ao desenvolvedor e ao código
        // podem se referir a erros na jvm, no hardware, falta de recursos
        // não possuem tratamentos

        // unchecked (erro em run time)
        // o compilador não avisa te erros
        // erros que o desenvolvedor deveria ter previsto
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


        // checked
        // o compilador te avisa de erros antes mesmo do programa rodar
        // ações que são frágeis e que devem ser verificadas antes de fazer
        // exigem tratar com Try Catch

        File f = new File("arquivo.txt");
        try {  // tente fazer essa operação arriscada // caso ocorra erro, quaisquer coisas abaixo do ponto de erro são ignoradas
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
            Exemplo.validaIdade(15);
        } catch (Exception e) {
            throw new RuntimeException("idade menor de 18");
        }
    }
}
