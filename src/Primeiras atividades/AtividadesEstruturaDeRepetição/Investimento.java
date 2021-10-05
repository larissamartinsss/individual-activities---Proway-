package modulo1.atividades.AtividadesEstruturaDeRepetição;

public class Investimento {
    public static void main(String[] args) {
        double totalInvest = 5.000;
        double novoInvest = totalInvest;
        double juroMes = 0.02;
        //double investMes = (totalInvest * juroMes) + novoInvest;
        for (int mes = 1; mes < 25; mes++) {
            novoInvest = (novoInvest * juroMes) + novoInvest;
            System.out.println("========= RETORNO JURO MENSAL ===========");
            System.out.printf("Mês %d - retorno de: %.2f reais \n", mes, novoInvest);
            System.out.println("Valor inicial + juros mensal: "+ (novoInvest+totalInvest));
        }

    }
}
