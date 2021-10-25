import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção desejada: ");
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

            case 0:
                System.out.println("Saindo...");
                break;
        }
    }
}
