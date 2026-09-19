package org.gabriel.pessoal.ecommerce;

public class Cliente {
    private String nome;
    private String cpf;
    private int telefone;
    private Carrinho carrinho;

    public Cliente(int telefone, String nome, String cpf) {
        this(nome, cpf);
        this.telefone = telefone;
    }

    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionaCarrinho(Produto produto) {
        if (this.carrinho == null) {
            this.carrinho = new Carrinho();
        }
        this.carrinho.adicionaAoCarrinho(produto);
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
