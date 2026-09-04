package org.gabriel.devdojo.poo.classes;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("-----------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("-----------------------------");
        // this. acessa o valor guardado no atributo.
        // O valor do atributo é referente ao objeto que chamou o método
        // objetos diferentes com dados diferentes armazenados ao chamar o mesmo atributo (this.nome) retornarão valores
        // diferentes
    }
}
