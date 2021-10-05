public class Universidade {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Coordenador coordenador = new Coordenador();
        Aluno aluno = new Aluno();

        // Atribuindo valores ao funcionário:
        funcionario.setNome("Mateus");
        funcionario.setSobrenome("Fernandes");
        funcionario.setMatricula(21345321);
        funcionario.setDepartamento("TI");
        funcionario.setSalario(3.800);

        // Atribuindo valores ao Coordenador:
        coordenador.setNome("Carla");
        coordenador.setSobrenome("Alves");
        coordenador.setCursoCoordenado("Engenharia de Software");
        coordenador.setBonus(4.200);

        // Atribuindo valores ao aluno:
        aluno.setNome("Amanda");
        aluno.setSobrenome("Souza");
        aluno.setCurso("Análise e desev. de Sistemas");
        aluno.setMatricula(21851571);

        System.out.println("------------------- Aluno -------------------\n");
        System.out.printf("\nNome: %s \nSobrenome: %s \nCurso: %s  \n Matricula: %d", aluno.getNome(), aluno.getSobrenome(), aluno.getCurso(), aluno.getMatricula());

        System.out.println("------------------- Coordenador -------------------\n");
        System.out.printf("\nNome: %s \nSobrenome: %s \nCurso coordenado: %s  \n bonus: R$ %.3f", coordenador.getNome(), coordenador.getSobrenome(), coordenador.getCursoCoordenado(), coordenador.getBonus());


        System.out.println("------------------- Funcionário -------------------\n");
        System.out.printf("\n Nome: %s \nSobrenome: %s \nMatricula: %d \nDepartamento: %s\nSalário:R$ %.3f",
                funcionario.getNome(),
        funcionario.getSobrenome(),
        funcionario.getMatricula(),
        funcionario.getDepartamento(),
        funcionario.getSalario());
    }
}