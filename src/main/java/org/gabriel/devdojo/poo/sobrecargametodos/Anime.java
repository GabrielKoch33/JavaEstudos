package org.gabriel.devdojo.poo.sobrecargametodos;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    // getters e setters ficam no fim do código por terem 'menos relevância'
    public void init(String nome, int episodios){
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String nome, int episodios, String tipo){
        init(nome, episodios);
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(episodios);
        System.out.println(tipo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.episodios = numEpisodios;
    }

    public int getNumEpisodios() {
        return episodios;
    }
}
