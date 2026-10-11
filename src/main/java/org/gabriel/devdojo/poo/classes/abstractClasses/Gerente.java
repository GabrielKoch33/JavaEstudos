package org.gabriel.devdojo.poo.classes.abstractClasses;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return this.salario *= 0.5;
    }
}
