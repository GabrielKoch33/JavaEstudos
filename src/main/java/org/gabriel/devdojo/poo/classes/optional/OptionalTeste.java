package org.gabriel.devdojo.poo.classes.optional;

import java.util.List;
import java.util.Optional;

public class OptionalTeste {
    /**
     * Esse código gera um NullPointerException
     * **/
    public static void main(String[] args) {
        // String nome = retornaNome("Marcos").toLowerCase();
        // System.out.println(nome);

        // Optional.of obriga passar um valor não-nulo, caso contrário gera erro
        Optional<String> optional  = Optional.of("Meu nome é Gabriel");
        System.out.println(optional);
        // ERRO: Optional<String> optional2 = Optional.of(null);

        // ofNullable permite passar um valor nulo, bom quando não temos certeza do retorno/valor de uma variavel
        // Quando possuí valor, retorna um optional com valor
        Optional<String> optional3 = Optional.ofNullable("Meu nome é Gabriel 2");
        System.out.println(optional3);
        // caso contrário retorna um Optional.empty()
        Optional<String> optional4 = Optional.ofNullable(null);
        System.out.println(optional4+" 4 ");

        // Optional vazio
        Optional<String> optional5 = Optional.empty();
        System.out.println(optional5);

        Optional<String> retorno = Optional.ofNullable(retornaNome("Luiz"));
        String nomeReal = retorno.orElse("Nome não encontrado");
        System.out.println(nomeReal);

    }

    private static String retornaNome (String nome) {
        List<String> list = List.of("Gabriel","Júlio","Ana","Eliz");
        int i = list.indexOf(nome);

        if (i != -1) return list.get(i);
        else return null;
    }
}
  
