package org.gabriel.devdojo.poo.classes.abstractClasses;

public class Faxineiro extends Funcionario {
    public Faxineiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return this.salario *= 0.1;
    }

}
