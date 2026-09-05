package org.gabriel.devdojo.poo.classes;

public class Pessoa {
    private String nome;
    private int idade;

    /**
     * Acoplamento = define o quanto uma classe tem acesso e permissões sobre outra, alto acoplamento indica
     * que uma classe modifica com muita facilidade estados e atributos de outra;
     * <br><br>
     * Coesão = grau de responsabilidade de uma classe, classes devem ter responsabilidades
     * condizentes com o domínio da mesma;<br><br>
     *
     * Baixo Acoplamento = bom<br><br>
     * Alto Acoplamento = ruim<br><br>
     * Baixa Coesão = ruim<br><br>
     * Alta Coesão = bom
     * */
    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(getNome());
        // Prefira sempre utilizar, dentro da propria classe, o 'this' ao invés de 'get()'

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
            return; // return vazio para funcionar com void e 'escapar' da função
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
