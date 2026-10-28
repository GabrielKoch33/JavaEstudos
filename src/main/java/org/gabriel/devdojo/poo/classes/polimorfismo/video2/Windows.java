package org.gabriel.devdojo.poo.classes.polimorfismo.video2;

public class Windows extends Computador {

    public Windows(String marca, int memoria, int ram, String so) {
        super(marca, memoria, ram, so);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Windows");
    }

    @Override
    public void boasVindas() {
        System.out.println("Boas Vindas ao ecossistema Microsoft");
        System.out.println("Esse método existe dentro de Computador, logo também em " + this.marca);
    }

    @Override
    public String exibirSistemaOperacional() {
        return "UNIX/MICROSOFT";
    }

    public void darTelaAzul() {
        System.out.println("TELA AZUL DO WINDOWS");
    }
}
