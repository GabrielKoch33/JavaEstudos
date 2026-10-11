package org.gabriel.devdojo.poo.classes.abstractClasses;

/**
 * Funcionário agora é abstrato, é uma classe que não pode ser inicializada <br><br>
 * Toda classe Abstrata existe para ser estendida, logo não pode ser final
 * **/
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome= nome;
        this.salario = salario;
        calculaBonus();
        // apesar de existir uma chamada aqui, o objeto a criar será alguma subclasse
        // dessa forma o java busca o método de mesmo nome mais próximo do objeto real
    }

    // Podemos ter métodos concretos (não-abstratos) em classes abstratas
    // O contrário não é válido
    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract double calculaBonus();
}
