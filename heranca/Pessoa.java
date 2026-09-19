package org.gabriel.devdojo.poo.classes.heranca;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    // protected fornece acesso aos atributos/métodos para qualquer classe no pacote e classes herdeiras, indenpendente do pacote que elas estiverem

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Rua: " + this.endereco.getRua() + " | CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

