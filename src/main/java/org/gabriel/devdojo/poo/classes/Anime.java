package org.gabriel.devdojo.poo.classes;

import java.util.Scanner;

public class Anime {
    // ATRIBUTOS SÃO INICIADOS ANTES MESMO DOS CONSTRUTORES PELO JAVA
    private String nome;
    private String tipo;
    private int episodios;
    private int idadeIndicativa;
    private int[] temporadas; // Um array NÃO INICIALIZADO
    {
        System.out.println("BLOCO DE INICIALIZAÇÃO");
        System.out.println("RODA SEMPRE QUE CRIADO UM OBJETO, ANTES MESMO DO CONSTRUTOR");
        temporadas = new int[100];
        for (int i = 0; i < temporadas.length; i++){
            temporadas[i] = i+1;
        }
        System.out.println("FINALIZAMOS A CRIAÇÃO DA LISTA, ISSO VAI SER FEITO EM TODOS OS OBJETOS");
    }

    // CONSTRUTOR ANTIGO
    public Anime(String nome, String tipo, int episodios) {
        this();
        System.out.println("Acessado pelo construtor novo");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    // CONSTRUTOR NOVO
    public Anime(String nome, String tipo, int episodios, int idadeIndicativa){
        this(nome, tipo, episodios);
        System.out.println("PRIMEIRO A SER CHAMADO, ÚLTIMO A SER EXECUTADO");
        this.idadeIndicativa = idadeIndicativa;
        // Novos atributos criados serão adicionados aqui
        // Tirando a necessidade de refatorarmos códigos e objetos antigos
    }

    // CONSTRUTOR VAZIO
    public Anime(){
        System.out.println("Acessado pelo this() do CONSTRUTOR ANTIGO");
    }

    // SOBRECARGA DE MÉTODOS
    public void init(String nome, int episodios){
        this.nome = nome;
        this.episodios = episodios;
    }
    // SOBRECARGA DE MÉTODOS
    public void init(String nome, int episodios, String tipo){
        init(nome, episodios);
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(episodios);
        System.out.println(tipo);
        for (int temp : this.temporadas){
            System.out.println(temp);
        }
    }

    // getters e setters ficam no fim do código por terem 'menos relevância'
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
