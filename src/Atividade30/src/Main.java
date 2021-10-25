import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

            System.out.println("\nEscolha a opção desejada: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    System.out.println("\nDigite os números a serem somados: ");
                    int n1 = Integer.parseInt(sc.nextLine()); int n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.soma(n1, n2));

                    break;

                case 2:
                    System.out.println("\nDigite os números a serem subtraídos: ");
                    n1 = Integer.parseInt(sc.nextLine()); n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.substracao(n1, n2));

                    break;

                case 3:
                    System.out.println("\nDigite os números a serem multiplicados: ");
                    n1 = Integer.parseInt(sc.nextLine()); n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.multiplicacao(n1, n2));

                    break;

                case 4:
                    System.out.println("\nDigite os números a serem divididos: ");
                    n1 = Integer.parseInt(sc.nextLine()); n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.divisao(n1, n2));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
