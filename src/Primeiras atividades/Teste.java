package modulo1.atividades;


import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int anoNascimento;
        int anoAtual = 2021;
        int desco16 = 50;
        int desco21 = 20;
        int idade;
        float desc;
        String msg = ("\tCinemas Laydes Martins");
        String msg1 = "Lista de Filmes.";
        String menu = "\tFilmes\t";
        int Valor16 = 30;
        int valor21 = 30;
        int valor22 = 30;
        int opcao1 = 1;
        int opcao2 = 2;
        int opcao3 = 3;
        int opcao4 = 4;

        System.out.println(msg);
        System.out.println(msg1);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Selecione o filme de acordo com a numerção");
        System.out.println(menu);
        System.out.println("\t 1 - Velozes e Furiosos 9\t");
        System.out.println("\t 2 - Barraca do beijo\t");
        System.out.println("\t 3 - Patrulha Canina o filme\t");
        System.out.println("\t 4 - Minions 3\t");
        System.out.println("\n");
        int opcao = teclado.nextInt(); // faltou aparecer o desconto na atividade ta pedidno para imprimir na t

        switch (opcao = 0) {
            case 1: {
                opcao = opcao1;
                System.out.println("Velozes e Furiosos 9");
                break;
            }
            case 2: {
                opcao = opcao2;
                System.out.println("Barraca do Bejo");
                break;
            }
            case 3: {
                opcao = opcao3;
                System.out.println("Parulha Canina");
                break;
            }
            case 4: {
                opcao = opcao4;
                System.out.println(" Minions");
                break;
            }

        }
        System.out.println("O Filme escolhido estabelece "
                + "a LeiLEI Nº 8.069, DE 13 DE JULHO DE 1990 por favor "
                + "informe seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();

        idade = anoAtual - anoNasc;
        int resultado16 = (Valor16 * desco16) / 100;
        int resultado21 = (valor21 * desco21) / 100;

        if (idade <= 16) {
            System.out.println("Você tem 50% de desconto no seu ingresso e "
                    + "sairá no valor de" + resultado16);
        } else {
            System.out.println("Voce nao é menor idade");
        }
        if (idade >= 21) {
            System.out.println("Você tem 20% de desconto no ingresso");
        } else {
            System.out.println("Voce é maior de 16");
        }
        if (idade >= 22) ;
        {
            System.out.println("Seu ingresso custa " + resultado21 + "R$!");
        }


}

}
