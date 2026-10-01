package atividade_3;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        CalculadorDeVelhice calculadorDeVelhice = new CalculadorDeVelhice();

        try {
            calculadorDeVelhice.verificarIdade();
        } catch (MuitoVelhoException e) {
            System.err.println(e.getMessage());
            calculadorDeVelhice.fecharOScanner();
        } catch (InputMismatchException inputMismatchException) {
            System.err.println("Colocou algo que não é um inteiro");
            calculadorDeVelhice.fecharOScanner();
        }
    }
}
