package View;

import Controller.LivroController;
import Model.Livro;

import java.util.Scanner;

public class LivroView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LivroController crud = new LivroController();

        int opcao;
        do {
            System.out.println("Digite a opção desejada: \n");
            System.out.println("1- Cadastrar \n2-Listar\n3-Atualizar\n4-Remover\n0-Sair");
             opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    Livro livro1 = new Livro(1);
                    livro1.setTitulo("O alquimista");
                    livro1.setAutor("Paulo Coelho");
                    livro1.setNumPags(208);
                    crud.create(livro1);
                    break;
                case 2:
                    for (Livro book : crud.read()) {
                        System.out.println(book);
                    }
                    break;
                case 3:
                    //crud.update();
                    break;
                case 4:
                    // crud.delete();
                    break;
                case 5:
                default:
                    System.out.println("Saindo...");
                    ;
            }
        } while (opcao !=5);
    }
}
