public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avaliar(double nota){
        avaliacao += nota;
    }

    void calcularMedia(){
        System.out.println(avaliacao / numAvaliacoes);
    }
}
