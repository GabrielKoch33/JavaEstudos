package org.gabriel.devdojo.poo.classes.records;

/**
 * Classes records já possuem de forma implícita os getter, hashcode, equals e toString
 * implementados.
 * Seus atributos já são definidos dentro do () ao lado do nome da classe
 * Para validar os dados, usar o construtor compacto RecordName { }
 * Todos os atributos são private e final.
 * getter podem ser invocados via Record.nome().
 * Records não podem herdar de outras classes, pois implicitamente herdam de Record.
 * Records podem implementar interfaces.
 * Records podem ter métodos, blocos e classes internas estáticas
 * **/
public record UsuarioLoginDTORequest(Long id, String nome,
                                     String username, String senhaHash) {

    public UsuarioLoginDTORequest {
        if (nome == null || username == null) System.out.println("Exceção");
    }
}
