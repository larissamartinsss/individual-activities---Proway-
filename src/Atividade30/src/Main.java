import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int n1 = 0; int n2 = 0; int opcao = -1;

        do {
            System.out.println("\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n0-Sair");
            opcao = lerNum(sc, "\nEscolha a opção desejada:");
             if (opcao > 0 && opcao < 5) {
                n1 = lerNum(sc, "Diite o 1º número: ");
                n2 = lerNum(sc, "Diite o 2º número: ");
            }
            switch (opcao) {
                case 1:
                    System.out.println("\n------SOMA------");
                    System.out.println("O resultado da soma é: "+calc.soma(n1, n2));
                    break;

                case 2:
                    System.out.println("\n------SUBTRAÇÃO------");
                    System.out.println("O resultado da subtração é: "+calc.substracao(n1,n2));
                    break;

                case 3:
                    System.out.println("\n------MULTIPLICAÇÃO------");
                    System.out.println("O resultado da multiplicação é: "+calc.multiplicacao(n1, n2));
                    break;

                case 4:
                    System.out.println("\n------DIVISÃO------");
                    try {
                        System.out.println("O resultado da divisão é: "+calc.divisao(n1, n2));
                    } catch (Calculadora.DivisaoPorZeroException ex) {
                        System.out.println("Não é possível realizar divisao por zero");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 0);

    }
    public static int lerNum(Scanner sc, String mensagem){
        int num = 0;
        boolean valido = false;
        do{
            try{
                System.out.print(mensagem);
                num = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch(NumberFormatException ex){
                System.out.println("Valor digitado é inválido!");
            }
        } while(!valido);
        return num;
    }
}
