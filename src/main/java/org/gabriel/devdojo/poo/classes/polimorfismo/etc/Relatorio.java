package org.gabriel.devdojo.poo.classes.polimorfismo.etc;

import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Produto;
import org.gabriel.devdojo.poo.classes.polimorfismo.video1.Tomate;

public class Relatorio {
    public static void emitirRelatorioFiscal (Produto produto) {
        System.out.println("Nome: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Categoria: "+ produto.getCategoria());
        System.out.println("Taxa sobre Categoria: " + (produto.getTaxa()*100) + "%");
        System.out.println("Valor do Imposto: R$"+ produto.valorImposto());
        System.out.println("Valor Final (Base + Imposto): R$"+ produto.aplicarImposto());

        // Abaixo vamos passar um objeto do tipo Tomate, uma especificação de Produto
        // Ainda é permitido, porém vamos querer acessar um atributo único de Tomate

        // Isso funciona quando o objeto passado é de fato um Tomate
        // Porém se for outro objeto de mesmo nível hierárquico (Computador ou quaisquer
        // que herdem de Produto, vai dar erro.
        // Isso só funciona de pai para filho
        // ===================================
        //Tomate tomate = (Tomate) produto;

        // Vertica se o parâmetro 'produto' aponta para um objeto do tipo Tomate
        if (produto instanceof Tomate tomate) {
            // Basicamente o mesmo que:
            //  Tomate tomate = (Tomate) produto
            System.out.println("Data de Validade: "+tomate.getDataValidade());
        }
    }
}
