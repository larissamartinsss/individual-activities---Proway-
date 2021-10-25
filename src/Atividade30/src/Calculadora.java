import java.util.Scanner;

public class Calculadora {
    // _  Crie uma calculadora para realizar as quatro operações básicas: soma, subtração, multiplicação e divisão.
    //_  Deve possuir um menu para o usuário escolher a operação a realizar.
    //_  O sistema deve possuir um tratamento de exceção para evitar erro em uma divisão por zero.
    //_  O sistema deve possuir um tratamento de exceção durante a leitura dos dados para evitar que o usuário
    // insira algo diferente de números inteiros tanto para as operação quanto para o menu.

        public void soma(double n1, double n2){
            double soma = n1 + n2;
        }

        public void substracao(double n1, double n2){
            double subtracao = n1 - n2;
        }

        public void multiplicacao(double n1, double n2){
            double multiplicacao = n1 - n2;
         }

        public void divisao(double n1, double n2){
        double divisao = n1 - n2;
        }

        public void menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha a opção desejada: ");
            String opcao = sc.nextLine();

            switch (opcao){
                case "+":
                    soma(20,65);
                    break;

                    case "-":
                    substracao(75,20);
                    break;

                case "*":
                    multiplicacao(10,4);
                    break;

                case "/":
                    divisao(15,3);
                    break;

                case "s":
                    System.out.println("Saindo...");
                    break;
            }



        }




}
