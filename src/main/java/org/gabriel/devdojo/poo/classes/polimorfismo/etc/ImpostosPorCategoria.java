package org.gabriel.devdojo.poo.classes.polimorfismo.etc;

public enum ImpostosPorCategoria {
    TECNOLOGIA(10, "Tecnologia/Eletrônicos"),
    ALIMENTO(15, "Comida/Ração"),
    AUTOMOVEL(45, "Veículos Automotivos"),
    ROUPA(20, "Roupas"),
    IMPORTACAO(70, "Produtos Importados"),
    COMMODITIE(8.8, "Soja/Minérios"),
    LIVRE(0, "Produto Livre de Imposto");

    private final double TAXA; // %
    private final String DESCRICAO;

    public double getTAXA() {
        return this.TAXA;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    ImpostosPorCategoria(double valor, String desc) {
        this.TAXA = valor/100;
        this.DESCRICAO = desc;
    }
}
