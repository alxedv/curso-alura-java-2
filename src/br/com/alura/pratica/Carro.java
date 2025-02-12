package br.com.alura.pratica;

public class Carro {
    private String modelo;
    private double preco2020;
    private double preco2021;
    private double preco2022;


    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos (double preco2020, double preco2021, double preco2022){
        this.preco2020 = preco2020;
        this.preco2021 = preco2021;
        this.preco2022 = preco2022;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço médio: R$" + (preco2020 + preco2021 + preco2022) / 3);
        System.out.println("O maior preço: " + calcularMaiorPreco());
        System.out.println("O menor preco: " + calcularMenorPreco());
    }


    public double calcularMenorPreco(){
        if (preco2020 < preco2021 && preco2020 < preco2022) {
            return preco2020;
        } else if (preco2021 < preco2020 && preco2021 < preco2022) {
            return preco2021;
        } else {
            return preco2022;
        }
    }

    public double calcularMaiorPreco(){
        if (preco2020 > preco2021 && preco2020 > preco2022) {
            return preco2020;
        } else if (preco2021 > preco2020 && preco2021 > preco2022) {
            return preco2021;
        } else {
            return preco2022;
        }
    }
}

class ModeloCarro extends Carro {

}

class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Nissan Tiida");
        meuCarro.definirPrecos(40000, 39000, 38000);
        meuCarro.exibirInfo();
    }
}


