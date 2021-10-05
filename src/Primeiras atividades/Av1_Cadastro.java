package modulo1.atividades;

import java.util.Scanner;

public class Av1_Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("###### SISTEMA PARA CADASTRO DE PRODUTOS ###########");
        System.out.println("Bem-vindo, digite as informações do produto. ");
        System.out.println("\n Usuario: ");
        String nome = sc.nextLine();
        System.out.println("\n Descrição: ");
        String descrição = sc.nextLine();
        System.out.println("\n valor: ");
        float valor = sc.nextFloat();
        System.out.printf("\n Categoria: ");
        String categoria = sc.next();

        System.out.printf("\t Usuario: %s \t Descrição: %s \tValor: %f \tCategoria: %s ", nome, descrição, valor, categoria);

        int n1 =5;
        int n2 = 6;
        if(n1 > n2) {
            System.out.println("Maior");
        }else if (n1 < n2){
            System.out.println("Menor");
        }else{
            System.out.println("Igual");
        }
    }



}

