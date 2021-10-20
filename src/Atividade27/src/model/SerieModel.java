package model;

public class SerieModel {
    public int id;
    public String titulo;
    public String genero;
    public int ano;
    public int temporadas;


    @Override
    public boolean equals(Object obj){
        if(obj instanceof SerieModel){
            SerieModel outro = (SerieModel)obj;
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
                "\nDuração: " + temporadas;
    }
}
