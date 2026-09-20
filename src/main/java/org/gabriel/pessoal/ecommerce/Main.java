package org.gabriel.pessoal.ecommerce;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Carrinho carrinho = new Carrinho();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("Informe seu CPF: ");
        String cpf = input.nextLine();
        System.out.println("Informe seu telefone: ");
        String telefone = input.nextLine();

        Usuario usuario = new Usuario(nome, cpf, telefone);
        System.out.println("Seja bem vindo, "+usuario.getNome()+"!");
        while (true) {
            System.out.println("=".repeat(30));
            System.out.println("[1] - Adicionar Produtos no Estoque");
            System.out.println("[2] - Ver Produtos Disponíveis");
            System.out.println("[3] - Ver Carrinho");
            System.out.println("[4] - Comprar");
            System.out.println("[5] - Finalizar Pedido");
            System.out.println("=".repeat(30));

            int escolha = Math.abs(input.nextInt());

            switch (escolha) {
                case 1 -> {
                    System.out.println("Informe o nome do produto: ");
                    String nomeProd = input.nextLine();
                    System.out.println("Informe uma descrição: ");
                    String descProd = input.nextLine();
                    System.out.println("Informe uma categoria: ");
                    String catProd = input.nextLine();
                    double precoUnit = input.nextDouble();
                    int quantidadeDisponivel = input.nextInt();
                    estoque.adicionarProdutoEstoque(new Produto(nomeProd, descProd, catProd, precoUnit),quantidadeDisponivel);
                }
                case 2 -> {
                    Map<Produto, Integer> exibirEstoque = estoque.getEstoque();
                    if (exibirEstoque == null) {
                        System.out.println("Estoque vazio, nada para exibir");
                    } else {
                        int id = 1;
                        for (Produto produto : exibirEstoque.keySet()) {
                            System.out.println("ID: "+id+"| P: "+produto.toString()+" | Q: "+exibirEstoque.get(produto));
                        }
                    }
                }
                case 3 -> {
                    List<ItemPedido> exibirCarrinho = carrinho.getCarrinho();
                    if (exibirCarrinho == null) {
                        System.out.println("Carrinho vazio, nada para exibir!");
                    } else {
                        int id = 1;
                        for (ItemPedido item : exibirCarrinho) {
                            Produto prod = item.getProduto();
                            System.out.println("ID: "+id+" | ITEM: "+prod.getNome()+"| QTD: "+item.getQuantidade());
                        }
                    }
                }
                case 4 -> {

                }
            }

        }
    }
}
