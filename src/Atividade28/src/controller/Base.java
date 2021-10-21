package controller;

import model.Id;

import java.util.ArrayList;

public class Base<T> extends Id {
private ArrayList<T> dados;

// Crud
public void create(T obj) {
    this.dados.add(obj);
}

public ArrayList<T> read(){
    return this.dados;
}

public void update(T obj){
    if(exist(obj)){
        this.delete(obj);
        this.create(obj);
    }

}

public void delete(T obj){
    this.dados.remove(obj);
}

public boolean exist (T obj){
    return this.dados.contains(obj);
}


}
