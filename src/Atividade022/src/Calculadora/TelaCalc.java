package Calculadora;

public class TelaCalc {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int calcInt = calc.soma(20, 54);
        double calcDouble = calc.soma(33, 21);
        float calcFloat = calc.soma(21,33,66);
        long calcLong = calc.soma(10,20,30);

        System.out.printf("===== Calc =======\n" +
                "Soma int: %d \nSoma Double: %.2f\nSoma float: %.2f\nSoma Long: %d",
                calcInt, calcDouble, calcFloat, calcLong);
    }
}
