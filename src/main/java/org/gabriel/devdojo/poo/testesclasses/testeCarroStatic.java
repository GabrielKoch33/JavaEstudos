package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.CarroStatic;

public class testeCarroStatic {
    public static void main(String[] args) {
        CarroStatic c1 = new CarroStatic("FERRARI", 270);
        CarroStatic c2 = new CarroStatic("BMW", 189);
        CarroStatic c3 = new CarroStatic("BUGGATI", 300);

         //CarroStatic.velocidadeLimite = 500;
        // Como esse atributo pertence a classe, não há necessidade de termos instâncias da classe.
        // O atributo é alheio aos objetos e é inerente a classe, fazendo com que todos os objetos criados
        // recebam esse valor

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

