package teste;

import calculo.CalculadoraSimples;

public class TesteCalculadoraSimples {
    public static void main(String[] args) {
        CalculadoraSimples calculadora3000 = new CalculadoraSimples();

        System.out.println(calculadora3000.somarValores(1,2));
        System.out.println(calculadora3000.subitrairValores(3,6));
        System.out.println(calculadora3000.multiplicarValores(7,7));
        System.out.println(calculadora3000.dividirValores(32,4));
        System.out.println(calculadora3000.dividirValores(4,0));
    }
}
