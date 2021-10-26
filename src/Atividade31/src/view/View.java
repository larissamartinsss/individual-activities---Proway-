package view;

import control.ProdutosController;
import model.Produtos;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Produtos produtos = new Produtos();
        ProdutosController produtosController = new ProdutosController();
        imprimirMenu();
    }

    private static void imprimirMenu() {
        System.out.println("--------- Cadastro de Produtos ---------\n");
        System.out.println("1-Adicionar\n2-Atualizar\n3-Excluir\n4-Verificar\n5-Listar\n0-Sair");
        System.out.print("\nDigite uma opção do menu: ");
    }
    private static void opcoesMenu() {
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        validaOpcao(opcao);
        switch (opcao){
                case 1:

                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                case 0:

                break;
        }

    }

        private static void validaOpcao(int opcao) {
        if (opcao < 0 || opcao > 5) {
            throw new IllegalArgumentException("Opção inválida!");
        }
    }
}
