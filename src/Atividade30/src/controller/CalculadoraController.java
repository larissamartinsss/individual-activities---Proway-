package controller;

import model.Calculadora;

public class CalculadoraController {
    public int soma(Calculadora calc) {
        int soma = calc.n1 + calc.n2;
        return soma;
    }

    public int substracao(Calculadora calc) {
        int subtracao = calc.n1 - calc.n2;
        return subtracao;
    }

    public int multiplicacao(Calculadora calc) {
        int multiplicacao = calc.n1 * calc.n2;
        return multiplicacao;
    }

    public int divisao(Calculadora calc) {
        if (calc.n2 != 0) {
            int divisao = calc.n1 / calc.n2;
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
