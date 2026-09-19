package org.gabriel.pessoal.ecommerce;

public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private double precoUnit;

    public Produto(String nome, String descricao, String categoria, double precoUnit) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.precoUnit = precoUnit;
    }

    @Override
    public String toString() {
        return "Produto = {Nome:"+this.nome+"; Descrição: "+this.descricao+"; Categoria: "+this.categoria+" Preço Unitário:"+this.precoUnit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
}
