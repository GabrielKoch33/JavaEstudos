package org.gabriel.devdojo.poo.testesclasses;

import org.gabriel.devdojo.poo.classes.Anime;

import java.util.Scanner;

public class testeAnime {
    public static void main(String[] args) {
        Anime anime = new Anime("ABC","IJK",100,18);

        // Vamos supor que seu chefe lhe peça para criar um atributo de gênero
        // Inicialmente você tem que dar set(), ajustar parâmetros, adicionar ao inicializador,
        // corrigir entradas...
        // com a sobrecarga de métodos, é possível utilizar o mesmo nome de um método para chama lo novamente
        // apenas alterando a quantidade e tipos dos parâmetros
        // O maior exemplo disso é o println(), pois a depender do tipo dos parâmetros, o java em tempo de execução analisa
        // o tipo dos dados e decide qual chamada de método realizar. Caso contrário, seria necessário usar printInt, printDouble...
        // outro exemplo é em uma calculadora, onde métodos identificam os tipos dos parâmetros e
        // realizam operações de tipo int ou double
        // isso é POLIMORFISMO, métodos com nomes iguais assumindo comportamentos diferentes conforme os parâmetros

        anime.init("nomeAnime",14,"tipo");
        anime.imprime();
    }
}
