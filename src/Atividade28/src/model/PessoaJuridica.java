package model;

public class PessoaJuridica extends Pessoa{
    public String cnpj;
    public String situacaoCad;

    @Override
    public String toString() {
        return  "\n---------Pessoa Juridica------------" +
                "\nId: " + id +
                "\nNome: " + nome +
                "\nEndereço: " + enderecoComercial +
                "\nCNPJ: " + cnpj +
                "\nSituação Cadastrado: " + situacaoCad;
    }
}
