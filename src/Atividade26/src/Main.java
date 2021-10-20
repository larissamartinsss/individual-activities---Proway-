public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Luana";
        pessoa1.sobrenome = "Mascarello";
        pessoa1.idade = 21;

        Aluno aluno = new Aluno();
        aluno.nome = "Gabriela";
        aluno.sobrenome = "Mascarello";
        aluno.matricula = 221226;
        aluno.turma = "9ºB";
        aluno.curso = "Design";
        aluno.idade = 22;


        Dados dados = new Dados();
        dados.adicionar(pessoa1);;
        dados.adicionar(aluno);
        dados.verify(pessoa1);
        dados.verify(aluno);
        dados.remove(aluno);

        Pessoa pesso2= pessoa1;

        System.out.println(aluno);
        System.out.println(pessoa1);






    }
}
