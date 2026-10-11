package org.gabriel.devdojo.poo.classes.abstractClasses;

public class RecursosHumanos extends Funcionario {
    public RecursosHumanos(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return this.salario *= 0.3;
    }
}
