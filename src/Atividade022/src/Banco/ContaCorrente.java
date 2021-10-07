package Banco;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque = 2.50;
    private int codCliente;

    public ContaCorrente(double saldo, int codCliente) {
        this.saldo = saldo;
        this.codCliente = codCliente;
    }

    public void saque(double valor){
        double saque = (this.saldo - valor - this.taxaSaque);
    }

    public void deposito(double valor){
        double saldoAtual = this.saldo + valor;
    }

}

