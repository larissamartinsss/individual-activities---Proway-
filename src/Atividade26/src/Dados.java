public class Dados {
    private Object dados[];
    public int cont = 0;
    public int tam = 5;

    public Dados() {
       this.dados = new Object[tam];
    }

    public void adicionar(Object obj){
        if(cont < dados.length){
            dados[cont]=obj;
            cont++;
        }else {
            Object[]dados2 = new Object[dados.length*2];
            dados = dados2;
        }

    }

    public int list(){
        return cont+1;
    }

    public void remover(Object obj){

    }
}
