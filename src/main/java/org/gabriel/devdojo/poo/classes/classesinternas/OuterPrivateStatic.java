package org.gabriel.devdojo.poo.classes.classesinternas;

import org.gabriel.devdojo.poo.classes.classesinternas.OuterPrivateStatic.InnerPublic;
import org.gabriel.devdojo.poo.classes.classesinternas.OuterPrivateStatic.InnerStatic;

public class OuterPrivateStatic {
    private int idade = 39;
    private double salario = 2500;
    private char sexo = 'M';

    public void testeDeClassesInternas() {
        OuterPrivateStatic.InnerPrivate pubInnerPrivate = new InnerPrivate();

        OuterPrivateStatic.InnerPrivateStatic inPrivStatic = new InnerPrivateStatic();
    }

    public static void testeDeClassesInternasStatic() {
        InnerPrivateStatic inPrivStatic = new InnerPrivateStatic();
    }

    /**
     * Depende de um objeto da outer para existir, porem não pode ser criada fora dela, apenas dentro de um método da inner
     * InnerPrivate
     */
    private class InnerPrivate {
        public void print() {

        }
    }

    /**
     * Pode ser criada quando há um objeto da outer, seja via outer.new inner() ou new inner() dentro da classe
     * InnerPublic
     */
    public class InnerPublic {
        public void print() {

        }
    }

    /**
     * Não necessita de um objeto da outer, pertence a classe e pode ser instancia diretamente via inner()
     * InnerStatic
     */
    public static class InnerStatic {
        public void print() {

        }
    }

    /**
     * Muito semelhante a private class pelo fato de só puderem existir dentro um comportamento da outer. porém,
     * essa classe tem o benefício de poder ser usada dentro de métodos static
     * InnerPrivateStatic
     */
    private static class InnerPrivateStatic {
        public void print() {

        }
    }

    public static void main(String[] args) {
        OuterPrivateStatic o = new OuterPrivateStatic();              // classe outer (instancia padrao).
        OuterPrivateStatic.InnerPublic inPub = o.new InnerPublic();   // inner public (depende de obj da externa).

        OuterPrivateStatic.InnerStatic inStatic = new InnerStatic();  // public inner static (pertence a classe, não depende de obj externo).

    }
}
