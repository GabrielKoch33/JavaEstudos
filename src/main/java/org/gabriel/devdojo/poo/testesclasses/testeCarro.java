package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.Carro;

public class testeCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.nome = "Chevrolet";
        carro.modelo = "Celta";
        carro.ano = 2012;

        carro.printDados();
        System.out.println(carro.acelerar());
        System.out.println(carro.velocidadeAtual());
        carro.ligarMotor();
        System.out.println(carro.acelerar());
        System.out.println(carro.velocidadeAtual());
    }
}
