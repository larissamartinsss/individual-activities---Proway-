package model;

import java.util.Objects;

public class Produtos extends Base{
    private String nomeProd;
    private String descricao;
    private double preco;
    private Categoria categorias;

    public Produtos(){
        this.categorias = new Categoria();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Produtos) {
           Produtos outro = (Produtos)obj;
           if(this.id == outro.id){
               return true;
           }
       }
       return true;
    }

    @Override
    public String toString(){
        return "\n############ Produto ############"+
                "\nNome: "+nomeProd+"\nDescrição: "+this.descricao+
                "\nPreço: "+this.preco+"Categoria: "+this.categorias;
    }


}
