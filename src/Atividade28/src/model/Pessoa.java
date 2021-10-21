package model;

import controller.Base;

public abstract class Pessoa extends Base {
    public String nome;
    public Endereco enderecoResidencial;
    public Endereco enderecoComercial;
    public String id;
    public void id(){
        this.id = id;
    }
}
