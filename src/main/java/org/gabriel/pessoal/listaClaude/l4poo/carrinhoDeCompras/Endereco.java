package org.gabriel.pessoal.listaClaude.l4poo.carrinhoDeCompras;

public class Endereco {

    private String cidade;
    private String rua;
    private String bairro;
    private int numero;

    public Endereco(String cidade, String rua, String bairro, int numero) {
        this.cidade = cidade;
        this.rua    = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cidade: "+this.cidade+
               "Bairro: "+this.bairro+
               "Rua: "+this.rua+
               "nº: "+this.numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }
}
