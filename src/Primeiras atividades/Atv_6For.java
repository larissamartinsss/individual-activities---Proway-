package modulo1.atividades;

import java.util.Scanner;

public class Atv_6For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = ""; String sobrenome = "";
        for(int cont = 0; cont < 5; cont++){
            System.out.println("Digite o seu nome: ");
            nome = sc.nextLine();
            System.out.println("Digite seu sobrenome: ");
            sobrenome = sc.nextLine();
            System.out.printf("O usuario %d: nome:  %s Sobrenome: %s! \n", cont, nome, sobrenome);
        }

    }
}

