package Banco;

public class TelaBancoPrincipal {
    public static void main(String[] args) {
        ContaCorrente cCorrente = new ContaCorrente();

        // Chamando setters and getters:

        cCorrente.setAgencia("3220-1");
        String agencia = cCorrente.getAgencia();

        cCorrente.setNumeroConta(540432);
        int num = cCorrente.getNumeroConta();

        cCorrente.setCodCliente(2418);
        int cod = cCorrente.getCodCliente();

        cCorrente.setSaldo(7.300);
        double saldo = cCorrente.getSaldo();

        System.out.println("=========== INFORMAÇÕES DO CLIENTE ===========\n");
        System.out.printf(" Agencia:%s \n Número da conta: %d \n Código do cliente: %d\n Saldo: R$%.3f", agencia, num, cod, saldo);

    }
}
