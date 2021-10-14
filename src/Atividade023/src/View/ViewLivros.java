package View;

import Controller.ControlLivros;
import Model.Livro;

import java.util.Scanner;

public class ViewLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControlLivros crud = new ControlLivros();

        int opcao;
        do {
            System.out.println("Digite a opção desejada: \n");
            System.out.println("1- Cadastrar \n2-Listar\n3-Atualizar\n4-Remover\n0-Sair");
             opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    Livro cad = new Livro(1);
                    cad.setTitulo("O alquimista");
                    cad.setAutor("Paulo Coelho");
                    cad.setNumPags(208);
                    crud.create(cad);
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
