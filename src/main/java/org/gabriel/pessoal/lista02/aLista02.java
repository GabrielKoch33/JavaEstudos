package org.gabriel.pessoal.lista02;

public class aLista02 {
    public static void main (String[] args){

    }
}

//## 1. Conta Bancária com Encapsulamento
//Crie uma classe `Conta` com atributo `saldo` **privado**. Implemente `sacar(double valor)` e `depositar(double valor)` que validam a operação (não deixar sacar mais do que tem, não aceitar valores negativos).
//
//Agora faça o teste crucial: crie uma segunda classe (ou dentro do próprio `main`) e tente alterar `saldo` diretamente, sem passar pelos métodos. O que acontece?
//
//        **Pesquise:** por que deixar um atributo `public` quebra a ideia de "quem garante que o saldo nunca fica inválido?" — esse é o motivo de existir encapsulamento.
//
//---
//
//        ## 2. Sobrecarga de Construtores
//Crie uma classe `Produto` com atributos `nome`, `preco` e `quantidade`. Escreva pelo menos 3 construtores diferentes:
//        - Um que recebe só o nome (preço e quantidade assumem valores padrão)
//- Um que recebe nome e preço
//- Um que recebe os três
//
//Faça os construtores mais "incompletos" chamarem o mais completo, em vez de repetir a lógica de atribuição em cada um.
//
//        **Pesquise:** a sintaxe `this(...)` para um construtor chamar outro construtor da mesma classe. Por que isso evita duplicação de código?
//
//        ---
//
//        ## 3. `==` vs `equals()` — o Gotcha Clássico
//Crie uma classe simples `Ponto` com `x` e `y`. Crie dois objetos `Ponto` diferentes, mas com os mesmos valores de `x` e `y`. Compare-os com `==` e depois com `.equals()`.
//
//O resultado das duas comparações vai te surpreender se você nunca viu isso antes.
//
//        **Pesquise:** o que `==` realmente compara em objetos (não é o "conteúdo"). O que `equals()` faz por padrão quando a classe não sobrescreve esse método (isso o curso ainda não deu, mas vale entender a causa raiz agora — vai facilitar muito quando chegar lá).
//
//        ---
//
//        ## 4. Contador de Instâncias (static)
//Crie uma classe `Usuario` que, toda vez que um novo objeto for criado, incremente um contador. Esse contador precisa ser **compartilhado entre todos os objetos** (ou seja, se você criar 5 usuários, o contador marca 5 — não existem "5 contadores separados").
//
//Imprima, a qualquer momento, quantos usuários já foram criados no total.
//
//**Pesquise:** a diferença entre um atributo de instância e um atributo `static`. Por que um contador desse tipo não pode ser um atributo normal de instância?
//
//        ---
//
//        ## 5. Sobrecarga de Métodos e Resolução Ambígua
//Crie uma classe `Calculadora` com um método `somar` sobrecarregado (mesmo nome, parâmetros diferentes):
//        - `somar(int, int)`
//        - `somar(double, double)`
//        - `somar(int, int, int)`
//
//Agora chame `somar` passando um `int` e um `double` juntos (ex: `somar(2, 3.5)`) — nenhuma das assinaturas acima bate exatamente com isso.
//
//        **Pesquise:** o que o Java faz quando não existe uma assinatura exata — como funciona o "widening" (promoção automática de tipo) na escolha de qual método sobrecarregado será chamado.
//
//        ---
//
//        ## 6. Turma de Alunos (Array de Objetos)
//Crie uma classe `Aluno` com `nome` e um array de `notas` (double[]). Crie um array de pelo menos 5 objetos `Aluno`, cada um com notas diferentes.
//
//Sem usar nenhuma classe utilitária pronta, calcule:
//        - A média de cada aluno
//- Qual aluno tem a maior média da turma
//
//**Pesquise:** isso é o começo do conceito de "associação" entre objetos (uma "Turma" implicitamente formada por vários "Aluno") — repare como percorrer um array de objetos é diferente de percorrer um array de `int`.
//
//        ---
//
//        ## 7. Varargs — Média Flexível
//Escreva um método que calcule a média de **qualquer quantidade** de números, sem forçar quem chama a passar um array explicitamente — ou seja, deve ser possível chamar `media(5, 8, 3)` e também `media(1, 2, 3, 4, 5, 6)`, sem sobrecarregar o método pra cada quantidade de parâmetros.
//
//**Pesquise:** a sintaxe de varargs (`...`) e como ela é tratada internamente pelo Java (dica: por baixo dos panos ela vira algo que você já conhece bem).
//
//        ---
//
//        ## 8. `this` Explícito e Method Chaining
//Crie uma classe `Retangulo` cujo construtor recebe parâmetros com o **mesmo nome** dos atributos (`largura`, `altura`). Use `this` para deixar claro qual é o atributo e qual é o parâmetro.
//
//Depois, crie métodos como `definirLargura(double largura)` que, em vez de retornar `void`, retornam o próprio objeto (`return this;`) — permitindo encadear chamadas assim: `retangulo.definirLargura(10).definirAltura(5)`.
//
//        **Pesquise:** esse padrão de retornar `this` para encadear chamadas se chama "fluent interface" — onde você já viu algo parecido no dia a dia de bibliotecas Java (dica: `StringBuilder`).
//
//        ---
//
//        ## 9. Objetos são Passados por Referência (mesmo em Java "passando por valor")
//Escreva um método que tenta trocar (swap) os valores de duas variáveis `int` passadas como parâmetro. Teste e observe: os valores originais mudaram fora do método?
//
//Agora faça o mesmo teste, mas com dois objetos de uma classe simples (ex: `Caixa` com um atributo `int valor`) — só que dessa vez, em vez de tentar trocar as *referências*, você altera o **atributo interno** de cada objeto dentro do método.
//
//**Pesquise:** por que o primeiro caso não funciona e o segundo funciona — Java sempre passa por valor, mas o que exatamente é "o valor" quando o parâmetro é um objeto?
//
//        ---
//
//        ## 10. Prévia de Herança — Veículos
//Ainda não chegou na aula de herança, mas já que você quer avançar: crie uma classe `Veiculo` com atributos `marca` e `velocidadeAtual`, e um método `acelerar()` que aumenta a velocidade em uma quantidade fixa.
//
//Crie uma classe `CarroEsportivo` que **estende** `Veiculo` (`extends`) e sobrescreve `acelerar()` para aumentar a velocidade em um valor maior (esportivo acelera mais rápido).
//
//Crie um objeto de cada tipo, chame `acelerar()` nos dois e compare o resultado.
//
//        **Pesquise:** as palavras-chave `extends` e `@Override`. Por que `CarroEsportivo` "ganha" automaticamente os atributos e métodos de `Veiculo` sem precisar reescrevê-los?
//
//        ---
//
//Manda os 10 quando terminar — reviso, aponto os pontos de atenção e sigo alimentando o ciclo pro próximo lote.
