public class Teste {
    public static void main(String[] args) {
        // objeto conta:
        Conta conta = new Conta();
        // objeto conta-corrente:
        ContaCorrente cc = new ContaCorrente();
        // set conta:
        conta.setSaldo(23.750);
        conta.setCodCliente(21851);
        double saldoInicial = conta.getSaldo();
        //set conta corrente:
        cc.setSaldo(11.500);
        cc.setCodCliente(321251);
        double saldoInicialCC = cc.getSaldo();
        // transferencia:
        conta.transferencia(2.300);
        cc.transferencia(1.480);

        //Imprimindo:
        System.out.println("-----------------Conta-----------------\n");
        System.out.printf("Cód. Cliente: %d \nSaldo:R$%.3f \nSaldo após transferencia: R$%.3f\n", conta.getCodCliente(),saldoInicial , conta.getSaldo());
        System.out.println("\n-----------------Conta Corrente--------------\n");
        System.out.printf("Cód. Cliente: %d \nSaldo:R$%.3f \nSaldo após transferencia: R$%.3f\n", cc.getCodCliente(),saldoInicialCC ,cc.getSaldo());

    }
}
