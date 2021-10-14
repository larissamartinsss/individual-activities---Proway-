package Controller;
import Model.CadLivros;
import java.util.ArrayList;

public class CrudCad {

    private ArrayList<CadLivros>livros;
    public CrudCad(){
        this.livros = new ArrayList<CadLivros>();
    }

    public void create(CadLivros livros){
        this.livros.add(livros);
    }

    public ArrayList<CadLivros> read(){
        return this.livros;
    }

    public void update(CadLivros livros) {
        if (this.livros.contains(livros)) {
            this.delete(livros);
            this.create(livros);
        }
    }
    public void delete(CadLivros id){
        this.livros.remove(id);
    }


}
