package org.gabriel.pessoal.listaClaude.l4poo;

/**
 * <h2>Carrinho de compras: associação e composição</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> associação, composição, cópia defensiva, arrays de objetos, {@code long} para dinheiro</p>
 *
 * <h3>Objetivo</h3>
 * <p>Modelar objetos que se relacionam e proteger o estado interno da exposição acidental.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Modele {@code Cliente} (nome e {@code Endereco}), {@code Produto}, {@code ItemPedido} (produto, quantidade, preço unitário no momento da compra) e {@code Pedido} (cliente, itens, desconto).</p>
 * <p>O {@code Pedido} calcula subtotal, desconto e total, e imprime uma nota fiscal formatada.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>O {@code Pedido} guarda seus itens em array interno; o getter devolve uma <b>cópia</b> (cópia defensiva).</li>
 *   <li>Adicionar o mesmo produto duas vezes soma a quantidade em vez de criar outro item.</li>
 *   <li>O preço unitário no item é copiado do produto na hora da compra: mudar o preço do produto depois não altera pedidos antigos (provar no {@code main}).</li>
 *   <li>Desconto progressivo: 5% acima de R$ 200,00; 10% acima de R$ 500,00.</li>
 *   <li>Dinheiro em centavos ({@code long}); a nota formata em reais.</li>
 *   <li>Escrever um comentário explicando a diferença entre associação e composição no seu modelo.</li>
 * </ul>
 */
public class CarrinhoDeCompras {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
