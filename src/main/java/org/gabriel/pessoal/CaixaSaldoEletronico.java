package org.gabriel.pessoal;

public class CaixaSaldoEletronico {
    /**
     Dado um valor a sacar(ex: R$ 385) e um array com as notas disponíveis ({100, 50, 20, 10, 5, 2}).
     Calcule a quantidade de cada nota usando o algoritmo guloso (sempre usa a maior nota possível primeiro).
     Depois, teste com um valor que não é múltiplo de 2 (ex: R$ 387) e trate esse caso — o que deveria acontecer?
     Pesquise: a diferença entre / e % para números inteiros em Java, e por que a ordem do array de notas (decrescente) importa tanto aqui.
     */
    public void caixaEletronico(int saque){
        int[] arrNotas = {100,50,20,10,5,2};
        int valorAtual = saque;
        int i = 0;
        int qtdNota;
        while (valorAtual != 0 ){
            if (valorAtual == 1){
                System.out.println("Foram usada(s) " + 1 + " nota(s) de R$" + 1);
                valorAtual -= 1;
                break;
                // break pq depois mesmo que chegue a 0 o bloco abaixo do while
                // é executado gerando -> 0 = 0/2
            }
            while (i < arrNotas.length-1 && valorAtual/arrNotas[i] <= 0){
                ++i;
            }

            qtdNota = valorAtual/arrNotas[i];
            System.out.println("Foram usada(s) " + qtdNota + " nota(s) de R$" + arrNotas[i]);
            valorAtual -= arrNotas[i]*qtdNota;
        }

        System.out.println("Saque bem sucedido");
    }
}
