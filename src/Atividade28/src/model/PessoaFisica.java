package model;

public class PessoaFisica extends Pessoa{
    public String sobrenome;
    public String CPF;
    public String nasc;

    @Override
    public String toString() {
        return "------PESSOA FÍSISICA-------\n"+
                "\nId: " + id +
                "\nNome: " + nome +
                "\nEndereco: " + enderecoResidencial +
                "\nSobrenome: " + sobrenome +
                "\nCPF: " + CPF +
                "\nData de Nasc: " + nasc;
    }
}
