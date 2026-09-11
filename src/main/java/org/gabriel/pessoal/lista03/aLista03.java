package org.gabriel.pessoal.lista03;

public class aLista03 {
    public static void main (String[] args){

    }
}
//# Exercícios Java — Lote 03 (POO calibrado pelo seu nível real)
//        **Base:** vídeo oficial 64 (Associação — Arrays com Objetos), mas calibrado pelo que você já demonstra dominar na prática nos seus projetos (herança, enum, Map, encapsulamento, construtores sobrecarregados). Sem freio de mão puxado — se precisar pesquisar algo de Collections ou Herança que o curso ainda não formalizou, é exatamente o ponto.
//
//---
//
//        ## 1. Associação Bidirecional — Turma e Aluno
//Crie `Turma` (com uma lista de `Aluno`) e `Aluno` (com uma referência de volta pra sua `Turma`). Implemente um método `matricular(Aluno aluno)` na `Turma` que precisa deixar **os dois lados** cientes da relação.
//
//Agora tente adicionar um aluno só pelo lado do `Aluno` (`aluno.setTurma(turma)`) sem passar pelo método da `Turma`. O que acontece quando você pergunta pra `Turma` quantos alunos ela tem?
//
//        **Pesquise:** por que associação bidirecional não é "automática" em Java — não existe mágica sincronizando os dois lados, você é responsável por manter a consistência manualmente.
//
//        ---
//
//        ## 2. Herança com Construtores e `super()`
//Crie `Funcionario` (nome, salarioBase) e `Gerente extends Funcionario` (bônus adicional). O construtor de `Gerente` precisa obrigatoriamente chamar `super(...)`.
//
//Agora tente remover a chamada a `super(...)` do construtor de `Gerente` (deixando o construtor vazio) — o que o compilador faz? E se `Funcionario` não tiver um construtor sem argumentos?
//
//        **Pesquise:** a ordem de inicialização entre superclasse e subclasse — o que roda primeiro quando você faz `new Gerente(...)`.
//
//        ---
//
//        ## 3. Sobrescrevendo `toString()`
//Crie uma classe `Produto` (nome, preco) sem sobrescrever nada, dê `System.out.println(produto)` e observe a saída padrão. Depois sobrescreva `toString()` pra retornar algo legível tipo `"Produto{nome='X', preco=9.90}"`.
//
//        **Pesquise:** o que exatamente é aquela string estranha tipo `Produto@1b6d3586` que aparece antes de você sobrescrever — de onde ela vem (dica: toda classe em Java herda de algum lugar, mesmo sem você escrever `extends`).
//
//        ---
//
//        ## 4. `equals()` e `hashCode()` — Por Que os Dois Juntos?
//Crie uma classe `Ponto3D` (x, y, z) e sobrescreva `equals()` (dois pontos são iguais se x, y e z forem iguais). Guarde vários `Ponto3D` num `HashSet` — inclusive dois pontos com os mesmos valores de x/y/z.
//
//        Rode assim (só com `equals()` sobrescrito, sem `hashCode()`) e veja quantos elementos o `HashSet` diz que tem. Depois sobrescreva `hashCode()` também (de forma consistente com `equals()`) e rode de novo.
//
//        **Pesquise:** por que `HashSet`/`HashMap` usam `hashCode()` pra decidir "onde procurar" um objeto antes mesmo de chamar `equals()` — e por que sobrescrever só um dos dois é uma armadilha clássica.
//
//        ---
//
//        ## 5. Enum com Construtor e Atributos
//Crie um enum `Planeta` onde cada valor (`MERCURIO`, `VENUS`, `TERRA`...) carrega sua própria gravidade (um `double`). Escreva um método `pesoNoPlaneta(double massaKg)` que calcula o peso de algo usando a gravidade daquele planeta específico.
//
//        **Pesquise:** enum em Java não é só uma lista de nomes — ele pode ter construtor, atributos e métodos, quase como uma classe. Por que isso é diferente de simplesmente usar um `switch` com Strings (que você já fez antes)?
//
//        ---
//
//        ## 6. Modificador `final` — Onde Ele Trava Você
//Crie uma classe `Configuracao` com atributos `final` que só podem ser definidos no construtor (ex: `apiKey`, `ambiente`). Tente escrever um método que altere um desses atributos depois de criado — veja o erro do compilador.
//
//Agora crie uma classe `final` inteira (não só o atributo) e tente criar uma segunda classe que a estenda (`extends`).
//
//        **Pesquise:** as três aplicações diferentes de `final` em Java (variável, método, classe) — o que cada uma impede especificamente.
//
//        ---
//
//        ## 7. Ranking com `Comparable`
//Crie uma classe `Jogador` (nome, pontuacao) que implementa `Comparable<Jogador>`, definindo que a ordenação natural é por pontuação (do maior pro menor). Coloque vários `Jogador` numa `List<Jogador>` e use `Collections.sort()` pra ordenar.
//
//Depois, ordene a mesma lista de um jeito diferente (por nome, alfabeticamente) sem alterar a classe `Jogador`.
//
//        **Pesquise:** a diferença entre `Comparable` (ordenação "natural", definida dentro da própria classe) e `Comparator` (uma ordenação alternativa, definida por fora) — por que você precisa do segundo pra esse caso.
//
//        ---
//
//        ## 8. A Armadilha do `%` em Regras de Capacidade
//Crie uma classe `Deposito` com uma capacidade máxima e itens armazenados (soma de pesos). Escreva um método `espacoRestante()` que calcula quanto ainda cabe.
//
//        Implemente **de propósito errado primeiro**, usando `%` em vez do operador certo, e teste com um depósito vazio (peso atual = 0). O que acontece?
//
//        **Pesquise:** por que só usar `%` no lugar errado pode não só dar um resultado sem sentido, mas quebrar o programa inteiro dependendo dos valores envolvidos.
//
//---
//
//        ## 9. Encapsulamento com Invariante — Termômetro
//Crie uma classe `Termometro` com atributo `temperatura` privado. O `setTemperatura(double valor)` deve **rejeitar** valores fisicamente impossíveis (abaixo de -273.15°C, o zero absoluto) — decida você como rejeitar (lançar exceção, ignorar o valor, retornar um boolean indicando sucesso).
//
//        **Pesquise:** essa é a real razão de existir encapsulamento — não é "esconder por esconder", é garantir que um objeto nunca fique num estado que não faz sentido no mundo real.
//
//        ---
//
//        ## 10. Composição — Pedido com Vários Itens
//Crie `ItemPedido` (produto, quantidade, precoUnitario) e `Pedido`, que guarda uma lista de `ItemPedido`. Implemente `calcularTotal()` (soma quantidade × preço de cada item) e um método pra remover um item e recalcular o total automaticamente.
//
//        **Pesquise:** esse padrão — um objeto "maior" sendo formado por vários objetos "menores" que ele gerencia — é essencialmente o que você já fez no seu projeto de RPG (`Loja` com `Item`, personagem com `Inventario`). Repare como o raciocínio se repete.
//
//        -