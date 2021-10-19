public class Dados {
    private Object dados[];
    public int cont = 0;
    public int tam = 5;

    public Dados() {
        this.dados = new Object[tam];
    }

    public void adicionar(Object obj) {
        if (cont < dados.length) {
            dados[cont] = obj;
            cont++;
        } else {
            Object[] dados2 = new Object[dados.length * 2];
            dados = dados2;
        }

    }

    public String remove(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].equals(obj)) {
                cont--;
                return "Removido";
            }
        }
        return "Não encontrado";
    }

    public String verify(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (dados[i].equals(obj)) {
                return "O item já existe.";
            }
        }
        return "Não encontrado";
    }
}



