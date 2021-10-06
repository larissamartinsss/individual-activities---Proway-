public class Conta {
    private double saldo;
    private int codCliente;


    public double transferencia(double valorTransf){
        double saldoAtual = this.saldo - valorTransf;
        return saldoAtual;
    }


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodCliente() {
        return this.codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
}
