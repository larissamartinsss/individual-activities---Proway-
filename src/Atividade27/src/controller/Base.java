package controller;

import java.util.ArrayList;
// ArrayList Generics:
public class Base<T> {
    private ArrayList<T> base;

    public Base () {
        super();
        this.base = new ArrayList<T>();
    }
    // Crud:
    public void create(T obj){
        this.base.add(obj);
    }

    public ArrayList<T> read(){
        return this.base;
    }

    public void update(T obj){
        if(exist(obj)){
        this.delete(obj);
        this.create(obj);}
    }
    public void delete(T obj){
        this.base.remove(obj);
    }

    public boolean exist (T obj){
        return this.base.contains(obj);
    }

}

