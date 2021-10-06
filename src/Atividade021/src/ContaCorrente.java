public class ContaCorrente extends Conta {
    private double taxaTransf = 10.5;
    private double taxaManut = 2.50;
    private double numTrasnf = 0.0;

    @Override
    public void transferencia(double valorTransf){
        super.transferencia(valorTransf);
        double saldoAtual = this.getSaldo() - taxaTransf;
        this.setSaldo(saldoAtual);
        if(numTrasnf %5 == 0){
            double novoSaldo = getSaldo() - taxaManut;
            this.setSaldo(novoSaldo);
        }
        this.numTrasnf ++;

    }

}
