package view;

import controller.Filmes;
import controller.Series;

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
        Series s2 = new Series();
        s2.id = 3;
        s2.titulo = "The Bold Type";
        s2.genero = " Comédia dramatica";
        s2.ano = 2017;
        s2.duracao = "5 temporadas";

        //s = s2;

        filmes.create(f);
        series.create(s);
        series.delete(s);
        series.create(s2);

        System.out.println(f);
        System.out.println(s);
        System.out.println(s2);

        System.out.println(filmes.exist(f));
        System.out.println(series.exist(s));
        System.out.println(series.exist(s2));

    }
}
