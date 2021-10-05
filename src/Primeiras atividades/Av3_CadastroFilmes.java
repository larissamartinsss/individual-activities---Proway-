package modulo1.atividades;

import java.util.Scanner;

public class Av3_CadastroFilmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ========= Cadastro de filmes, series e documentários =========");

        // Menu:
        System.out.println("Opções para cadastro: ");
        System.out.println("1- Filmes");
        System.out.println("2- Series");
        System.out.println("3- Documentários");
        System.out.println("0 - Sair");
        int opcoes = sc.nextInt();
        sc.nextLine();
        // Switch-Case - Escolher opções
        switch(opcoes){
            case 1:
                System.out.println("Digite o nome do filme a ser cadastrado: ");
                String filmeNome = sc.next();
                sc.nextLine();
                System.out.println("Digite a descrição: ");
                String filmeDesc = sc.next();
                sc.nextLine();
                System.out.println("Digite o genero: ");
                String filmeGen = sc.next();
                System.out.println("Digite o ano de lançamento: ");
                int filmeAno = sc.nextInt();
                // saída:
                System.out.print("Nome: " + filmeNome + " Descrição: "+ filmeDesc + " Gênero: " + filmeGen + " Ano: " + filmeAno);
                break;
            case 2:
                System.out.println("Digite o nome da serie a ser cadastrada: ");
                String serieNome = sc.next();
                sc.nextLine();
                System.out.println("Digite o ano de lançamento: ");
                int serieAno = sc.nextInt();
                System.out.println("Digite o nome da produtora: ");
                String serieProd = sc.next();
                // saída:
                System.out.print("Nome: " + serieNome + " Ano de lançamento: "+ serieAno + " Produtora: " + serieProd);
                break;
            case 3:
                System.out.println("Digite o documentário a ser cadastrado: ");
                String docNome = sc.next();
                sc.nextLine();
                System.out.println("Digite o ano de lançamento: ");
                int docAno = sc.nextInt();
                System.out.println("Digite o tema do documentário: ");
                String docTema = sc.next();
                // saída:
                System.out.print("Nome: " + docNome + " Ano de lançamento: "+ docAno + " Tema: " + docTema);
                break;
            case 0:
                System.out.println("Saindo... ");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
