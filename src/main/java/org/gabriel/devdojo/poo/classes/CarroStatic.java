package org.gabriel.devdojo.poo.classes;

public class CarroStatic {
    private String marca;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;
    public static int maxPessoas = 4;
    /**
     * A declaração de static serve para definir atributos defaults e gerais para TODOS os objetos gerados a partir dessa classe.
     * Como esse atributo é inerente da CLASSE e NÃO da INSTÂNCIA DE UM OBJETO, o mesmo não pode ser acessado usando this.atributo
     * static define um valor padrão para a classe e suas filhas. 'final' impede que alteremos o valor de uma variavel
     * */

    public CarroStatic(String marca, double velocidadeMax) {
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("========================================");
        System.out.println("Marca: "+ this.marca);
        System.out.println("Vel. Máxima: "+ this.velocidadeMax);
        // Essas são as duas formas de se atribuir valores a um atributo PRIVATE STATIC
        System.out.println("Vel. Limite: "+ CarroStatic.velocidadeLimite);
        System.out.println("Vel. Limite: "+ velocidadeLimite);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(double velLimite) {
        velocidadeLimite = velLimite;
    }
}
