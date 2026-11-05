package org.gabriel.devdojo.poo.classes.classesinternas;

public class OuterPrivateStatic {
    private int idade = 39;
    private double salario = 2500;
    private char sexo = 'M';

    public void testeDeClassesInternas() {

    }

    private class InnerPrivate {
        public void print() {

        }
    }

    public class InnerPublic {
        public void print() {

        }
    }

    public static class InnerStatic {
        public void print() {

        }
    }

    private static class InnerPrivateStatic {
        public void print() {

        }
    }

    public static void main(String[] args) {
        OuterPrivateStatic o = new OuterPrivateStatic(); // classe outer (instancia padrao)
        InnerPublic inPub = o.new InnerPublic(); // inner public (depende de obj da externa)
    }
}
