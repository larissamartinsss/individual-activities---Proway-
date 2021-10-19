import java.util.Objects;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(sobrenome, pessoa.sobrenome);
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nSobrenome: " + sobrenome + "\nIdade: " + idade;
    }
}
