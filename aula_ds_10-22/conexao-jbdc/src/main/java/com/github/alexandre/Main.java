package com.github.alexandre;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ConectorComBanco conectorComBanco = new ConectorComBanco("localhost", "3306", "banco_malvado", "root", "", "MySQL");

        conectorComBanco.conectarComOBanco();

        Connection objConexaoComBanco = conectorComBanco.getConexao();
        InstrutorDoBanco instrutorDoBanco = new InstrutorDoBanco(objConexaoComBanco);

        ArrayList<String> colunas = new ArrayList<>();

        instrutorDoBanco.criarTabela("pessoas_do_mal", colunas);

        conectorComBanco.fecharConexao(objConexaoComBanco);

    }
}