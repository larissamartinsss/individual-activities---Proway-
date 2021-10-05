package modulo1.atividades;

import java.util.Scanner;

public class Atv_metodos2 {
    public static void main(String[] args) {
  double valor1, valor2;
  cabecalho();
  valor1 = ler_numero();
  valor2 = ler_numero();
  double r_soma = soma(valor1, valor2);
  double r_subtracao= subtracao(valor1, valor2);
  double r_multiplicar = multiplicacao(valor1, valor2);
  double r_divisao = divisao(valor1, valor2);
    // resultado:

 imprimir_resultado("Soma", r_soma);
 imprimir_resultado("Subtração", r_subtracao);
 imprimir_resultado("Multiplicação", r_multiplicar);
 imprimir_resultado("Divisão", r_divisao);

    }

    static void imprimir_resultado(String nome_operacao, double resultado){
        System.out.printf("\nO resultado da %s é %.2f", nome_operacao, resultado);

    }

    static void cabecalho(){
        System.out.println("=========== CALCULADORA - 4 OPERAÇÕES ===========");
    }

    private static double ler_numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double valores = Double.parseDouble(sc.nextLine());
        return valores;
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
        if(valor2==0){
            System.out.println("Número invalido");
        }
        return resultado;
    }
}


