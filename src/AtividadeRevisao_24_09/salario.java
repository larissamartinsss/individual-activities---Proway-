package RevisaoAtvidade;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double salario = 0.0;

        do {
            System.out.println("Digite seu salário: ");
            salario = Double.parseDouble(sc.nextLine());

            if (salario > 1997.58) {
                System.out.println("Seu sálario é maior que 1997.58 reais");
            } else if (salario > 5399.99) {
                System.out.println("Seu é maior que 5399.99 reais");

            } else if (salario <= 0) {
                System.out.println("Sálario inválido, digite novamente");
            } else {
                System.out.println("Seu sálario é: " + salario);
                System.out.println("---------- FIM DO PROGRAMA ----------");
            }
        } while (salario <= 0);

    }
}
