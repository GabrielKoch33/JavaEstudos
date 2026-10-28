package org.gabriel.devdojo.poo.classes.polimorfismo.video2;

abstract public class Computador {

    protected String marca;
    protected int memoria;
    protected int ram;
    protected String so;

    public Computador(String marca, int memoria, int ram, String so) {
        this.marca = marca;
        this.memoria = memoria;
        this.ram = ram;
        this.so = so;
    }

    public abstract void ligar();

    public abstract void boasVindas();

    public abstract String exibirSistemaOperacional();

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
}
