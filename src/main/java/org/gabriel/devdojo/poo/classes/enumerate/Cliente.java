package org.gabriel.devdojo.poo.classes.enumerate;

public class Cliente {

    private String nome;
    private String tipo;
    private int idade;
    private FaixaEtaria faixaEtaria;
    private TipoCliente tipoCliente;

    // Utilização de Enum para padronizar campos
    public Cliente (String nome, int idade, TipoCliente tipoCli) {
        this.nome = nome;
        this.tipoCliente = tipoCli;
        this.faixaEtaria = switch (idade) {
            case int i when i <= 12 -> FaixaEtaria.CRIANCA;
            case int i when i < 18  -> FaixaEtaria.ADOLESCENTE;
            case int i when i < 60  -> FaixaEtaria.ADULTO;
            default                 -> FaixaEtaria.IDOSO;
        };
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
