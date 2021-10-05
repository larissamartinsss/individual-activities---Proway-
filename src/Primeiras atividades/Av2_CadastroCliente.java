package modulo1.atividades;

import java.util.Scanner;

public class Av2_CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("###### SISTEMA PARA CADASTRO DE CLIENTES ###########");
        System.out.println("Bem-vindo, digite as informações do cliente. ");
        System.out.println("\n Nome: ");
        String nome = sc.nextLine();
        System.out.println("\n Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("\n idade: ");
        byte idade = sc.nextByte();

        if(idade < 18) {
            System.out.println("O cliente não pode ser cadastrado");
        }else{
            System.out.printf("\n Nome: %s \n Sobrenome: %s \n Idade: %d \n Cliente cadastrado com sucesso!", nome, sobrenome, idade);

        }
    }
}

