package View;

import Controller.CrudCad;
import Model.CadLivros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadLivros cad = new CadLivros(1);
        cad.setTitulo("O alquimista");
        cad.setAutor("Paulo Coelho");
        cad.setNumPags(208);

        System.out.println("Digite a opção desejada: \n");
        System.out.println("1- Cadastrar \n2-Listar\n3-Atualizar\n4-Remover\n0-Sair");
        int opcao = Integer.parseInt(sc.nextLine());

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
            default:
                System.out.println("Saindo...");;
        }
    }
}
