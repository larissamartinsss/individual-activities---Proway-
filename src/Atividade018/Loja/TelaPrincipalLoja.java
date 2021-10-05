package Loja;

public class TelaPrincipalLoja {

    public static void main(String[] args) {
        Produto produto = new Produto();
        // Chamando setters and getters:

        produto.setCodigo(91332);
        int cod = produto.getCodigo();

        produto.setNome("Smartphone");
        String nome = produto.getNome();

        produto.setDescricao("Motorola - G9");
        String desc = produto.getDescricao();

        produto.setValor(1.300);
        double valor = produto.getValor();
        System.out.println("=========== INFORMAÇÕES DO PRODUTO ===========");
        System.out.printf(" Codigo:%d \n Nome: %s \n Descrição: %s\n Valor: R$%.3f", cod, nome, desc, valor);

    }
}
