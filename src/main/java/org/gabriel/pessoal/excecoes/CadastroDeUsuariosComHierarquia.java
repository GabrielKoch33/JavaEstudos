package org.gabriel.pessoal.excecoes;

/**
 * <h2>Exceções 08 — Hierarquia de exceções de domínio (mini projeto)</h2>
 *
 * <p>Crie um cadastro de usuários em memória (lista) com a seguinte hierarquia:</p>
 * <pre>
 * CadastroException (checked, base)
 *   ├── EmailInvalidoException       (e-mail sem '@' ou vazio)
 *   ├── UsuarioDuplicadoException    (e-mail já cadastrado)
 *   └── SenhaFracaException          (menos de 8 caracteres ou sem número)
 * UsuarioNaoEncontradoException (unchecked)
 * </pre>
 *
 * <p>Métodos obrigatórios:</p>
 * <ul>
 *   <li>{@code cadastrar(String email, String senha) throws CadastroException}</li>
 *   <li>{@code buscarPorEmail(String email)} — lança {@code UsuarioNaoEncontradoException}</li>
 *   <li>{@code remover(String email)} — reutiliza a busca</li>
 * </ul>
 *
 * <p>No {@code main}, rode um roteiro com casos válidos e inválidos e trate:</p>
 * <ul>
 *   <li>cada exceção específica com mensagem amigável;</li>
 *   <li>pelo menos um caso onde você captura a base {@code CadastroException} para tratar todas igual.</li>
 * </ul>
 *
 * <p><b>Reflita:</b> por que faz sentido {@code UsuarioNaoEncontradoException} ser unchecked
 * e as de cadastro serem checked? Você concorda? Justifique em comentário.</p>
 */
public class CadastroDeUsuariosComHierarquia {
    public static void main(String[] args) {
        // TODO
    }
}
