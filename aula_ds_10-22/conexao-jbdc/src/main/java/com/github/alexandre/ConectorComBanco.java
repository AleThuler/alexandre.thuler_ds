package com.github.alexandre;

import java.sql.*;

public class ConectorComBanco {

    private String server;
    private String porta;
    private String banco;
    private String user;
    private String senha;

    private Connection conexao;
    private String url;

    public ConectorComBanco(String server, String porta, String banco, String user, String senha, String linguagem) {
        this.server = server;
        this.porta = porta;
        this.banco = banco;
        this.user = user;
        this.senha = senha;

        if (linguagem.equals("MySQL")){
            criarURLMySQL(server, porta, banco);
        } else if (linguagem.equals("MariaDB")){
            criarURLMariaDB(server, porta, banco);
        } else {
            System.out.println("Opção errada");
        }
    }

    private void criarURLMySQL(String server, String porta, String banco){
        url = "jdbc:mysql://" + server + ":" + porta + "/" + banco;
    }
    private void criarURLMariaDB(String server, String porta, String banco){
        url = "jdbc:mariadb://" + server + ":" + porta + "/" + banco;
    }

    public void conectarComOBanco() {
        try {
            System.out.println("Conectando ao Banco de Dados...");
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão efetuada com sucesso!");

        } catch (SQLException exception) {
            System.out.println("Erro ao conectar ao banco de dados.");
            exception.printStackTrace();
        }
    }

    public void fecharConexao (Connection conexao) {
        try {
            conexao.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public Connection getConexao(){
        return conexao;
    }



    // Setters
    public void setServer(String server) {
        this.server = server;
    }
    public void setPorta(String porta) {
        this.porta = porta;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
