package com.github.alexandre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class InstrutorDoBanco {

    private Connection conexaoComOBanco;

    private String instrucao = "";

    public InstrutorDoBanco(Connection conexaoComOBanco) {
        this.conexaoComOBanco = conexaoComOBanco;
    }

    public void criarTabela(String nomeDaTabela, ArrayList<String> campos){
        StringBuilder colunas = new StringBuilder();
        for (String quantidadeDeColunas : campos){
            colunas.append(campos);
        }

        instrucao = "CREATE TABLE IF NOT EXISTS " + nomeDaTabela + "(ID int PRIMARY KEY);";
        try {
            System.out.println("Iniciando criação da tabela");
            PreparedStatement preparedStatement = conexaoComOBanco.prepareStatement(instrucao);
            preparedStatement.execute();
            System.out.println("Tabela criada com sucesso");
        } catch (SQLException sqlException) {
            System.out.println("Deu erro ao criar tabela");
            sqlException.printStackTrace();
        }
    }

    public void derrubarTabela(String nomeDaTabela){
        instrucao = "DROP TABLE IF EXISTS " + nomeDaTabela;
        try {
            System.out.println("Iniciando a derrubada de tabela");
            PreparedStatement preparedStatement = conexaoComOBanco.prepareStatement(instrucao);
            preparedStatement.execute();
            System.out.println("Tabela derrubada com sucesso");
        } catch (SQLException sqlException){
            System.out.println("Deu erro a derrubar a tabela");
            sqlException.printStackTrace();
        }
    }
}
