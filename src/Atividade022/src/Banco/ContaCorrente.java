package Banco;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque;
    private int codCliente;

    public ContaCorrente(double saldo, int codCliente) {
        this.saldo = saldo;
        this.codCliente = codCliente;
    }
}
