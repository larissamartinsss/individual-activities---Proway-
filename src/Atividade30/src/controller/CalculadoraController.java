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

    public double divisao(Calculadora calc) {
            double divisao = (double) calc.n1 / (double) calc.n2;
            return divisao;

    }


}
