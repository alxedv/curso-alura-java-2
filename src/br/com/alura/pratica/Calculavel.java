package br.com.alura.pratica;

public interface Calculavel {
    double calcularPrecoFinal();
}

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return preco * 1.05;
    }
}
