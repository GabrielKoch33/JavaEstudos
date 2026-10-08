package org.gabriel.devdojo.poo.classes.enumerate;

public class Cliente {
    private enum FaixaEtaria {
        CRIANCA,
        ADOLESCENTE,
        ADULTO,
        IDOSO,
    }
    // Enum privado, pode ser usado apenas dentro dessa classe

    private String nome;
    private String tipo;
    private int idade;
    private FaixaEtaria faixaEtaria;
    private TipoCliente tipoCliente;
    // Verificação manual e nada prática para verificar se um campo é válido e segue convenções do sistema
    public static final String PESSOA_JURIDICA = "PESSOA_JURÍDICA";
    public static final String PESSOA_FISICA = "PESSOA_FÍSICA";

    public Cliente(String nome, String tipo) {
        this.nome = nome;
        if (tipo.equals(PESSOA_FISICA) || tipo.equals(PESSOA_JURIDICA)) {
            this.tipo = tipo;
        }
    }

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
}
