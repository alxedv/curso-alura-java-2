package br.com.alura.pratica;

interface CalculoGeometrico{
    void calcularArea(int altura, int largura);
    void calcularPerimetro(int altura, int largura);
}

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(int altura, int largura) {
        int area = altura * largura;
        System.out.println("A area é " + area + "m²");
    }

    @Override
    public void calcularPerimetro(int altura, int largura) {
        int perimetro = 2 * (altura + largura);
        System.out.println("O perimetro é " + perimetro + "m");
    }
}

class Principal {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calc = new CalculadoraSalaRetangular();
        calc.calcularArea(3, 4);
        calc.calcularPerimetro(3, 4);
    }
}
