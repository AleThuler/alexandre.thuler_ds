package com.github.alexandre;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        boolean condicaoDoWhile = true;

        ConectorComBanco conectorComBanco = new ConectorComBanco("localhost", "3306", "banco_malvado", "root", "", "MySQL");


        conectorComBanco.conectarComOBanco();

        Connection objConexaoComBanco = conectorComBanco.getConexao();
        GerenciadorDeDados gerenciadorDeDados = new GerenciadorDeDados(objConexaoComBanco);


        while (condicaoDoWhile) {
            System.out.println("Qual operação você vai fazer?");
            System.out.print("""
                    1 - Criar uma tabela
                    2 - Derrubar uma tabela
                    3 - Atualizar a tabela
                    4 - Nenhuma
                    """);
            int escolhaDoUser = scanner.nextInt();
            scanner.nextLine();


            switch (escolhaDoUser){
                case 1:
                    System.out.println("Qual o nome da tabela a ser criada?");
                    String nomeDaTabelaCriar = scanner.nextLine();
                    gerenciadorDeDados.criarTabela(nomeDaTabelaCriar);
                    break;
                case 2:
                    System.out.println("Qual o nome da tabela a ser derrubada?");
                    String nomeDaTabelaDerrubar = scanner.nextLine();
                    gerenciadorDeDados.derrubarTabela(nomeDaTabelaDerrubar);
                    break;
                case 3:
                    System.out.println("Qual o nome da tabela a ser atualizada??");
                    String nomeDaTabelaAtualizar = scanner.nextLine();
                    gerenciadorDeDados.atualizarTabela(nomeDaTabelaAtualizar);
                    break;
                case 4:
                    System.out.println("Bye");
                    condicaoDoWhile = false;
                    //gerenciadorDeDados.encerrarOGerenciamento();
                    break;
            }
        }


        gerenciadorDeDados.criarColunas();

        gerenciadorDeDados.encerrarOGerenciamento();


    }

}