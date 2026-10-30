package org.gabriel.pessoal.revisao.interfaces;

/**
 * <h2>Interfaces: default, static, private e conflito de herança</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> {@code default}, métodos estáticos e privados em interface, resolução de conflitos</p>
 *
 * <h3>Objetivo</h3>
 * <p>Explorar os recursos modernos de interfaces e o problema do diamante.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Crie as interfaces {@code Auditavel} e {@code Registravel}, ambas com um método {@code default String identificar()}. Crie a classe {@code Documento} que implementa as duas, o que força você a resolver o conflito explicitamente.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Resolver o conflito com {@code Auditavel.super.identificar()} e combinar as duas respostas.</li>
 *   <li>Colocar um método {@code static} utilitário em uma interface e chamá-lo pelo nome da interface.</li>
 *   <li>Usar um método {@code private} de interface para evitar duplicação entre dois métodos {@code default}.</li>
 *   <li>Declarar uma constante em interface e explicar em comentário os modificadores implícitos ({@code public static final}).</li>
 *   <li>Mostrar que a classe pode sobrescrever o método {@code default}, e que uma classe vence a interface em caso de conflito (classe pai versus interface).</li>
 * </ul>
 */
public class InterfacesDefaultEStaticas {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
