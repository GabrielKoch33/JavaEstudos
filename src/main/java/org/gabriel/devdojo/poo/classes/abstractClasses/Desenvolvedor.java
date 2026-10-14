package org.gabriel.devdojo.poo.classes.abstractClasses;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return this.salario += (this.salario * 0.3);
    }

    @Override
    public void imprime() {

    }
}
