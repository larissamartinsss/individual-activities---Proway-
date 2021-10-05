package modulo1.atividades;
import java.util.Scanner;

public class atv_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result;
        cabecalho();
        System.out.println("Digite o 1º valor: ");
        double valor1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o 2º valor: ");
        double valor2 = Double.parseDouble(sc.nextLine());
        //soma
        result = soma(valor1, valor2);
        System.out.println("O resultado da soma é: " + result);
        // subtração
        result = subtracao(valor1, valor2);
        System.out.println("O resultado da subtração é: " + result);
        // multiplicação
        result = multiplicacao(valor1, valor2);
        System.out.println("O resultado da multiplicação é: " + result);
        // divisao
        result = divisao(valor1, valor2);
        System.out.println("O resultado da divisao é: " + result);

    }
    static void cabecalho(){
        System.out.println("=========== CALCULADORA - 4 OPERAÇÕES ===========");
    }

    static double soma(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        return resultado;
    }

    static double subtracao(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        return resultado;
    }

    static double multiplicacao(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        return resultado;
    }

    static double divisao(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        return resultado;
    }
}
