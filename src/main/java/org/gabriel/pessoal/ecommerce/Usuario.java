package org.gabriel.pessoal.ecommerce;

import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private ContaBancaria contaBancaria;
    private Carrinho carrinho;

    @Override
    public String toString() {
        return "Nome: "+nome+" CPF:"+cpf+" Telefone:"+telefone;
    }

    public Usuario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.carrinho = new Carrinho();
    }

    public double saldoDaConta() {
        return this.contaBancaria.getSaldoConta();
    }

    public boolean descontaSaldo(double valor) {
        return this.contaBancaria.descontaSaldo(valor); // delega, Lei de Demeter ok
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<ItemPedido> getCarrinho() {
        return carrinho.getCarrinho();
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public String getContaBancaria() {
        return contaBancaria.toString();
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}
