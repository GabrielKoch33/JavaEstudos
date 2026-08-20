package org.gabriel.cursos;

public class Annotations {
    public static void main(String[] args){
        System.out.println("Anotações");
    }
}
/* Como o Java funciona?

-> Java Application Programing Interface (API):
    Conjunto de bibliotecas Java embutidas que remove a necessidade de termos que escrever tudo do zero.
    (ex: métodos http, conexões com banco, matemáticas, etc).

-> Java Virtual Machine (JVM):
    Software que converte nosso código Java em binários, permitindo que qualquer código roda em qualquer sistema.
    '.java' vira '.class' devido ao compilador -> JVM -> máquina.

Edições Java:

-> Java EE:
    Plataforma projetada para sistemas de larga escala e demanda,
    sistemas web, APIs, segurança e escalabilidade.
    Possui além do SE, bibliotecas de banco de dados, servidores etc

-> Java SE:
    Plataforma central e obrigatória do Java, é nela que outros
    modelos como EE e FX rodam por cima, ela que contem a lógica, POO, bibliotecas e etc.
    Muito utilizada para desktop simples e atividades básicas.

-> Java FX:
    Framework moderno focado em interfaces gráficas (GUI) para o usuário.
    Utilizado em aplicações visuais para desktop ou embarcados

==============================================================================
                                    DICAS
==============================================================================

-> O nome da classe deve ser o mesmo que o nome do arquivo
    class NomeDoArquivo {...} = declaração de uma classe;

-> Declaração da main:
    É obrigatória, qualquer projeto terá uma main() que será o ponto de partida do código.

    public = visibilidade e acesso da classe, permitindo ser visivel a qualquer outra, é necessário ser public para a JVM ler
    static = permite executar a classe sem a necessidade de instanciar um objeto antes, ou seja, será única e tudo ocorre por meio dela;
    void   = define valor de retorno da função, nesse caso void = sem retorno;
    main   = nome da função, é pela main() que o java encontra o ponto de partida do programa;
*/
