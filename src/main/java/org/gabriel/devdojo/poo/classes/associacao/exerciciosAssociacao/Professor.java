package org.gabriel.devdojo.poo.classes.associacao.exerciciosAssociacao;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminariosMinistrados;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public Seminario[] getSeminariosMinistrados() {
        return seminariosMinistrados;
    }

    public void setSeminariosMinistrados(Seminario... seminariosMinistrados) {
        this.seminariosMinistrados = seminariosMinistrados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
