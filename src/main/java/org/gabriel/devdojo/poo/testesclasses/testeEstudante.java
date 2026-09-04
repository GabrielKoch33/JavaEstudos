package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.Estudante;

public class testeEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luiz";
        estudante.sexo = 'M';
        estudante.idade = 45;
        estudante.imprime();

        // É possível usar os atributos sem declarar valores;
        // Porém o valor será o padrão fornecido pelo java (null, 0, false);
        // Definir valores dentro da classe tornará aquele valor padrão para TODOS os objetos criados;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Júlia";
        estudante2.idade = 47;
        estudante2.sexo = 'F';
        estudante2.imprime();

        estudante.imprimeMaterias(
                "Geografia",
                "Matemática",
                "Português",
                "Inglês");

    }
}
