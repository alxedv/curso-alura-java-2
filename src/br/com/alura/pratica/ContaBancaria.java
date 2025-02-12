package br.com.alura.pratica;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo atualizado: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }
}

class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;
    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("R$" + tarifaMensal + " foram debitados de sua conta. Agora tem: R$" + saldo);
    }
}

class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
