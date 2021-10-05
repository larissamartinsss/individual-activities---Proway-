public class CalculadoraTaxas {
    private double taxasTrasnf = 0.00001;
    private double taxaSaque = 1.30;
    private int qtdSaque;

    double trBancarias(double valorTransferido){

        double ValorTaxa = valorTransferido * taxasTrasnf;
        return ValorTaxa;
    }

    double taxaSaque(){

        qtdSaque ++;
        if (qtdSaque %5 == 0) 
            return taxaSaque;
        return 0.0;      

    } 
    
}


