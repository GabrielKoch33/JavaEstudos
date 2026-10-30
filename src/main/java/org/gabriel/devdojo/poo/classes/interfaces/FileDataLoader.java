package org.gabriel.devdojo.poo.classes.interfaces;

public class FileDataLoader implements DataLoader, DataRemover {

    /**
     * Não devemos nunca reduzir a visibilidade de um método ao herdar ou implementar
     * A ideia é que a classe/interface Pai dê as ordem de como os métodos devem ser aplicados,
     * a Filha nunca deve desobedecer.
     **/
    @Override
    public void load() {
        System.out.println("Lendo arquivo...");
    }

    @Override
    public void removerData() {
        System.out.println("Excluíndo arquivo...");
    }

    /**
     * Método não-abstrato da interface (não obrigatório) sendo sobrescrito
     * **/
//    @Override
//    public boolean habilitarAdicionais() {
//        return true;
//    }
}
