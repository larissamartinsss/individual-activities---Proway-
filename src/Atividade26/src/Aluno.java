import java.util.Objects;

public class Aluno extends Pessoa {
    public int matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(turma, aluno.turma) && Objects.equals(curso, aluno.curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", turma='" + turma + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
