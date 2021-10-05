public class CalculadoraTaxas {
    private double taxaTransf = 0.00001;
    private double valorSaque = 1.3;
    private int numeroSaques;
    
    public double calculaTaxaTransferencia(double valor){
        double valorTaxa = (valor*taxaTransf);
        return valorTaxa;
    }

    public double calculaTaxaSaque(double valor){
    numeroSaques++;
    double valorTaxa = 0;
    valorTaxa = valorSaque;
    if(numeroSaques % 5 == 0){
        valorTaxa = valorSaque;
    }
    return valorTaxa;
    }
}
