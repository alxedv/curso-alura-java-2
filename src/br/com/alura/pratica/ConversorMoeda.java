package br.com.alura.pratica;

interface ConversaoFinanceira {
    double converterDolarParaReal(double valorEmDolar);
}
public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5.77;
    }
}

class Princial {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorTotal = conversor.converterDolarParaReal(10);
        System.out.println("O valor em reais é de R$" + valorTotal);
    }
}
