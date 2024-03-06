import javax.swing.text.Style;
public class Main {
    public static void Main(String[] args) {
        Filme filme = new Filme();
        Pessoa pessoa = new Pessoa();

        filme.nomeDoFilme = "Mario Bros";
        filme.anoFilme = 2023;
        filme.duracao = 90;
        filme.descreverFilme();
        filme.avalicarFilme(9);
        filme.avalicarFilme(4);
        filme.avalicarFilme(6);
        filme.avalicarFilme(8);
        filme.mediaDasNotas();

        pessoa.nome = "João";
        pessoa.email = "joao@gmail.com";
        pessoa.detalharPessoa();

        System.out.println(filme.mediaDasNotas());
    }
}













