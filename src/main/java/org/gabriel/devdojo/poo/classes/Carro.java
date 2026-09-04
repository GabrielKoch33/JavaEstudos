package org.gabriel.devdojo.poo.classes;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;
    public boolean ligado = false;

    public void printDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
    }

    public void ligarMotor() {
        System.out.println("Iniciando motor do "+this.nome+"!");
        this.ligado = true;
    }

    public String acelerar() {
        return this.ligado ? "Vrumm" : "Ligue o carro antes de iniciar!";
    }

    public double velocidadeAtual() {
        double velocidade;
        if (this.ligado) {
            return velocidade = Math.random() * 200;
        }
        return 0.0;
    }

}
