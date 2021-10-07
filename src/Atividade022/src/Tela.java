public class Tela {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNomeCompleto("Larissa Martins de Souza");
        aluno1.setIdade(21);
        aluno1.setMatricula(001);

        aluno2.setNomeCompleto("Lucas Martins de Souza");
        aluno2.setIdade(27);
        aluno2.setMatricula(002);

        System.out.println(aluno1);
        System.out.println(aluno2);
    }
}
