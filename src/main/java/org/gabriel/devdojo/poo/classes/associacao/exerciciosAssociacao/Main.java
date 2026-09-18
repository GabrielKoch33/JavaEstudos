package org.gabriel.devdojo.poo.classes.associacao.exerciciosAssociacao;

public class Main {
    public static void main(String[] args) {

        Local loc1 = new Local("Auditório");
        Local loc2 = new Local("Escola");

        Professor professor1 = new Professor("André","Física");
        Professor professor2 = new Professor("Saulo", "Medicina");

        Aluno gabriel = new Aluno("Gabriel", 19);
        Aluno paulo = new Aluno("Paulo",21);
        Aluno ana = new Aluno("Ana",19);
        Aluno manu = new Aluno("Manu",20);

        Aluno[] alunosInscritos = {paulo, ana};
        Seminario seminario1 = new Seminario("ABC1", professor1, loc1,alunosInscritos);
        professor1.setSeminariosMinistrados(seminario1);
        paulo.setSeminario(seminario1);
        ana.setSeminario(seminario1);

        Aluno[] alunosInscritos2 = {gabriel, manu};
        Seminario seminario2 = new Seminario("VA11", professor2, loc2, alunosInscritos2);
        professor2.setSeminariosMinistrados(seminario2);
        gabriel.setSeminario(seminario2);
        gabriel.setSeminario(seminario2);
    }
}
