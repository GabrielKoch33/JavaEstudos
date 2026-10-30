package org.gabriel.pessoal.revisao.projetos;

/**
 * <h2>Projeto: locadora de veículos</h2>
 * <p><b>Nível:</b> Médio-alto<br>
 * <b>Conceitos revisados:</b> herança, classe abstrata, interface, enum, arrays de objetos, {@code Scanner}, encapsulamento</p>
 *
 * <h3>Objetivo</h3>
 * <p>Integrar tudo o que foi estudado em um sistema de console com menu.</p>
 *
 * <h3>Enunciado</h3>
 * <p>Desenvolva uma locadora com carros, motos e caminhões. Cada tipo tem diária e regras de preço diferentes. Clientes alugam veículos por um número de dias e devolvem depois.</p>
 * <p>O sistema funciona por menu de console: cadastrar veículo, cadastrar cliente, alugar, devolver, listar disponíveis, listar aluguéis ativos e relatório de faturamento.</p>
 *
 * <h3>Requisitos</h3>
 * <ul>
 *   <li>Hierarquia: {@code Veiculo} abstrata e as filhas {@code Carro}, {@code Moto}, {@code Caminhao}, cada uma com seu cálculo de aluguel (ex.: caminhão cobra taxa por tonelada, moto tem desconto em aluguéis longos).</li>
 *   <li>Enum {@code Categoria} (ECONOMICO, LUXO, CARGA) e enum {@code StatusVeiculo}.</li>
 *   <li>Interface {@code Tarifavel} com o cálculo do valor total, implementada pelos veículos.</li>
 *   <li>Classe {@code Aluguel} associando cliente, veículo, dias e status; devolução com atraso cobra multa de 20% por dia extra.</li>
 *   <li>Persistência apenas em memória, com arrays próprios que crescem; sem coleções.</li>
 *   <li>Entradas inválidas no menu nunca devem derrubar o programa.</li>
 *   <li>No {@code main}, pelo menos 3 cenários de teste cobrindo: aluguel de veículo já alugado, devolução sem aluguel e cliente inexistente.</li>
 * </ul>
 *
 * <h3>Desafio extra</h3>
 * <ul>
 *   <li>Salvar e carregar os dados de um arquivo texto (pesquise {@code java.nio.file.Files}).</li>
 * </ul>
 *
 * <h3>Dica</h3>
 * <p>Comece pelo modelo (classes e enums) e só depois monte o menu; cada opção do menu chama um método de uma classe de serviço.</p>
 */
public class LocadoraDeVeiculos {

    public static void main(String[] args) {
        // TODO: implemente aqui
    }
}
