package Banco;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(5000, 3);

        conta.deposito(10);
        conta.saque(100);
        System.out.println(conta);
    }
}
