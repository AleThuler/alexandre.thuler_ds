package atividade_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GerenciadorDeSaqueBancario gerenciadorDeSaqueBancario = new GerenciadorDeSaqueBancario();

        try {
            System.out.println("Quanto reais você vai inserir??");
            int dinheiroASerInserido = input.nextInt();
            gerenciadorDeSaqueBancario.colocarDinheiro(dinheiroASerInserido);

            System.out.println("Quanto reais você vai sacar??");
            int dinheiroASerSacado = input.nextInt();
            gerenciadorDeSaqueBancario.fazerUmSaque(dinheiroASerSacado);

        } catch (SaldoInsuficienteException | ArgumentoIlegalException exception) {
            System.err.println(exception.getMessage());

        } finally {
            System.out.println("Operação finalizada");
            input.close();
        }
    }

}
