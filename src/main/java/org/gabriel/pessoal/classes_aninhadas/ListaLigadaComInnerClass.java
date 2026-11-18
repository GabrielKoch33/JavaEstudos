package org.gabriel.pessoal.classes_aninhadas;

/**
 * <h2>Classes aninhadas 02 — Inner class (não estática)</h2>
 *
 * <p>Implemente uma lista ligada simples de Strings: {@code ListaLigada}.</p>
 *
 * <ul>
 *   <li>O nó deve ser uma <b>inner class</b> privada: {@code private class No { String valor; No proximo; }}.</li>
 *   <li>Métodos: {@code adicionar(String)}, {@code remover(String)}, {@code tamanho()},
 *       {@code contem(String)} e {@code toString()} no formato {@code [a -> b -> c]}.</li>
 *   <li>O {@code No} deve usar o campo {@code tamanho} (ou outro membro) da lista externa
 *       diretamente — aproveite o acesso à instância externa.</li>
 * </ul>
 *
 * <p><b>Experimento:</b> transforme {@code No} em {@code static} e veja o que quebra se ele
 * ainda tentar usar membros da instância externa. Depois decida: faz sentido o nó ser static aqui?
 * Justifique em comentário.</p>
 *
 * <p><b>Bônus:</b> a classe também deve implementar {@code Iterable<String>},
 * com o iterator sendo uma <b>segunda inner class</b>, permitindo {@code for (String s : lista)}.</p>
 */
public class ListaLigadaComInnerClass {
    public static void main(String[] args) {
        // TODO
    }
}
