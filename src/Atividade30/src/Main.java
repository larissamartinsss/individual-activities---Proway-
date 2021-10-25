import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int n1, n2;
        int opcao = -1;

        System.out.println("\nEscolha a opção desejada: ");
        System.out.println("\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        opcao = Integer.parseInt(sc.nextLine());
       // do {
            switch (opcao) {
                case 1:
                    System.out.println("\nDigite os números a serem somados: ");
                     n1 = Integer.parseInt(sc.nextLine());
                     n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.soma(n1, n2));

                    break;

                case 2:
                    System.out.println("\nDigite os números a serem subtraídos: ");
                    n1 = Integer.parseInt(sc.nextLine());
                    n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.substracao(n1, n2));

                    break;

                case 3:
                    System.out.println("\nDigite os números a serem multiplicados: ");
                    n1 = Integer.parseInt(sc.nextLine());
                    n2 = Integer.parseInt(sc.nextLine());
                    System.out.println(calc.multiplicacao(n1, n2));

                    break;

                case 4:
                    System.out.println("\nDigite os números a serem divididos: ");
                    try{
                        n1 = Integer.parseInt(sc.nextLine());
                        n2 = Integer.parseInt(sc.nextLine());
                        System.out.println(calc.divisao(n1, n2));
                    } catch(ArithmeticException ex){
                        System.out.println("Não é possível realizar divisao por zero");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            }
       // } while (opcao > 0 && opcao < 5);
    }
}
