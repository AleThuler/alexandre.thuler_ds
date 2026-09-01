package com.alexandre.estudos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodando = true;


        Scanner input = new Scanner(System.in);

        CalculadoraDeNotas notasDoPedro = new CalculadoraDeNotas();

        while (rodando){
            System.out.println("Qual será a nota do Pedro");
            String respotaDoUser = input.nextLine();


            if (respotaDoUser.equals("parar")){
                rodando = false;
                input.close();
                break;
            }

            double nota = Double.parseDouble(respotaDoUser);
            notasDoPedro.addNota(nota);

        }


        System.out.println(notasDoPedro.verNotas());
        System.out.println(notasDoPedro.calcularMedia());
    }
}