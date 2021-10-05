package Banco;

public class ContaCorrente {
    private String agencia;
    private int numeroConta;
    private int codCliente;
    private double saldo;

    // Agência:

    public String getAgencia(){
        return this.agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    // Número conta:
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta( int numeroConta){
        this.numeroConta = numeroConta;
    }
    // Cód Cliente:

    public int getCodCliente(){
        return this.codCliente;
    }

    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
    }

    // Saldo:
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }



}
