package model;

public class FilmeModel {
    public int id;
    public String titulo;
    public String genero;
    public int ano;
    public String duracao;

    public FilmeModel(int id) {
    this.id = id;
    }

    public FilmeModel() {

    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof FilmeModel){
            FilmeModel outro = (FilmeModel)obj;
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
