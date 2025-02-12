package br.com.alura.pratica;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int number){
        for (int i = 2; i <= number/2; i++)
        {
            if(number% i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int numberMax){
        for (int i = 2; i <= numberMax; i++)
        {
            if(verificarPrimalidade(i))
            {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}

class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}

// Subclasse GeradorPrimo
class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int ultimoPrimoConhecido) {
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}

// Classe de Teste
class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
