package org.gabriel.pessoal.lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercício 05 — O Getter que Vaza: Carrinho de Compras.
 * <p>
 * Crie uma classe {@code Carrinho} com um array {@code private} de
 * {@code String} (nomes dos itens) e um {@code getItens()} que retorna
 * esse array diretamente.
 * <p>
 * Agora, no {@code main}, pegue o array retornado pelo {@code getItens()}
 * e altere uma posição dele diretamente (ex: {@code itens[0] = "hackeado"}).
 * Confira se o carrinho original mudou.
 * <p>
 * <b>Pesquise:</b> por que isso acontece mesmo o atributo sendo
 * {@code private}? (Dica: o que exatamente um array "é" em Java — um valor
 * ou uma referência?) Isso é uma das pegadinhas mais comuns de quem está
 * aprendendo encapsulamento.
 */
public class CarrinhoDeCompras {
    private String[] carrinhoArr;
    private List<String> carrinhoList;
    private int tamArr = 0;

    public CarrinhoDeCompras(){
        //
        this.carrinhoArr = new String[5];
        this.carrinhoList = new ArrayList<>();
    }

    public void addArr(String item) {
        this.carrinhoArr[tamArr] = item;
        tamArr++;
    }

    public void removeArr(String item) {
        for (int i = 0; i < getSizeArr()-1; i++) {
            if (carrinhoArr[i] == item) {
                for (int j = i; j < carrinhoArr.length-1; j++) {
                    carrinhoArr[j] = carrinhoArr[j+1];
                }
                tamArr--;
                break;
            }
        }
    }

    public void alteraArr(String itemVelho, String itemNovo) {
        for (int i = 0; i < getSizeArr(); i++) {
            if (carrinhoArr[i] == itemVelho) {
                carrinhoArr[i] = itemNovo;
            }
            break;
        }
    }

    public int getSizeArr() {
        return tamArr;
    }

    public String[] getCarrinhoArr() {
        return carrinhoArr;
    }

    // Array em java não são valores primitivos, suas variaveis não guardam um simples valor,
    // elas guardam o endereço em memória dos valores, alterar em um lugar afeta o  outro
    public static void main(String[] args) {
        // Implemente aqui.
        String item1, item2, item3, item4, item5;
        item1 = "Bola";
        item2 = "Pônei";
        item3 = "Corda";
        item4 = "Laptop";
        item5 = "Avião";

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addArr(item1);
        carrinho.addArr(item2);
        carrinho.addArr(item3);
        carrinho.addArr(item4);
        carrinho.addArr(item5);

        String[] arr = carrinho.getCarrinhoArr();
        for (String item : arr) {
            System.out.println(item);
        }

        carrinho.removeArr("Corda");

        System.out.println("------------------------------------------");

        arr = carrinho.getCarrinhoArr();
        arr[0] = "Minion";
        arr = carrinho.getCarrinhoArr();

        for (String item : arr) {
            System.out.println(item);
        }

        int a = 10;
        int b = a;
        System.out.println(a + "-" + b);
        a = 21;
        System.out.println(a + "-" + b);
    }
}