package org.gabriel.pessoal.revisao.projetos;

/**
 * <h2>Projeto: biblioteca com empréstimos</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> associação, enum, arrays de objetos, regras de negócio, {@code equals}, validações</p>
 *
 * <h3>Objetivo</h3>
 * <p>Modelar regras de negócio com várias entidades que se relacionam.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Modele {@code Livro}, {@code Exemplar} (cada livro tem vários exemplares físicos), {@code Usuario} e {@code Emprestimo}. O dia atual é representado por um número inteiro que o menu avança manualmente (simulando passagem do tempo).</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Prazo padrão de 7 dias; renovação permitida uma vez, desde que não haja reserva.</li>
 *   <li>Usuário não pode ter mais de 3 empréstimos ativos nem estar com atraso para pegar um livro novo.</li>
 *   <li>Multa de 50 centavos por dia de atraso, calculada na devolução.</li>
 *   <li>Enum {@code StatusExemplar} (DISPONIVEL, EMPRESTADO, RESERVADO) e enum {@code TipoUsuario} (ALUNO, PROFESSOR) com limites diferentes.</li>
 *   <li>Relatórios: livros mais emprestados, usuários com atraso e multas pendentes.</li>
 *   <li>Tratar duplicidade de ISBN e de matrícula via {@code equals}.</li>
 * </ul>
 */
public class BibliotecaComEmprestimos {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
