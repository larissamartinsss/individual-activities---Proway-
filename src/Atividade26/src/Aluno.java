import java.util.Objects;

public class Aluno extends Pessoa {
    public int matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno)) return false;
        Aluno aluno = (Aluno) obj;
        return + matricula == aluno.matricula && Objects.equals(turma, aluno.turma) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatricula: " + matricula +
                "\nTurma: " + turma +
                "\nCurso: " + curso;
    }
}
