package org.gabriel.devdojo.poo.classes.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest2 {
    public static final List<Manga> mangas = new ArrayList<>();
    private static Long ID = 1L;

    public static class Manga {
        private Long id;
        private String nome;


        public Manga() {

        }

        public Manga(String nome) {
            this.id = ID;
            this.nome = nome;
            ID++;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Manga exists(String nome) {
            int i = mangas.indexOf(nome);
            if (i != -1) {
                return mangas.get(i);
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        mangas.add(new Manga("One Piece"));
        mangas.add(new Manga("Berserk"));
        mangas.add(new Manga("Vagabond"));
        mangas.add(new Manga("Naruto"));
        mangas.add(new Manga("Fullmetal Alchemist"));

        Manga m = new Manga();
        Optional<Manga> manga = Optional.ofNullable(m.exists("Frieren"));
        System.out.println(manga.orElse(new Manga("Frieren")).getNome());

        /**
         * orElse: Caso exista algum valor, retorna-0; caso contrário (null/empty), devolve um valor pré-definido.
         * <br><br>
         * Bom para evitar validar a ifPresent ou isEmpty de um Optional
         * **/
        Optional<String> val = null;
        String valor = val.orElse("Sem nome");

        // Nullable para casos de incerteza;
        // of para casos de certeza de valor não-nulo
        // empty para casos de certeza de valor nulo



    }
}
