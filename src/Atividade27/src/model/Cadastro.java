package model;

public class Cadastro {
    public int id;
    public String titulo;
    public String genero;
    public int ano;
    public String duracao;

    public Cadastro(int id) {
    this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Cadastro){
            Cadastro outro = (Cadastro)obj;
            if(this.id == outro.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nId: " + id +
                "\nTitulo: " + titulo +
                "\nGenero: " + genero +
                "\nAno: " + ano +
                "\nDuração: " + duracao;
    }
}
