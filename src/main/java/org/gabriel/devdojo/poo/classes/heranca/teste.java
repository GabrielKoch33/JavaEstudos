package org.gabriel.devdojo.poo.classes.heranca;

public class teste {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        pessoa1.setNome("Júlio");
        pessoa1.setCpf("45586");
        endereco1.setRua("Dos bobos");
        endereco1.setCep("123");
        pessoa1.setEndereco(endereco1);

        Funcionario funcionario1 = new Funcionario(1452);
        funcionario1.setNome(pessoa1.getNome());
        funcionario1.setEndereco(endereco1);

    }
}
