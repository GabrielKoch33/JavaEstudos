package org.gabriel.pessoal.ecommerce;

public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private Carrinho carrinho;

    public Usuario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

//    public void adicionaCarrinho(Produto produto) {
//        if (this.carrinho == null) {
//            this.carrinho = new Carrinho();
//        }
//        this.carrinho.adicionaAoCarrinho();
//    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
