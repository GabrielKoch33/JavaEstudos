package org.gabriel.cursos;

public class TypeErrors {    public static void main(String[] args) {
    System.out.println("1 - Erros de Sintaxe");
    ErrosSintaxe();
    System.out.println("2 - Erros de Semântica");
    ErrosSemantica();
    System.out.println("3 - Erros em Tempo de Execução");
    ErrosTempoExec();
    System.out.println(" -- FIM DO PROGRAMA -- ");
    }

    public static void ErrosSintaxe() {
        System.out.println("--> Erros em que a gramática foge do padrão esperado pelo Java");
    }

    public static void ErrosSemantica() {
        System.out.println("--> Erros em que a escrita está correta porém a operação é impossível (ex: Divisão por 0), resultando no fechamento do programa");
    }

    public static void ErrosTempoExec() {
        System.out.println("--> O programa roda sem travar, porém o resultado está incorreto devido a um erro de lógica ou valores informados serem inesperados (confundir Main com main).\nPodemos tratar erros em tempo de execução com Try/Except");
    }
}
