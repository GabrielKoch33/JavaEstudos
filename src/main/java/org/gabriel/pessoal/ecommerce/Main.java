package org.gabriel.pessoal.ecommerce;

import java.util.*;
import org.gabriel.pessoal.ecommerce.*;

public class Main {

    static public List<Produto> exibirProdutos(Map<Produto,Integer> estoque) {
        List<Produto> listaProdutos = new ArrayList<>(estoque.keySet());
        int i = 0;
        System.out.println("========================================================================");
        for (Produto prod : estoque.keySet()) {
            System.out.println("ID: "+(i+1)+" | "+prod.toString()+" | Quantidade: "+estoque.get(prod));
            i++;
        }
        System.out.println("========================================================================");
        return listaProdutos;
    }

    static public int exibirCarrinho(List<ItemPedido> carrinho) {
        int i = 0;
        System.out.println("========================================================================");
        for (ItemPedido item : carrinho) {
            System.out.println("ID:"+(i+1)+" | "+item.toString());
            i++;
        }
        System.out.println("========================================================================");
        return i;
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.println("Informe seu CPF: ");
        String cpf = input.nextLine();
        System.out.println("Informe seu telefone: ");
        String telefone = input.nextLine();

        System.out.println("Informe sua instituição bancária: ");
        String instituicao = input.nextLine();
        System.out.println("Informe sua saldo atual: ");
        double saldoConta = input.nextDouble();

        Usuario usuario = new Usuario(nome, cpf, telefone, instituicao, saldoConta);

        System.out.println("Seja bem vindo, "+usuario.getNome()+"!");
        while (true) {
            System.out.println("=".repeat(30));
            System.out.println("[0] - Depositar mais dinheiro (Não diga nada ao leão)");
            System.out.println("[1] - Adicionar Produtos no Estoque");
            System.out.println("[2] - Ver Produtos Disponíveis");
            System.out.println("[3] - Ver Carrinho");
            System.out.println("[4] - Comprar/Adicionar Carrinho");
            System.out.println("[5] - Revisar Carrinho");
            System.out.println("[6] - Finalizar Carrinho ");
            System.out.println("=".repeat(30));
            System.out.print("R: ");
            int escolha = Math.abs(input.nextInt());
            input.nextLine();
            switch (escolha) {
                case 0 -> {
                    System.out.println("Informe uma quantia para depositar: ");
                    double valor = input.nextDouble();
                    usuario.guardarDinheiro(valor);
                }
                case 1 -> {
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
                        Main.exibirProdutos(estoque.getEstoque());
                    }
                }
                case 3 -> {
                    if (usuario.getCarrinho().isEmpty()) {
                        System.out.println("Carrinho vazio!");
                    } else {
                        Main.exibirCarrinho(usuario.getCarrinho());
                    }
                }
                case 4 -> {
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio!");
                    } else {
                        List<Produto> listaEstoque = Main.exibirProdutos(estoque.getEstoque());
                        int sizeEstoque = listaEstoque.size();
                        int opcao;
                        while (true) {
                            System.out.println("Escolha um [ID] produto para comprar: ");
                            opcao = input.nextInt();
                            if (opcao >= 1 && opcao <= sizeEstoque) {
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
                            ItemPedido itemPedido = new ItemPedido(produto, quantidadeComprar);
                            switch (opcao) {
                                case 1 -> {
                                    usuario.adicionarAoCarrinho(itemPedido);
                                    estoque.decresceQtdOuRemoveItem(produto, quantidadeComprar);
                                    System.out.println("Item adicionado ao carrinho!\nLembre-se: Use a opção [5] para que os itens do seu Carrinho sejam efetivamente comprados!");
                                }
                                case 2 -> {
                                    Pedido pedido = new Pedido(itemPedido);
                                    if (usuario.temDinheiro(pedido.getValorFinal())) {
                                        FinalizarCompra.finaliza(pedido,usuario);
                                        System.out.println("Pedido finalizado com sucesso!");
                                        if (estoque.decresceQtdOuRemoveItem(produto, quantidadeComprar)) {
                                            System.out.println("Acabaram as unidades desse produto! Volte mais tarde caso deseje mais do mesmo!");
                                            break;
                                        }
                                        System.out.println("**!Estoque atualizado!**");
                                    } else {
                                        System.out.println("Saldo insuficiente, o item foi devolvido ao estoque!");
                                    }
                                }
                            }
                        }
                    }
                }
                case 5 -> {
                    if (usuario.carrinhoTemItens()) {
                        System.out.println("Carrinho vazio, nada para finalizar!");
                    } else {
                        int tamCarrinho = Main.exibirCarrinho(usuario.getCarrinho());
                        System.out.println("Ainda deseja revisar algum pedido?\n[S] - Sim\n[N] - Não");
                        String revisar = String.valueOf(input.next().toLowerCase().trim().charAt(0));
                        if (revisar.equals("n")) {
                            break;
                        }
                        System.out.println("=========================================================");
                        int opcao;
                        while (true) {
                            System.out.println("Escolha um [ID] produto para revisar: ");
                            opcao = input.nextInt();
                            if (opcao >= 1 && opcao <= tamCarrinho) {
                                opcao--;
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("[1] Comprar mais\n[2] Comprar menos\n[3] Remover item ");
                            opcao = input.nextInt();
                            if (opcao >= 1 && opcao <= 3) {
                                break;
                            }
                            // incompleto
                        }
                    }
                }
                case 6 -> {
                    if (usuario.carrinhoTemItens()) {
                        System.out.println("Carrinho vazio, nada para finalizar!");
                        break;
                    }
                    System.out.println();
                    // incompleto
                }
            }
        }
    }
}
