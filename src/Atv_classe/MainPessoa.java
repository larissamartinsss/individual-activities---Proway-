package Atv01_classe;

// Primeira atividade sobre Classes. 

public class MainPessoa {
    public static void main(String[] args) {
        ClassePessoa pessoa1 = new ClassePessoa();
        pessoa1.nome = "Larissa";
        pessoa1.sobrenome = "Martins";
        pessoa1.idade = 21;

        ClassePessoa pessoa2 = new ClassePessoa();
        pessoa2.nome = " Matheus";
        pessoa2.sobrenome = "Martins";
        pessoa2.idade = 15;
        System.out.println("========== Pessoa 1 ==========");
        System.out.println("Nome: "+ pessoa1.nome +"\nSobrenome:" + pessoa1.sobrenome + "\nIdade: " +pessoa1.idade);
        System.out.println("========== Pessoa 2 ==========");
        System.out.println("Nome: "+ pessoa2.nome +"\nSobrenome: " + pessoa2.sobrenome + "\nIdade: " +pessoa2.idade);

        
    }
    
}
