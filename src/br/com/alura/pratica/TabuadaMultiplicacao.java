package br.com.alura.pratica;

interface Tabuada {
    void mostrarTabuada(int numero);
}

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + i * numero);
        }
    }
}

class Principal2 {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(9);
    }
}
