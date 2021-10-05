public class Universidade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Coordenador coordenador = new Coordenador();
        Aluno aluno = new Aluno();

        // Atribuindo valores ao funcionário:
        funcionario.setNome("Mateus");
        funcionario.setSobrenome("Fernandes");
        funcionario.setMatricula(21345321);
        funcionario.setDepartamento("Administrativo");
        funcionario.setSalario(3.800);

        // Atribuindo valores ao Coordenador:
        coordenador.setNome("Carla");
        coordenador.setSobrenome("Alves");
        coordenador.setMatricula(342232321);
        coordenador.setDepartamento("Desenvolvimento de Software");
        coordenador.setCursoCoordenado("Engenharia de Software");
        coordenador.setSalario(10.799);
        coordenador.setBonus(0.2);

        // Atribuindo valores ao aluno:
        aluno.setNome("Amanda");
        aluno.setSobrenome("Souza");
        aluno.setCurso("Análise e desev. de Sistemas");
        aluno.setTurma("9B");
        aluno.setMatricula(21851571);

        System.out.println("------------------- Aluno -------------------\n");
        System.out.printf("\nNome: %s \nSobrenome: %s \nCurso: %s  \n Turma: %s\nMatricula: %d",
                aluno.getNome(), aluno.getSobrenome(), aluno.getCurso(),aluno.getTurma(),aluno.getMatricula());

        System.out.println("------------------- Coordenador -------------------\n");
        System.out.printf("\nNome: %s \nSobrenome: %s \nMatricula:%d \nDepartamento: %s\nCurso coordenado: %s  \n Sálario: R$ %.3f\nbonus: R$ %.3f",
                coordenador.getNome(), coordenador.getSobrenome(), coordenador.getMatricula(), coordenador.getDepartamento(),
                coordenador.getCursoCoordenado(), coordenador.getSalario(),
                coordenador.getBonus());


        System.out.println("------------------- Funcionário -------------------\n");
        System.out.printf("\n Nome: %s \nSobrenome: %s \nMatricula: %d \nDepartamento: %s\nSalário:R$ %.3f",
                funcionario.getNome(),
                funcionario.getSobrenome(),
                funcionario.getMatricula(),
                funcionario.getDepartamento(),
                funcionario.getSalario());
    }
}