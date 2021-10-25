package view;

import controller.CalculadoraController;
import model.Calculadora;

import java.util.Scanner;

public class CalculadoraView {
    public static void main(String[] args) {
        boolean continua = true;
        do{
        imprimiMenu();
        int opcao = lerNumero();
        opcoesMenu(opcao);
    }while (continua);

        private static boolean continuarMenu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Deseja continuar? (S/N)?");
            try {
                char resposta = sc.nextLine().toUpperCase().CharAt(0);
                if(resposta == 'S'){
                    return true;
                }
                else {
                    return false;
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            }

        }

    private static void imprimiMenu() {
        System.out.println("========= CALCULATOR ========= ");
        System.out.println("\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n0-Sair");
        System.out.println("Digite uma opção do menu: ");
    }

    private static int lerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido;
        do {
            try {
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.O valor deve ser um número inteiro. ");
                System.out.print("Digite novamente: ");
                valido = false;
            }
        } while (!valido);
        return numero;

    }

    private static void opcoesMenu() {
        Calculadora calc = new Calculadora();
        CalculadoraController calcController = new CalculadoraController();
        int resultado = 0;
        int opcao = lerNumero();
        System.out.print("Digite o 1º numero: ");
        calc.n1 = lerNumero();
        System.out.print("Digite o 1º numero: ");
        calc.n2 = lerNumero();

        if (opcao == 4) {
            boolean valido;
            do {
                try {
                    validaZero(calc.n2);
                    valido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Redigite: ");
                    valido = false;
                }

            } while (!valido);

            switch (opcao) {
                case 1:
                    resultado = calcController.soma(calc);
                    break;

                case 2:
                    resultado = calcController.substracao(calc);
                    break;

                case 3:
                    resultado = calcController.multiplicacao(calc);
                    break;

                case 4:
                    resultado = calcController.divisao(calc);
                    break;
            }
            System.out.println("O resultado da operação é: " + resultado);

        }
    }
        private static void validaZero ( int numero){
            if (numero == 0) {
                throw new IllegalArgumentException("O divisor não pode ser zero!");

            }
        }
}


