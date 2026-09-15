package org.gabriel.pessoal.lista02.classesExtras;

public class Cliente {
    private String nome;
    private int idade;
    private String email;

    public Cliente(String nome, int idade, String email) {
        if(idade < 0) {
            return;
        }
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void imprime() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
