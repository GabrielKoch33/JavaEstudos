package org.gabriel.pessoal.listaClaude.l4poo.carrinhoDeCompras;

public class Cliente {

    private String nome;

    private Endereco endereco;

    public Cliente(String nome, String cidade, String rua, String bairro, int numero) {
        this.nome     = nome;
        this.endereco = new Endereco(cidade, rua, bairro, numero);
    }

    @Override
    public String toString() {
        return "Nome: "+this.getNome()+
               "Endereço: "+this.getEndereco();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String exibirEndereco() {
        return this.endereco.toString();
    }

    public void alterarEndereco(String cidade, String rua, String bairro, int numero) {
        this.endereco = new Endereco(cidade, rua, bairro, numero);
    }
}
