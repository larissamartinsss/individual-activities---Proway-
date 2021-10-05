package modulo1.atividades;

import java.util.Scanner;

public class Av4_CadastroClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("###### SISTEMA PARA CADASTRO DE CLIENTES ###########");

        // Menu:
        System.out.println("Opções: ");
        System.out.println("1- Cadastrar clientes");
        System.out.println("2- Listar clientes");
        System.out.println("0 - Sair");
        int opcoes = sc.nextInt();
        sc.nextLine();
        // Switch-Case - Escolher opções
        boolean invalido = true;
        switch (opcoes) {
            case 1:
                while (invalido) {
                    System.out.println("Digite o nome do cliente a ser cadastrado: ");
                    String nomeCliente = sc.next();
                    sc.nextLine();
                    System.out.println("Digite o sobrenome: ");
                    String sobrenome = sc.next();
                    sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 3 caracteres");
                        System.out.println("Redigite");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;
                while (invalido) {
                    System.out.println("Digite o CPF: ");
                    String cpf = sc.next();
                    if (cpf.length() < 11) {
                        System.out.println("O CPF deve ter mais que 11 caracteres");
                        System.out.println("Redigite");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;

                while (invalido) {
                    System.out.println("Digite o RG: ");
                    String rg = sc.next();
                    if (rg.length() < 4) {
                        System.out.println("O RG deve ter mais que 4 caracteres");
                        System.out.println("Redigite");
                    } else {
                        invalido = false;
                    }
                    invalido = true;
                    break;
                }

            case 2:
                System.out.println("Listar Clientes: ");
                // saída:
                //System.out.print("Nome: " + nomeCliente + " Sobrenome: " + sobrenome + " RG: " + rg + " CPF: " + cpf);
                invalido = true;
                break;
            case 0:
                System.out.println("Sair... ");
                invalido = true;
                break;
        }
    }
}



