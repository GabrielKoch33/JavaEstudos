package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.Estudante;

public class testeEstudante02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luiz";
        estudante.sexo = 'M';
        estudante.idade = 45;
        estudante.imprime();

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Júlia";
        estudante2.idade = 47;
        estudante2.sexo = 'F';
        estudante2.imprime();
    }
}
