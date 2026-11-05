package org.gabriel.devdojo.poo.classes.classesinternas;

public class OuterPrivateStatic {
    private int idade = 39;
    private double salario = 2500;
    private char sexo = 'M';

    public boolean aptoAposentadoria() {
        InnerPrivate in = new InnerPrivate(false);
        return in.validaAposentadoria(idade);
    }

    private class InnerPrivate {
        private boolean isIdoso;

        public InnerPrivate(boolean isIdoso) {
            this.isIdoso = isIdoso;
        }

        public boolean validaAposentadoria(int idade) {
            return (idade >= 60);
        }
    }

    public class InnerPublic {
        private boolean isWoman;

        public boolean validaMulher() {
            return sexo == 'M';
        }
    }

    public static class InnerStatic {

        public static void innerStaticPublic() {
            System.out.println("innerStaticPublic");
        }
    }

    private static class InnerPrivateStatic {
        public static void innerPrivateStatic() {
            System.out.println("innerPrivateStatic");
        }
    }

    public static void main(String[] args) {
        OuterPrivateStatic o = new OuterPrivateStatic(); // classe outer (instancia padrao)
        InnerPublic inPub = o.new InnerPublic(); // inner public (depende de obj da externa)
    }
}
