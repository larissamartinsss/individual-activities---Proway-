package Controller;
import Model.Livro;
import java.util.ArrayList;

public class ControlLivros {

    private ArrayList<Livro>livros;
    public ControlLivros(){
        this.livros = new ArrayList<Livro>();
    }

    public void create(Livro livros){
        this.livros.add(livros);
    }

    public ArrayList<Livro> read(){
        return this.livros;
    }

    public void update(Livro livros) {
        if (this.livros.contains(livros)) {
            this.delete(livros);
            this.create(livros);
        }
    }
    public void delete(Livro l){
        this.livros.remove(l);
    }


}
