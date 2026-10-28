package org.gabriel.devdojo.poo.classes.polimorfismo.video2;

public class Mac extends Computador {

    public Mac(String marca, int memoria, int ram, String so) {
        super(marca,memoria,ram,so);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Apple");
    }

    @Override
    public void boasVindas() {
        System.out.println("Boas Vindas ao ecossistema Apple");
        System.out.println("Esse método existe dentro de Computador, logo também em " + this.marca);
    }

    @Override
    public String exibirSistemaOperacional() {
        return "UNIX/APPLE";
    }

    public void bloquearFontesPiratas() {
        System.out.println("Impedido de baixar minecraft pirata");
    }
}
