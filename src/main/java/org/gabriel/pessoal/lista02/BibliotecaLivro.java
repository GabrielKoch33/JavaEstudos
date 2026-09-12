package org.gabriel.pessoal.lista02;

import org.gabriel.pessoal.lista02.classesExtras.Livro;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercício 02 — Associação Um-para-Muitos: Biblioteca e Livro.
 * <p>
 * Crie {@code Livro} (titulo, autor) e {@code Biblioteca}, que guarda um
 * array de {@code Livro}. Implemente um método na {@code Biblioteca} que
 * recebe um nome de autor e retorna (ou imprime) todos os livros daquele
 * autor.
 * <p>
 * <b>Pesquise:</b> aqui a {@code Biblioteca} "conhece" os {@code Livro}s,
 * mas o {@code Livro} não sabe a qual {@code Biblioteca} pertence — por
 * isso essa associação é chamada de "unidirecional".
 */
public class BibliotecaLivro {
    private final List<Livro> acervo;


    public BibliotecaLivro() {
        this.acervo = new ArrayList<>();
        // pq temos que declarar o tipo do conteudo apenas no momento do atributo?
    }

    public void adicionaLivroAcervo(Livro livro) {
        this.acervo.add(livro);
    }

    public void buscaLivroAutor(String nomeAutor) {
        int contLivros = 0;
        for (Livro livro : acervo) {
            // para objetos:
            // equals compara o conteúdo dentro de objetos
            // == compara o endereço em memória de ambos o objeto para ver se são os mesmos
            if (nomeAutor.equals(livro.getAutor())) {
                System.out.println(contLivros+" - "+livro.getTitulo());
                contLivros++;
            }
        }
        if (contLivros == 0) {
            System.out.println("Nenhum livro encontrado para esse ator, verifique ortografia e tente novamente");
        }
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("It a Coisa","Stephen King");
        Livro l2 = new Livro("1984","George Orwell");
        Livro l3 = new Livro("Hellraiser","Clive Barker");
        Livro l4 = new Livro("A Revolução dos Bichos","George Orwell");
        Livro l5 = new Livro("O Hobbit","Tolkien");

        BibliotecaLivro biblioteca = new BibliotecaLivro();

        biblioteca.adicionaLivroAcervo(l1);
        biblioteca.adicionaLivroAcervo(l2);
        biblioteca.adicionaLivroAcervo(l3);
        biblioteca.adicionaLivroAcervo(l4);
        biblioteca.adicionaLivroAcervo(l5);

        biblioteca.buscaLivroAutor("George Orwell");
    }
}