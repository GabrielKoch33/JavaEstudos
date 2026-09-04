package org.gabriel.devdojo.poo.testesclasses;
import org.gabriel.devdojo.poo.classes.Estudante;

public class testeEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';
        // É possível usar os atributos sem declarar valores;
        // Porém o valor será o padrão fornecido pelo java (null, 0, false);
        // Definir valores dentro da classe tornará aquele valor padrão para TODOS os objetos criados;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

        // Goku sobreescreveu Gabriel
        estudante.nome = "Goku";
        System.out.println(estudante.nome);

    }
}
