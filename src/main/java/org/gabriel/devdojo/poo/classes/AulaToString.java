package org.gabriel.devdojo.poo.classes;

public class AulaToString {
    private String nomeEmpresa;
    private final String cnpj;
    // Atributos final não podem ter setters()
    private double caixa;

    public AulaToString(String nome, String cnpj, double valorEmCaixa) {
        this.nomeEmpresa = nome;
        this.cnpj = cnpj;
        this.caixa = valorEmCaixa;
    }
    /**
     * O override em java e na POO permite a uma classe filha (subclasse) reescrever um método herdado de sua classe mãe (superclasse)
     * para modificar o seu comportamento. Isso exige que a classe mãe contenha o método declarado e a classe filha tente implementá-lo
     * usando a mesma assinatura (nome do método), mesma quantidade de parâmetros e tenha o mesmo tipo de retorno.
     * <br><br>
     * Nunca devemos diminuir o grau de acesso de um método sobrescrito. Caso na classe mãe seja public, nas classes filhas o método
     * não pode ser protected nem private.
     * <br><br>
     * Podemos omitir o @Override pois o Java já sabe que o método toString pertence a classe pai Object.
     * Porém, caso ocorra um erro de declaração tipo: toString → String() ou toStrings(), o Java vai entender que
     * esses são métodos totalmente diferentes e únicos criado pelo usuário. Nesse o @Override serve como uma camada
     * de validação para a existência de um método toString() herdado da classe Object.
     * */
    @Override
    public String toString() {
        return "Empresa: "+this.nomeEmpresa+"\nCNPJ: "+this.cnpj;
    }

    /**
     * Sobrescrita: Ocorre apenas em herança quando a filha implementa um método já existênte na classe pai, porém com uma lógica diferente. Usamos
     * a key-word @Override para indicar a sobrescrita. <br><br>
     * Sobrecarga: Pode ocorrer tanto em herança como numa única classe. É utilizada quando um método deve realizar uma ação padrão porém
     * independente do tipo de argumento passado. Em java, métodos sobrecarregados são identificados em tempo de execução, onde a JVM identifica o tipo
     * de argumento passado e usa o método com parâmetros compatíveis. Para aplicar a sobrecarga deve-se ter:<br> <b>-Quantidade de parâmetros diferentes entre os métodos.</b>,
     * <br><b>-O tipo dos parâmetros devem ser parcial ou totalmente diferentes.</b><br><b>-A ordem dos parâmetros devem ser diferentes</b>.
     * **/
    public static void main(String[] args) {
        AulaToString aula = new AulaToString("Renave", "1234567/000-21", 213344);
        System.out.println(aula.toString());
    }
}
