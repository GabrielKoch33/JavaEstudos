package org.gabriel.devdojo.poo.classes.interfaces;

public class DataBaseLoader implements DataLoader, DataRemover {

    /**
     * Uma classe pode implementar quantas interfaces quiser, basta implementar todos os métodos devidamente
     * **/
    @Override
    public void load() {
        System.out.println("Carregando dados...");
    }

    @Override
    public void removerData() {
        System.out.println("Excluíndo dados");
    }
}
