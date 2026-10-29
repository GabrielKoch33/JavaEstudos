package org.gabriel.pessoal.revisao.fundamentos;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

/**
 * <h2>Analisador de texto</h2>
 * <p><b>Nível:</b> Médio<br>
 * <b>Conceitos revisados:</b> {@code String}, {@code split}, {@code StringBuilder}, {@code equals} vs {@code ==}, arrays paralelos, text block</p>
 *
 * <h3>Objetivo</h3>
 * <p>Praticar a API de {@code String} em um problema com várias etapas, sem usar coleções.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Declare um texto de pelo menos 5 linhas usando <i>text block</i> (<code>"""</code>). Analise o texto e imprima:</p>
 * <p>(1) total de palavras; (2) a palavra mais longa; (3) a palavra mais frequente e quantas vezes aparece; (4) todas as palavras palíndromas com 3 ou mais letras (sem repetir); (5) quantidade de vogais e consoantes.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Ignorar pontuação e diferenças entre maiúsculas e minúsculas.</li>
 *   <li>Desconsiderar acentos na contagem de vogais (pesquise {@code java.text.Normalizer}).</li>
 *   <li>Para a contagem de frequência, use dois arrays paralelos ({@code String[] palavras} e {@code int[] contagens}); coleções ainda não são permitidas.</li>
 *   <li>Comparar strings sempre com {@code equals}; no final, escreva um comentário explicando por que {@code ==} falharia em alguns casos.</li>
 *   <li>Cada análise deve ser um método {@code static} próprio.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Imprimir um histograma horizontal das 5 palavras mais frequentes, com <code>#</code> proporcional à contagem.</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>{@code text.split("[^\\p{L}]+")} separa por qualquer coisa que não seja letra, inclusive acentuada.</p>
 */
public class AnalisadorDeTexto {
    /**
     * isBlank = verifica se está vazia '("")' ou se contêm apenas espaços '("   ")';
     * isEmpty = verifica se está vazia '("")', porém espaços em branco são considerados '("   ")'
     * == null = deve vir antes, pois as duas funções acima disparam uma exceção em caso de valor null
     * **/
    private static String removeAcentos(String texto) {
        if (texto == null || texto.isBlank()) {
            return null;
        }
        String formatada = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return formatada.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    private static String removePontuacao(String texto) {
        return texto.replaceAll("[^\\w\\s]", "");
    }

    public static String formataTexto(String texto) {
        String str = removeAcentos(texto);
        if (str == null) {
            return null;
        }
        StringBuilder strBuilder = new StringBuilder(str);

        String sbString = strBuilder.toString().toLowerCase();
        strBuilder.setLength(0);
        strBuilder.append(removePontuacao(sbString));

        return strBuilder.toString();
    }

    private static String[] toStringArray(String texto) {
        return texto.split("\\s+"); // um ou mais espaços em branco seguidos
    }

    private static void exibeOcorrencias(Map<String, Integer> ocorrencias) {
        for (String palavra : ocorrencias.keySet()) {
            System.out.println(palavra +": "+ ocorrencias.get(palavra));
        }
    }

    public static void main(String[] args) {
        // TODO: implemente aqui
        String texto = """
                O Lorem Ipsum é um texto modelo da indústria tipográfica e de impressão. 
                O Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde o ano de 1500, 
                quando uma misturou os caracteres de um texto para criar um espécime de livro. 
                Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia electrónica, mantendo-se essencialmente inalterada.
                Foi popularizada nos anos 60 com a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum,
                e mais recentemente com os programas de publicação como o Aldus PageMaker que incluem versões do Lorem Ipsum.
                """;
        String str = formataTexto(texto);
        if (str != null) {
            Map<String,Integer> ocorrencias = new HashMap<>();
            String[] arrPalavras = toStringArray(str);
            for (String p : arrPalavras) {
                ocorrencias.putIfAbsent(p, 0);
                int num = ocorrencias.get(p) + 1;
                ocorrencias.put(p,num);
            }
            int contVogais = 0;
            for (int i = 0; i < str.length(); i++ ) {
                char c = str.charAt(i);
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u':
                        contVogais++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println("===================");
            System.out.println("Vogais: "+contVogais);
            System.out.println("===================");
            exibeOcorrencias(ocorrencias);
        }
        else {
            System.out.println("Texto Inválido");
        }
    }
}
