public class Teste {
    public static void main(String[] args) {
        // objeto conta:
        Conta conta = new Conta();
        // objeto conta-corrente:
        ContaCorrente cc = new ContaCorrente();
        // set conta:
        conta.setSaldo(23.750);
        conta.setCodCliente(21851);
        //set conta corrente:
        cc.setSaldo(11.500);
        cc.setCodCliente(321251);
        // transferencia:
        conta.transferencia(2.300);
        cc.transferencia(1.480);

        //Imprimindo:
        System.out.println("-----------------Conta-----------------\n");
        System.out.printf("Cód. Cliente: %d \nSaldo: \nSaldo após transferencia: R$%.3f\n", conta.getCodCliente(), conta.getSaldo());
        System.out.println("\n-----------------Conta Corrente--------------\n");
        System.out.printf("Cód. Cliente: %d \nSaldo: \nSaldo após transferencia: R$%.3f\n", cc.getCodCliente(), cc.getSaldo());

    }
}
