package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.Departamento;

import java.util.Objects;

/**
 * Exercício 03 — Associação Muitos-para-Um: Funcionário e Departamento.
 * <p>
 * Crie {@code Departamento} (nome) e {@code Funcionario} (nome, salario, e
 * uma referência para o seu {@code Departamento}). Crie um array de vários
 * {@code Funcionario}, alguns apontando pro mesmo {@code Departamento},
 * outros para departamentos diferentes.
 * <p>
 * Sem alterar a classe {@code Departamento}, escreva a lógica que conta
 * quantos funcionários existem em cada departamento (percorrendo o array
 * de funcionários).
 * <p>
 * <b>Pesquise:</b> repare que é o inverso do exercício 2 — agora vários
 * objetos apontam pra um só, e o objeto apontado ({@code Departamento})
 * não tem ideia de quantos {@code Funcionario} o referenciam.
 */
public class FuncionarioDepartamento {
    private String nome;
    private double salario;
    private Departamento departamento;

    public FuncionarioDepartamento(String nomeFunc, double salarioFunc, Departamento dept) {
        this.nome = nomeFunc;
        this.salario = salarioFunc;
        this.departamento = dept;
    }

    public static void main(String[] args) {
        // Implemente aqui.
        FuncionarioDepartamento[] listaEmpregados = new FuncionarioDepartamento[10];

        Departamento rh = new Departamento("Recursos Humanos");
        Departamento tec = new Departamento("Tecnologia");
        Departamento almoxarifado = new Departamento("Almoxarifado");

        FuncionarioDepartamento f1 = new FuncionarioDepartamento("Ana Silva", 4500.0, rh);
        FuncionarioDepartamento f2 = new FuncionarioDepartamento("Bruno Souza", 3800.0, rh);
        FuncionarioDepartamento f3 = new FuncionarioDepartamento("Carlos Oliveira", 5200.0, tec);
        FuncionarioDepartamento f4 = new FuncionarioDepartamento("Daniela Lima", 6100.0, tec);
        FuncionarioDepartamento f5 = new FuncionarioDepartamento("Eduardo Santos", 2900.0, almoxarifado);
        FuncionarioDepartamento f6 = new FuncionarioDepartamento("Fernanda Costa", 4200.0, rh);
        FuncionarioDepartamento f7 = new FuncionarioDepartamento("Gabriel Almeida", 3500.0, almoxarifado);
        FuncionarioDepartamento f8 = new FuncionarioDepartamento("Helena Ribeiro", 7000.0, tec);
        FuncionarioDepartamento f9 = new FuncionarioDepartamento("Igor Carvalho", 4800.0, almoxarifado);
        FuncionarioDepartamento f10 = new FuncionarioDepartamento("Juliana Rocha", 5500.0, tec);

        listaEmpregados[0] = f1;
        listaEmpregados[1] = f2;
        listaEmpregados[2] = f3;
        listaEmpregados[3] = f4;
        listaEmpregados[4] = f5;
        listaEmpregados[5] = f6;
        listaEmpregados[6] = f7;
        listaEmpregados[7] = f8;
        listaEmpregados[8] = f9;
        listaEmpregados[9] = f10;

        int countRh, countTec, countAlmoxarifado, outros;
        countRh =  countTec = countAlmoxarifado = outros = 0;
        for (FuncionarioDepartamento func : listaEmpregados) {
            switch (func.departamento.getNome()) {
                case "Recursos Humanos":
                    countRh++;
                    break;
                case "Tecnologia":
                    countTec++;
                    break;
                case "Almoxarifado":
                    countAlmoxarifado++;
                    break;
                default:
                    outros++;
                    break;
            }
        }
        System.out.println("RH: "+countRh);
        System.out.println("TECNOLOGIA: "+countTec);
        System.out.println("ESTOQUE/ALMOXARIFADO: "+countAlmoxarifado);
    }
}