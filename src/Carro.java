import java.time.Year;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void calcularIdadeCarro(){
        int year = Year.now().getValue();
        System.out.println("O carro tem " + (year - ano) + " anos");
    }
}
