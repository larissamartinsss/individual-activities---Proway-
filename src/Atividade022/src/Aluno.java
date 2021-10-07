public class Aluno {
    private String nomeCompleto;
    private int idade;
    private int matricula;


    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}
