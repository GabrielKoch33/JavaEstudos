package org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.services;

import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.repositorioInterface.Repository;

public class RepositorioArquivo implements Repository {

    @Override
    public void salvar() {
        System.out.println("salvando em arquivo");
    }
}
