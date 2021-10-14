package Model;

public class Livro {
    private int id;
    private String titulo;
    private String Autor;
    private int numPags;

    public Livro(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.Autor;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public int getNumPags() {
        return this.numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public boolean equals(Object obj) {
        Livro livros = (Livro) obj;
        if(this.id == livros.getId()){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", numPags=" + numPags +
                '}';
    }
}
