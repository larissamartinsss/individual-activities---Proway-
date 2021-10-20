package controller;

import java.util.ArrayList;
// ArrayList Generics:
public class Base<T> {
    private ArrayList<T> cadastro;

    public Base() {
        this.cadastro = new ArrayList<T>();
    }
    // Crud:
    public void create(T obj){
        this.cadastro.add(obj);
    }

    public ArrayList<T> read(){
        return this.cadastro;
    }

    public void update(T obj){
        //  if(exist(obj)){
        //  this.delete(obj);
        //  this.create(obj);}
    }
    public void delete(T obj){
        this.cadastro.remove(obj);
    }

    public boolean exist (T obj){
        return this.cadastro.contains(obj);
    }

}

