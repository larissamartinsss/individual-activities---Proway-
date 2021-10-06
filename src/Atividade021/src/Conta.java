public class Conta {
    private double saldo;
    private int codCliente;


    public void transferencia(double valorTransf){
        this.saldo -= valorTransf;
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
