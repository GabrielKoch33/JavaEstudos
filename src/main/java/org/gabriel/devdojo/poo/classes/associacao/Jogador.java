package org.gabriel.devdojo.poo.classes.associacao;

public class Jogador {
    private String nome;
    private String time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
