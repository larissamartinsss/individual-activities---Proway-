public class Calc_Imposto {
    // Imposto Sobre Serviços
    private double iss = 0.04;
    //  Imposto sobre Operações Financeiras
    private double iof = 0.06;
    // Imposto de Renda
    private double ir = 0.07;
    
    double calcIss(double valor){
        double calculoIss = valor * iss;
        return calculoIss;
    }

    double calcIof(double valor){
        double calculoIof = valor *iof;
        return calculoIof;
    }

    double calcIr(double salario){
        double calculoIr = salario * ir;
        return calculoIr;
    }
}
