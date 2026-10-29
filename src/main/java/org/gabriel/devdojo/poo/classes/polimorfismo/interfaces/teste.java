package org.gabriel.devdojo.poo.classes.polimorfismo.interfaces;
import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.repositorioInterface.*;
import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.services.RepositorioArquivo;
import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.services.RepositorioBancoDados;
import org.gabriel.devdojo.poo.classes.polimorfismo.interfaces.services.RepositorioMemoria;

public class teste {
    public static void main(String[] args) {
        RepositorioBancoDados repositorio = new RepositorioBancoDados();
        repositorio.salvar();

        // ERRO: ambas as classes estão no mesmo nível
        // Se houvesse uma classe pai RepositorioGeral, daria certo
        // RepositorioMemoria repo = new RepositorioBancoDados();

        Repository repository = new RepositorioArquivo();
        Repository repository1 = new RepositorioBancoDados();
        Repository repository2 = new RepositorioMemoria();

        // Por herdarem a mesma interface, ambas estão suscetíveis aos mesmos métodos
    }
}
