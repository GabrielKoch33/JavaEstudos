package org.gabriel.devdojo.poo.classes.classesinternas;


class BoasVindas {
    String nome;

    public BoasVindas(String nome) {
        this.nome = nome;
    }

    public void greetings() {
        System.out.println("Seja bem vindo, "+this.nome+"!");
    }
}
/**
 * Criação rápida de classes através de uma sintaxe enxuta: TipoClasse nome = new TipoClasse() {...}
 * <br><br>
 * Usadas para sobrescrever métodos de classes/interfaces já existêntes sem
 * a necessidade criar um novo arquivo java apenas para sobrescrever.
 * <br><br
 * Toda classe anônima criada é uma subclasse da qual chama
 * <br><br
 * Podem 'instânciar' interfaces, Interface it = new Interface {@Override metodo()}
 * <br><br>
 * Classes anonimas não podem ter construtor próprio pelo fato de não terem nome próprio,
 * porém, podem usar os construtores das classe que ela referencia.
 * **/
public class AnonymousClasses {
    public static void main(String[] args) {
        BoasVindas bv = new BoasVindas("Gabriel");

        BoasVindas bvAnonima = new BoasVindas("Gabriel") {
            private static String module = "CLI";

            @Override
            public void greetings() {
                System.out.println("Boas vindas, "+this.nome+"! Tudo bem?");
                this.tchau();
            }

            public void tchau() {
                System.out.println("Até mais! Considere voltar ao nosso sistema "+this.module);
            }
        };
        bv.greetings();
        bvAnonima.greetings();
    }
}
