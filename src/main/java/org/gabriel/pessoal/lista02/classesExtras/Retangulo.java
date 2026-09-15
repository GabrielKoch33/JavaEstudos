package org.gabriel.pessoal.lista02.classesExtras;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Retângulo que na verdade é um quadrado
    public Retangulo(int largura) {
        this(largura,largura);
    }
}
