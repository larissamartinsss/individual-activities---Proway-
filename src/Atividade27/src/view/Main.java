package view;

import controller.Filmes;
import controller.Series;
import model.Cadastro;

public class Main {
    public static void main(String[] args) {
        Filmes filmes = new Filmes();
        Filmes f = new Filmes();
        f.id = 1;
        f.titulo = "Capitão Fantástico";
        f.genero = "Drama";
        f.ano = 2016;
        f.duracao = "1h58m";

        Series series = new Series();
        Series s = new Series();
        s.id = 2;
        s.titulo = "Anne with an E";
        s.genero = " Coming of age";
        s.ano = 2017;
        s.duracao = "3 temporadas";

        filmes.create(f);
        series.create(s);

        System.out.println(f);
        System.out.println(s);




    }
}
