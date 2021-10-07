package Banco;

public class ContaCorrente {
    private double saldo = 5000;
    private double taxaSaque = 2;
    private int codCliente = 3;

    // Nao consegui fazer o construtor direito;
    public ContaCorrente() {
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
                ", codCliente: " + this.codCliente;
    }
}

