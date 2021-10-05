package Atividade019;
public class Numeros{
    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
        }
            // foreach
        for (int i : numeros) {
            System.out.println(i);
        }

    }
}