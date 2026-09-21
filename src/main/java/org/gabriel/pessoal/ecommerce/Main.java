package org.gabriel.pessoal.ecommerce;

import java.util.*;

public class Main {

    static public List<Produto> exibirProdutos(Estoque estoque) {
        Map<Produto, Integer> exibirEstoque = estoque.getEstoque();
        List<Produto> listaProdutos = new ArrayList<>(exibirEstoque.keySet());
        for (int i = 0; i < listaProdutos.size(); i++) {
            Produto produto = listaProdutos.get(i);
            int quantidade = exibirEstoque.get(produto);
            System.out.println("ID: "+(i+1)+"| Produto: "+produto.getNome()+"| Quantidade: "+quantidade);
        }
        return listaProdutos;
    }

    static public List<ItemPedido> exibirCarrinho(Carrinho carrinho) {
        List<ItemPedido> exibirCarrinho = carrinho.getCarrinho();
        for (int i = 0; i < exibirCarrinho.size(); i++) {
            Produto produto = exibirCarrinho.get(i).getProduto();
            int quantidade = exibirCarrinho.get(i).getQuantidade();
            System.out.println("ID:"+(i+1)+"Produto: "+produto.getNome()+" quantidade: "+quantidade);
        }
        return exibirCarrinho;
    }

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

        System.out.println("Informe sua instituição bancária: ");
        String instituicao = input.nextLine();
        System.out.println("Informe sua saldo atual: ");
        double saldoConta = input.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(instituicao, usuario, saldoConta);
        usuario.setContaBancaria(contaBancaria);

        System.out.println("Seja bem vindo, "+usuario.getNome()+"!");
        while (true) {
            System.out.println("=".repeat(30));
            System.out.println("[1] - Adicionar Produtos no Estoque");
            System.out.println("[2] - Ver Produtos Disponíveis");
            System.out.println("[3] - Ver Carrinho");
            System.out.println("[4] - Comprar/Adicionar Carrinho");
            System.out.println("[5] - Finalizar Carrinho ");
            System.out.println("=".repeat(30));
            System.out.print("R: ");
            int escolha = Math.abs(input.nextInt());

            switch (escolha) {
                case 1 -> {
                    input.nextLine();
                    System.out.println("Informe o nome do produto: ");
                    String nomeProd = input.nextLine();
                    System.out.println("Informe uma descrição: ");
                    String descProd = input.nextLine();
                    System.out.println("Informe uma categoria: ");
                    String catProd = input.nextLine();
                    System.out.println("Informe o preço desse produto:");
                    double precoUnit = input.nextDouble();
                    System.out.println("Informe a quantidade em estoque para esse produto: ");
                    int quantidadeDisponivel = input.nextInt();
                    System.out.println("Protudo cadastrado com sucesso!");
                    estoque.adicionarProdutoEstoque(new Produto(nomeProd, descProd, catProd, precoUnit),quantidadeDisponivel);
                }
                case 2 -> {
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio!");
                    } else {
                        Main.exibirProdutos(estoque);
                    }
                }
                case 3 -> {
                    if (carrinho.isEmpty()) {
                        System.out.println("Carrinho vazio!");
                    } else {
                        Main.exibirCarrinho(carrinho);
                    }
                }
                case 4 -> {
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio!");
                    } else {
                        List<Produto> listaEstoque = Main.exibirProdutos(estoque);
                        int qtdItens = listaEstoque.size();
                        int opcao;
                        while (true) {
                            System.out.println("Escolha um produto para comprar: ");
                            opcao = input.nextInt();
                            if (opcao >= 1 && opcao <= qtdItens) {
                                opcao--;
                                break;
                            }
                        }
                        Produto produto = listaEstoque.get(opcao);
                        System.out.println("Escolha uma quantidade para comprar desse produto: ");
                        int quantidadeComprar =  input.nextInt();
                        if (quantidadeComprar > estoque.getQtdItem(produto)) {
                            System.out.println("Não temos essa quantidade disponível para este item!");
                        } else {
                            System.out.println(usuario.getNome()+" comprou "+quantidadeComprar+" de:"+produto.getNome());
                            System.out.println("Deseja adicionar esse item ao carrinho e continuar comprando ou deseja sair para finalizar seu pedido?\n[1] Continuar\n[2] Sair");
                            opcao = 0;
                            while (opcao != 1 && opcao != 2) {
                                opcao = input.nextInt();
                            }
                            ItemPedido itemPedido = new ItemPedido(produto,quantidadeComprar);
                            switch (opcao) {
                                case 1 -> {
                                    carrinho.adicionaItemCarrinho(itemPedido);
                                }
                                case 2 -> {
                                    Pedido pedido = new Pedido(itemPedido);
                                    FinalizarCompra finalizarCompra = new FinalizarCompra();
                                    if (finalizarCompra.finaliza(pedido, usuario)) {
                                        System.out.println("Pedido finalizado com sucesso!");
                                        estoque.decresceQtdOuRemoveItem(produto, quantidadeComprar);
                                    } else {
                                        System.out.println("Saldo insuficiente!");
                                    }
                                }
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.println("teste incompleto");
                }
            }

        }
    }
}
