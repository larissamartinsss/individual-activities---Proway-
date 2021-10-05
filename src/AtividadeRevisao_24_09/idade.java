package RevisaoAtvidade;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        byte idade = Byte.parseByte(sc.nextLine());

        if (idade > 25) {
            System.out.println("Você tem mais que 25 anos");
        }
        else if(idade < 25){
            System.out.println("Você tem menos que 25 anos");
        }
        else{
            System.out.println("Você tem 25 anos");
        }

    }
}