package org.gabriel.pessoal.excecoes;

import com.sun.security.auth.UnixNumericUserPrincipal;
import org.gabriel.pessoal.excecoes.exceptions.*;

import java.util.ArrayList;
import java.util.List;

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
    public static List<Usuario> usuarios = new ArrayList<>();
    public static  List<Usuario> userCadastrados = new ArrayList<>();

    public static class Usuario {
        private String nome;
        private String email;
        private String senha;

        public Usuario(String nome, String email, String senha) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getSenha() {
            return senha;
        }
    }

    /**
     * Polimorfismo em interfaces!!!
     * **/
    public static void cadastrar(Usuario usuario) throws CadastroException {
        String emailUsuario = usuario.getEmail();
        String senha = usuario.getSenha();
        if (emailUsuario == null || emailUsuario.isBlank() || !emailUsuario.contains("@")) {
            throw new EmailInvalidoException(emailUsuario);
        }
        if (buscarPorEmail(emailUsuario) != -1) {
            throw new UsuarioDuplicadoException(emailUsuario);
        }
        if (senha == null || senha.isBlank() || senha.length() < 8 || !
                senha.matches(".*\\d.*")) {
            throw new SenhaFracaException(senha);
        }
        System.out.println("cadastrado: "+usuario.getNome());
    }

    public static int buscarPorEmail(String email) {
        for (int i = 0; i < userCadastrados.size(); i++) {
            if (userCadastrados.get(i).getEmail().equals(email)) return i;
        }
        return -1;
    }

    public static boolean removerPorEmail(Usuario usuario) {
        int id = buscarPorEmail(usuario.getEmail());
        if ( id != -1) {
            userCadastrados.remove(id);
            System.out.println("removido");
            return true;
        }
        throw new UsuarioNaoEncontradoException(usuario.getNome());
    }


    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jullian","jullian@email","habva23rf");
        Usuario u2 = new Usuario("Anna","annaemail.com","fwu33344nfe244");
        Usuario u3 = new Usuario("Gabriel","gabriel@email","123");
        Usuario u4 = new Usuario("Eliz","eliz@emial.com","22523gg5");

        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);


        for (Usuario u : usuarios) {
            try {
                cadastrar(u);
            }
            catch (CadastroException e) {
                System.out.println(e.getMessage());
                // getMessage é o conteúdo passado no construtor da exceção
            }
        }
    }
}
