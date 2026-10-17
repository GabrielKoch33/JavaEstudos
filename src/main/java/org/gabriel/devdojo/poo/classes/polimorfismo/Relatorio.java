package org.gabriel.devdojo.poo.classes.polimorfismo;

public class Relatorio {
    public static void emitirRelatorioFiscal (Produto produto) {
        System.out.println("Nome: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Categoria: "+ produto.getCategoria());
        System.out.println("Taxa sobre Categoria: " + (produto.getTaxa()*100) + "%");
        System.out.println("Valor do Imposto: R$"+ produto.valorImposto());
        System.out.println("Valor Final (Base + Imposto): R$"+ produto.aplicarImposto());
    }
}
