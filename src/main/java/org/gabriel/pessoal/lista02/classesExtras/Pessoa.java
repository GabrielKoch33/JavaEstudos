package org.gabriel.pessoal.lista02.classesExtras;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        // Quando o atributo e o parâmetro possuem o mesmo nome
        // devemos usar this.atributo, pois o Java vai priorizar aquela variável
        // com menor escopo (local ≥ atributo ≥ global)
    }

    public void apresentar() {
        imprimirDetalhes(this);
        // this == objeto/instância atual
    }

    public void imprimirDetalhes(Pessoa pessoa) {
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
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
}
