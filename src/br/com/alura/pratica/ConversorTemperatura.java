package br.com.alura.pratica;

public interface ConversorTemperatura {
    void celsiusParaFahrenheit(double celsius);
    void fahrenheitParaCelsius(double fahrenheit);
}

class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double result = (celsius * 1.8) + 32;
        System.out.printf("A temp %f°C equivale a %f°F", celsius, result);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * 0.5;
        System.out.printf("A temp %f°F equivale a %f°C", fahrenheit, result);
    }
}

class Principal3 {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(32);
        conversor.fahrenheitParaCelsius(32);
    }
}

