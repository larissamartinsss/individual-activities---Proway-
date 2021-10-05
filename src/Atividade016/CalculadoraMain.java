import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas: 
        System.out.println("Digite o valor a ser transferido: ");
        double valorTransf =  sc.nextDouble();
        
        // Chamando os métodos: 

        CalculadoraTaxas calcTaxas = new CalculadoraTaxas();
        System.out.println("Transferencia: \n");
          double taxatransf = calcTaxas.trBancarias(valorTransf); 
          System.out.println("A taxa de transferencia é: "+ taxatransf); 
          
          System.out.println("Saque: ");
   
        // implementação do for: 

        for (int i = 1; i < 11; i++) {
            double taxaSa = calcTaxas.taxaSaque();
            System.out.printf("Taxa de saque do saque %d: %f \n", i, taxaSa);
        }
        
    }
}
