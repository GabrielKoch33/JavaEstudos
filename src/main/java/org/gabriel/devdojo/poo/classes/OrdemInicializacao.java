package org.gabriel.devdojo.poo.classes;

public class OrdemInicializacao {
    // ATRIBUTOS SÃO INICIADOS ANTES MESMO DOS CONSTRUTORES PELO JAVA
    private String nome;
    private String idade;
    private int[] listaInteiros;
    static {
        System.out.println("Bloco static Externo (Pai)");
    }
    {
        System.out.println("Bloco não-static Externo (Pai)");
    }

    public OrdemInicializacao() {
        System.out.println("Dentro do construtor Externo (Pai)");
    }

    public void exibirOrdem() {
        System.out.println("==================================================================");
        System.out.println("1 - Atributos Estáticos e Bloco Static da Classe Pai");
        System.out.println("2 - Atributos Estáticos e Bloco Static da Classe Filha");
        System.out.println("3 - Atributos Não-Estáticos e Bloco Não-Static da Classe Pai");
        System.out.println("4 - Construtor da Classe Pai");
        System.out.println("5 - Atributos Não-Estáticos e Bloco Não-Static da Classe Filha");
        System.out.println("6 - Construtor da Classe Filha");
        System.out.println("==================================================================");
    }

    public static class Interna extends OrdemInicializacao {
        private int dado;
        static {
            System.out.println("Bloco static Interno (Filha/Única)");
        }
        {
            System.out.println("Bloco não-static Interno (Filha/Única)");
        }

        public Interna() {
            super();
            System.out.println("Construtor Interno (Filha/Única)");
            System.out.println("Dicas: ");
            exibirDica();
        }

        private void exibirDica() {
            System.out.println("Bloco de Inicialização STATIC");
            System.out.println("Ele roda sempre que uma classe é carregada");
            System.out.println("Pode ser 'static' ou não, tal palavra pode implicar quantas vezes cada ação ocorre");;
            System.out.println("Por exemplo, por esse bloco ser 'static' ele irá acontecer apenas uma vez, independente que quantas instâncias existam");
            System.out.println("Ele ocorre quando eu crio o PRIMEIRO objeto dessa classe, a classe será carregada pela primeira vez juntamente com seus elementos");
            System.out.println("===================================");
            System.out.println("Bloco de Inicialização NÃO-STATIC");
            for (int i = 0; i <= 10; i++) {
                System.out.println("Loop: "+i);
            }
            System.out.println("Por exemplo esse loop, se eu criar 100 objetos, esse loop ocorrerá 100 vezes");
            System.out.println("Supondo que ele é super importante para a aplicação e que temos pouca memória, no fim teríamos 10000 iterações");
            System.out.println("Dessa forma, se algo é PADRÃO A TODOS OS OBJETOS, o mais lógico é colocarmos esse bloco com 'static'");
        }
    }

    public static void main(String[] args) {
        Interna interna = new Interna();
        interna.exibirOrdem();
    }
}
