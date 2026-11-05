package org.gabriel.devdojo.poo.classes.classesinternas;

/**
 * Classes locais são aquelas criadas dentro de métodos ou blocos de inicialização.
 * <br><br>
 * Elas só exitem dentro do bloco e morrem após o fim da função.
 * <br><br>
 * Devem ser inicializadas com new () logo após sua declaração.
 * <br><br>
 * Podem usar atributos da classe externa assim como variáveis internas do método e parâmetros passados
 * <br><br>
 * Não devem, e não podem, alterar variáveis locais, nem os atributos da classe local e
 * nem os parâmetros durante sua curta vida, deve se ter consciência de não alterar as varáveis.
 * <br><br>
 * **/
public class LocalClasses {
    private String nome = "Luffy";

    public void print(String param) {
        int age = 15;
        System.out.println("Nome externo: "+this.nome);
        String lastName = "da Silva";
        nome = "Elizângela";

        class local {
            int idade = 10;

            public void printLocal() {
                System.out.println("Nome local: " + nome);
                System.out.println("LastName local: " + lastName);
                System.out.println("Idade local: " + idade + " age: "+ age );
                System.out.println(param);
            }
        }

        local locClass = new local();
        locClass.printLocal();
    }
    public static void main(String[] args) {
        LocalClasses local = new LocalClasses();
        local.print("Testando");
    }
}
