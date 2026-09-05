package org.gabriel.devdojo.poo.classes;

public class Loja {
    private int codLoja;
    private String setor;
    private char filial;

    // alt + insert = cria getters, setters e etc
    // ctrl + alt + insert = cria um arquivo no diretório atual
    // ctrl + / = comenta linha

    public void setCodLoja(int codLoja) {
        this.codLoja = codLoja;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setFilial(char filial) {
        this.filial = filial;
    }

    public int getCodLoja() {
        return codLoja;
    }

    public String getSetor() {
        return setor;
    }

    public char getFilial() {
        return filial;
    }
}
