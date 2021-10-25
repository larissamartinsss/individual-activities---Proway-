public class Calculadora {
    // _  Crie uma calculadora para realizar as quatro operações básicas: soma, subtração, multiplicação e divisão.
    //_  Deve possuir um menu para o usuário escolher a operação a realizar.
    //_  O sistema deve possuir um tratamento de exceção para evitar erro em uma divisão por zero.
    //_  O sistema deve possuir um tratamento de exceção durante a leitura dos dados para evitar que o usuário
    // insira algo diferente de números inteiros tanto para as operação quanto para o menu.

    public int soma(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }

    public int substracao(int n1, int n2) {
        int subtracao = n1 - n2;
        return subtracao;
    }

    public int multiplicacao(int n1, int n2) {
        int multiplicacao = n1 * n2;
        return multiplicacao;
    }

    public int divisao(int n1, int n2) {
        if (n2 != 0) {
            int divisao = n1 / n2;
            return divisao;
        } else {
            throw new DivisaoPorZeroException("Erro: Divisão por zero");
        }

    }

    public class DivisaoPorZeroException extends RuntimeException {
        public DivisaoPorZeroException(String message) {
            super(message);
        }
    }


}
