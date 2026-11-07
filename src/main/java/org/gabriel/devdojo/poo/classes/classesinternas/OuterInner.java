package org.gabriel.devdojo.poo.classes.classesinternas;

/**
 * 
 * **/
public class OuterInner {
    private String nome = "Gabriel Koch da Silva";

    /**
     * Possui atributos e métodos próprios e acesso à objetos da classe externa
     * **/
    public class Inner {
        private String dataAtual = "05/11/2026";

        public void printOuterDados() {
            System.out.println(nome);
        }

        public void printInnerDados() {
            System.out.println(this.dataAtual);
            System.out.println(this + "This refere-se ao contexto que é chamado (nesse caso a INNER)");
            System.out.println(OuterInner.this + "Esse this refere-se a externa (Outer.this)");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        OuterInner outer1 = new OuterInner();
        OuterInner.Inner inner1 = outer1.new Inner();
        OuterInner.Inner inner2 = new OuterInner().new Inner();

        inner1.printOuterDados();
        inner2.printInnerDados();

    }
}
