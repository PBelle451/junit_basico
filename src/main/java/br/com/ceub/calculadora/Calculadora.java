package br.com.ceub.calculadora;

public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Um número não pode ser divido por zero");
        }
        return a / b;
    }
}
