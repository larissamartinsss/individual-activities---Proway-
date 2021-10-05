package modulo1.atividades.AtividadesEstruturaDeRepetição;

public class Av_EstruturaWhile {
    public static void main(String[] args) {
        String nome = "Larissa";
        String sobrenome = "Martins";
        int contador = 0;
        while(contador < 10){
            contador ++;
            System.out.printf("\n %d - O seu nome completo é: %s %s", contador, nome, sobrenome);
        }

    }
}
