package org.gabriel.devdojo.poo.classes.associacao.exerciciosAssociacao;

public class Seminario {
    private String titulo;
    private Professor ministrador;
    private Aluno[] participantes;
    private Local local;

    public Seminario(String titulo, Professor ministrador, Local local, Aluno... participantes) {
        this.titulo = titulo;
        this.ministrador = ministrador;
        this.participantes = participantes;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getMinistrador() {
        return ministrador;
    }

    public void setMinistrador(Professor ministrador) {
        this.ministrador = ministrador;
    }

    public Aluno[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Aluno[] participantes) {
        this.participantes = participantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
