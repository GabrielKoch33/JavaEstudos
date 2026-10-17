package org.gabriel.devdojo.poo.classes.polimorfismo;

import org.gabriel.devdojo.poo.classes.polimorfismo.etc.ImpostosPorCategoria;
import org.gabriel.devdojo.poo.classes.polimorfismo.etc.TaxaImposto;

public abstract class Produto implements TaxaImposto {
    private String nome;
    private double valor;
    private String categoria;
    private final double taxa;

    public Produto(String nome, double valor, ImpostosPorCategoria categoriaImposto) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoriaImposto.getDESCRICAO();
        this.taxa = categoriaImposto.getTAXA();
    }

    // Como esse é abstract em Interface, aqui aplicamos ela para não precisarmos reescreve-lo em cada produto filho
    @Override
    public double aplicarImposto() {
        return this.valor + (this.valor * taxa);
    }

    public double valorImposto() {
        return this.valor * this.taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
