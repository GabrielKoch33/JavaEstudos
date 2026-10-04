package org.gabriel.devdojo.poo.classes.finalStaticModifiers;

public class CarroFinal {
    private String nomeDonoCarro;
    private String lojaAtual;
    private final String MODELO_CARRO;
    private final String CHASSI;
    private final int ANO_FABRICACAO;
    // Constantes devem seguir a convenção de Letras Maiúsculas e separadas por Under_Line
    public static final double CONSTANTE_UNIVERSAL        = 3.14;
    protected static final int CONSTANTE_HERANCA_E_PACOTE = 69;
    static final String CONSTANTE_APENAS_DO_PACKAGE       = "ABC";
    private static final boolean CONSTANTE_RESTRITA_A_CLASSE_ATUAL = true;
    // ------------------------------------------------------------------------------------ //
    private final double VELOCIDADE_LIMITE;
    private static final int ANO_MAXIMO_MODELO;
    static {
        ANO_MAXIMO_MODELO = 240;
    }
    // O java não se importa se o atributo 'static' ou 'final' vai ser inicializado diretamente na Linha de Declaração, ou
    // então dentro de um Construtor ou num Bloco de Inicialização. (atributos 'static' não podem ser inicializados em Construtores!!!)
    {
        VELOCIDADE_LIMITE = 400;
    }

    /**
     * Em Java, o conceito de uma constante pode ser meio confuso.
     * Quando pensamos em constante imaginamos alto <b>imutável<b> e <b>igual para todos<b> os arquivos ou métodos que a usem.
     * Se só usarmos 'static', a ideia de algo igual a todos é cumprida, porém ainda pode ser mutável.
     * Se usarmos apenas o 'final', temos algo imutável, porém, não é compartilhada entre todas as instâncias da classe.
     * Para termos uma constante de fato, devemos fazer a seguinte combinação: <br><br>
     * *public static final tipoVariável NOME_CONSTANTE = valorDefault;
     * <br><br>
     * - Nota-se que o modificador de acesso public (assim como o protected, default ou private), desempenha um papel no escopo que essa
     * variável pode ser acessada.<br><br>
     * Algo púbico é fixo a toda e qualquer classe (ex: uma variável que define formatação de texto (?);<br><br>
     * Algo private indica algo constante e restrito a uma única classe (ex: Num arquivo de calculo de juros, uma constante armazenaria o valor da SELIC atual,
     * e nenhum outro módulo precisa saber da taxa selic atual, apenas do resultado do cálculo);
     **/
    public CarroFinal(int ano, String CHASSI, String modelo) {
        this.ANO_FABRICACAO = ano;
        this.CHASSI         = CHASSI;
        this.MODELO_CARRO   = modelo;
    }

    public String imprime() {
        return "Atributos 'final' não podem possuir possuir métodos 'setter()', pois como são final (imutáveis), a ideia de um " +
               "setter (que altera/atribui novo valor) é oposta a ideia de uma constante";
    }

    public String imprime2() {
        return "O Java reclama quando declaramos algo 'final' sem já passar um valor, por isso, o valor deve ser declarado "+
                "em um Construtor ou atribuído na mesma linha da declaração";
    }

    public final void imprime3() {
        System.out.println("Public: "   +CONSTANTE_UNIVERSAL);
        System.out.println("Protected: "+CONSTANTE_HERANCA_E_PACOTE);
        System.out.println("Private: "  +CONSTANTE_RESTRITA_A_CLASSE_ATUAL);
        System.out.println("Default: "  +CONSTANTE_APENAS_DO_PACKAGE);
    }

    public String getNomeDonoCarro() {
        return nomeDonoCarro;
    }

    public void setNomeDonoCarro(String nomeDonoCarro) {
        this.nomeDonoCarro = nomeDonoCarro;
    }

    public String getLojaAtual() {
        return lojaAtual;
    }

    public void setLojaAtual(String lojaAtual) {
        this.lojaAtual = lojaAtual;
    }

    public String getModeloCarro() {
        return MODELO_CARRO;
    }

    public String getChassi() {
        return CHASSI;
    }

    public int getAnoFabricacao() {
        return ANO_FABRICACAO;
    }

    public double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }

    public static void main(String[] args) {
        System.out.println(CarroFinal.CONSTANTE_APENAS_DO_PACKAGE);
        CarroFinal c = new CarroFinal(2023, "12FDJF23", "CELTA");
        // c.CONSTANTE_UNIVERSAL;
        // Um atributo 'static' pode ser acesso via objeto.atributo, porém é uma má prática, afinal o atributo static pertence
        // a Classe e não a uma instância da classe
    }
}
