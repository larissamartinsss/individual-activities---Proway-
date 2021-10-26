package view;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        imprimirMenu();
    }

    private static void imprimirMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- Cadastro de Produtos ---------\n");
        System.out.println("1-Adicionar\n2-Atualizar\n3-Excluir\n4-Verificar\n5-Listar\n0-Sair");
        System.out.print("\nDigite uma opção do menu: ");
        int opcao = sc.nextInt();
        validaOpcao(opcao);
    }

    private static void validaOpcao(int opcao) {
        if (opcao < 0 || opcao > 5) {
            throw new IllegalArgumentException("Opção inválida!");
        }
    }
}
