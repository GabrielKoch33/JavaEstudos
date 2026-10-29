package org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.services;

import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.repositorioInterface.Repository;

public class RepositorioBancoDados implements Repository {

    @Override
    public void salvar() {
        System.out.println("salvando em banco de dados");
    }
}
