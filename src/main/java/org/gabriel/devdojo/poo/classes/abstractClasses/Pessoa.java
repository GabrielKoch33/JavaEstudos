package org.gabriel.devdojo.poo.classes.abstractClasses;

public abstract class Pessoa {

    /**
     * Quando uma classe abstrata avô é criada, as futuras classes concretas da 'àrvore genealógica' devem implementar
     * os métodos obrigatóriamente.<br><br>
     * É como pensar que a classe Pai herdou de avô os métodos e por isso as filhas (ou as primeiras classes concretas)
     * devem herdar de seu pai seus métodos.<br><br>
     * É possível que uma classe abstrata implementa o método abstrato do avô, dessa forma as filhas concretas não precisam
     * implementar os métodos obrigatóriamente.
     * **/
    public abstract void imprime();
}
