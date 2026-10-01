package atividade_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadorDeVelhice {
    private final Scanner input = new Scanner(System.in);

    public void verificarIdade() throws MuitoVelhoException, InputMismatchException {

        int idadeInserida = 0;

        System.out.println("Qual a sua idade??");
        idadeInserida = input.nextInt();

        if (idadeInserida > 120){
            throw new MuitoVelhoException();
        } else {
            System.out.println("Idade válida!");
        }
    }

    public void fecharOScanner(){
        input.close();
    }




}
