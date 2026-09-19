package org.gabriel.devdojo.poo.classes.heranca;

/**
 * Quando pensamos em Herança dentro da POO devemos nos atentar em um detalhe para não nos confundirmos
 * com Composição. Em Herança, pensamos nas classes e suas relações como <b>'É Um'</b>, enquanto em Associação pensamos
 * em <b>'Contém Um / Usa Um'</b>.<br><br>
 * ex: <br><br>
 * HERANÇA: Um gato <b>É UM animal</b>, tem toda as <b>características gerais de um Animal</b> como: comer, dormir, andar, etc. Mas também
 * tem suas <b>Especificações</b>, como: miar, perseguir laser, é felino.<br><br>
 * COMPOSIÇÃO: Supondo que estamos modelando uma <b>Casa</b>, a casa <b>pode ser vazia</b>, mas a classe <b>também pode conter várias coisas,
 * tais como Móveis, Pessoas, Localização, Documentos, etc</b>. Nenhum dessas classes <b>'É um'(a) Casa</b> ou definem a estrutura que
 * uma casa deve seguir, porém,<b> fazem parte dela e estão presentes, obrigatóriamente ou não, há uma Casa</b>.
 * */
public class Funcionario extends Pessoa{
    private double salario;

    public void imprimir(){
        super.imprimir(); // buscamos o método da classe superior para evitar redundância de código
        System.out.println("Salário: "+this.getSalario());
        this.nome = "Hugo"; // Acessamos o atributo protected em uma subclasse de Pessoa
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome,cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
