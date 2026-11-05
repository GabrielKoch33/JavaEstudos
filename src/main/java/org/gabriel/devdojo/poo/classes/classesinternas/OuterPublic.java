package org.gabriel.devdojo.poo.classes.classesinternas;

/**
 * Muito usado em interfaces gráficas quando um componente depende e está estritamente conectado
 * ao elemento/componente externo.
 * Ex: Tela Principal -> Tela de ChatBot -> Tela de Teclado e Envio
 *
 * Usado no Design Pattern Builder()
 * **/
public class OuterPublic {
    private String nome = "Gabriel Koch da Silva";

    /**
     * Possui atributos e métodos próprios e acesso à objetos da classe externa
     * **/
    class Inner {
        private String dataAtual = "05/11/2026";

        public void printOuterDados() {
            System.out.println(nome);
        }

        public void printInnerDados() {
            System.out.println(this.dataAtual);
            System.out.println(this + "This refere-se ao contexto que é chamado (nesse caso a INNER)");
            System.out.println(OuterPublic.this + "Esse this refere-se a externa (Outer.this)");
        }
    }

    public static void main(String[] args) {
        OuterPublic outer1 = new OuterPublic();
        OuterPublic.Inner inner1 = outer1.new Inner();
        OuterPublic.Inner inner2 = new OuterPublic().new Inner();

        inner1.printOuterDados();
        inner2.printInnerDados();

    }
}
