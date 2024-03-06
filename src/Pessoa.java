public class Pessoa {
    String nome;
    String email;
    private String senha;

    void detalharPessoa() {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Criar senha: " + senha);

    }
}
