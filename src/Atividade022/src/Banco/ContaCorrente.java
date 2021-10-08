package Banco;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 2;
    private double codCliente;

    public ContaCorrente(double saldo, double codCliente) {
        this.saldo = saldo;
        this.codCliente = codCliente;
    }

    public void saque(double valor){
       this.saldo -= (valor + this.taxaSaque);
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "-----Conta Corrente------\n" +
                "Saldo: " + this.saldo +
                "\ntaxa Saque: " + this.taxaSaque +
                "\ncodCliente: " + this.codCliente;
    }
}

