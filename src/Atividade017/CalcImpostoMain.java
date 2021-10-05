public class CalcImpostoMain {
    public static void main(String[] args) {
        Calc_Imposto calcImposto = new Calc_Imposto();
        // Chamando métodos
        System.out.println("========== Calculadora de impostos ==========");

        double iss = calcImposto.calcIss(4.000);
        double iof = calcImposto.calcIof(2.000);
        double ir = calcImposto.calcIr(3.000);

        System.out.printf("O ISS é: %.4f \n O IOF é: %.4f \n O IR é: %.4f \n", iss, iof, ir);
    }
}