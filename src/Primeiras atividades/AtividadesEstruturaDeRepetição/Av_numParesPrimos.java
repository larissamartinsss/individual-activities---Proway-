package modulo1.atividades.AtividadesEstruturaDeRepetição;

public class Av_numParesPrimos {
    public static void main(String[] args) {

        // Números pares:

        for (int nPares = 2; nPares <= 100; nPares++) {
            if (nPares % 2 == 0) {
                System.out.println(nPares + "\n ");
            }
        }
        // numeros primos:

        for (int nPrimo = 1; nPrimo <= 150; nPrimo++) {
            boolean primo = true;
            for (int num = 2; num < nPrimo ; num++) {
                if(nPrimo%num == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(nPrimo);
            }
        }

    }

}

