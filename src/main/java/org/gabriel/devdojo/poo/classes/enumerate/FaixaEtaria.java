package org.gabriel.devdojo.poo.classes.enumerate;

public enum FaixaEtaria {
    CRIANCA(100, 0, 80, 20),
    ADOLESCENTE(80, 30, 80, 50),
    ADULTO(20, 80, 0, 100),
    IDOSO(0, 100, 100, 0);

    private final double VIGOR;
    private final double DINHEIRO;
    private final double TEMPO;
    private final double RESPONSABILIDADES;

    FaixaEtaria(double vigorPorcentagem,
                double dinheiroPorcentagem,
                double tempoPorcentagem,
                double responsaPorcentagem)
    {
     this.VIGOR = vigorPorcentagem ;
     this.DINHEIRO = dinheiroPorcentagem;
     this.TEMPO = tempoPorcentagem;
     this.RESPONSABILIDADES = responsaPorcentagem;
    }

    public double getVIGOR() {
        return VIGOR;
    }

    public double getDINHEIRO() {
        return DINHEIRO;
    }

    public double getTEMPO() {
        return TEMPO;
    }

    public double getRESPONSABILIDADES() {
        return RESPONSABILIDADES;
    }
}
