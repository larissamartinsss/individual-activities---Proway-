package Loja;

public class Produto{

private int codigo;
private String nome;
private String descricao;
private double valor;


public int getCodigo(){
    return this.codigo;
}

public void setCodigo(int codigo){
    this.codigo = codigo;
}

public String getNome(){
    return this.nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getDescricao(){
    return this.descricao;
}

public void setDescricao(String descricao){
    this.descricao = descricao;
}

public double getValor(){
    return this.valor;
}

public void setValor(double valor){
    this.valor = valor;
}



}