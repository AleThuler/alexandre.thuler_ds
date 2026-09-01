package com.alexandre.estudos;

import java.util.ArrayList;
import java.util.Collections;

public class CalculadoraDeNotas {
    private final ArrayList<Double> notas = new ArrayList<>();

    public void addNota(Double nota){
        notas.add(nota);
    }

    public void removeNotaPeloIndice(int indice){
        notas.remove(indice);
    }

    public void removeNotaEspecifica(Double nota){
        notas.remove(nota);
    }

    public String verNotas(){
        StringBuilder notasString = new StringBuilder();


        for (double nota : notas){
            notasString.append(nota);
            notasString.append(" ");
        }

        return notasString.toString();
    }

    public Double calcularMedia(){
        double media = 0;

        for (Double nota : notas){
            media+=nota;
        }
        return media / notas.size();
    }

    public void ordenarNotas(){
        Collections.sort(this.notas);
    }
}
