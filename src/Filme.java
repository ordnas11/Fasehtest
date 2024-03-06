public class Filme {

    String nomeDoFilme;
    int anoFilme;
    int duracao;
    String genero;
    int avaliacao;
    private double notasAvaliacoes;
    private int totalAvaliacoes;

    void descreverFilme() {
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.println("Ano lançamento: " + anoFilme);
        System.out.println("Duração " + duracao);
    }

    void avalicarFilme(int nota){
        notasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    double mediaDasNotas(){
       return notasAvaliacoes / totalAvaliacoes;
    }
}
