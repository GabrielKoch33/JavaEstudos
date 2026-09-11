package org.gabriel.devdojo.poo.classes;

public class CarroStatic {
    private String marca;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;
    /**
     * O in
     * */



    public CarroStatic(String marca, double velocidadeMax ) {
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("========================================");
        System.out.println("Marca: "+ this.marca);
        System.out.println("Vel. Máxima: "+ this.velocidadeMax);
        System.out.println("Vel. Limite: "+ CarroStatic.velocidadeLimite);
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

    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
