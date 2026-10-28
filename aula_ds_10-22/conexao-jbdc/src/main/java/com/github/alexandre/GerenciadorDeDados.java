package com.github.alexandre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeDados {

    private Connection conexaoComOBanco;
    private final Scanner scanner = new Scanner(System.in);

    private String instrucao = "";
    private String colunasDaTabela;

    public GerenciadorDeDados(Connection conexaoComOBanco) {
        this.conexaoComOBanco = conexaoComOBanco;
    }

    public void criarTabela(String nomeDaTabela){
        colunasDaTabela = criarColunas();
        instrucao = String.format("CREATE TABLE IF NOT EXISTS %s (%s)", nomeDaTabela, colunasDaTabela.substring(1, colunasDaTabela.length() - 1));

        try {
            System.out.println("Iniciando criação da tabela");
            PreparedStatement preparedStatement = conexaoComOBanco.prepareStatement(instrucao);
            System.out.println(instrucao);
            //preparedStatement.execute();
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
            System.out.println(instrucao);
            //preparedStatement.execute();
            System.out.println("Tabela derrubada com sucesso");

        } catch (SQLException sqlException){
            System.out.println("Deu erro a derrubar a tabela");
            sqlException.printStackTrace();
        }
    }

    public void atualizarTabela(String nomeDaTabela){
        System.out.println(colunasDaTabela);
        System.out.println("Qual operação você vai fazer?");
        System.out.print("""
                1 - ADD COLUMN
                2- DROP COLUMN
                3 - RENAME_COLUMN,
                4 - MODIFY_COLUMN,
                5 - RENAME_TABLE""");

        int escolhaDoUser = scanner.nextInt();
        scanner.nextLine();

        System.out.println(atualizarTabela(nomeDaTabela, escolhaDoUser));
    }

    public String criarColunas(){
        int NumeroDeColunasDaTabela = 0;

        System.out.println("Quantas colunas ela vai ter?\n(O ID é gerado automáticamente)");
        NumeroDeColunasDaTabela = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> colunasArray = new ArrayList<>();

        for (int contadorDoLoop = NumeroDeColunasDaTabela; contadorDoLoop > 0; contadorDoLoop--) {
            StringBuilder coluna = new StringBuilder();

            System.out.println("Qual vai ser o nome da coluna?");
            String nomeDaColuna = scanner.nextLine();

            if (contadorDoLoop == NumeroDeColunasDaTabela){
                colunasArray.add("id INT AUTO_INCREMENT PRIMARY KEY");
            }

            colunasArray.add(switchEscolhaDeDado().toString());

            coluna.append(nomeDaColuna);
        }
        return colunasArray.toString();
    }

    private String colocarConstraintsNaColuna(StringBuilder coluna){
        System.out.print("""
                A tabela terá qual constraint?
                1 - NOT NULL
                2 - UNIQUE
                3 - NOT NULL + UNIQUE
                4 - Nenhum
                """);

        int escolhaUserConstraints = this.scanner.nextInt();
        this.scanner.nextLine();

        switch (escolhaUserConstraints){
            case 1:
                coluna.append(" NOT NULL");
                return coluna.toString();
            case 2:
                coluna.append(" UNIQUE");
                return coluna.toString();
            case 3:
                coluna.append(" NOT NULL UNIQUE");
                return coluna.toString();
            case 4:
                return coluna.toString();
            default:
                return coluna.toString();
        }
    }

    public void encerrarOGerenciamento(){
        System.out.println("Okay. A conexão com o banco será fechada");
        try {
            conexaoComOBanco.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        scanner.close();
    }

    private StringBuilder switchEscolhaDeDado(){
        StringBuilder coluna = new StringBuilder();

        System.out.print("""
                            Qual será o tipo da coluna?
                            1 - VARCHAR
                            2 - INT
                            3 - DOUBLE
                            4 - BOOLEAN
                            """);

        int tipoDaColuna = scanner.nextInt();
        scanner.nextLine();

        if (tipoDaColuna < 1 || tipoDaColuna > 4){
            throw new RuntimeException("Você não escolheu uma opção válida");
        }

        switch (tipoDaColuna){
            case 1:
                System.out.println("Qual o tamanho do varchar?");
                int tamanhoDoVarchar = scanner.nextInt();
                scanner.nextLine();

                coluna.append(String.format(" VARCHAR(%d)", tamanhoDoVarchar));
                colocarConstraintsNaColuna(coluna);
                return coluna;

            case 2:
                coluna.append(" INT");
                colocarConstraintsNaColuna(coluna);
                return coluna;

            case 3:
                coluna.append(" DOUBLE");
                colocarConstraintsNaColuna(coluna);
                return coluna;

            case 4:
                coluna.append(" BOOLEAN");
                colocarConstraintsNaColuna(coluna);
                return coluna;

            default:
                return coluna;
        }


    }

    public String atualizarTabela(String nomeDaTabela, int escolhaDoUser){
        String nomeDaColuna;
        String tipoDaColuna;

        switch (escolhaDoUser){
            case 1:
                System.out.println("Qual será o nome da nova coluna?");
                nomeDaColuna = scanner.nextLine();

                tipoDaColuna = switchEscolhaDeDado().toString();

                instrucao = String.format("ALTER %s ADD %s %s;", nomeDaTabela, nomeDaColuna, tipoDaColuna);
                return instrucao;

            case 2:
                System.out.println("Qual é o nome da coluna para derrubar?");
                nomeDaColuna = scanner.nextLine();

                instrucao = String.format("ALTER %s DROP COLUMN %s ;", nomeDaTabela ,nomeDaColuna);
                return instrucao;

            case 3:
                System.out.println("Qual é o nome da coluna?");
                nomeDaColuna = scanner.nextLine();

                System.out.println("Qual será o novo nome da nova coluna?");
                String novoNomeDaColuna = scanner.nextLine();

                instrucao = String.format("ALTER %s RENAME COLUMN %s TO %s;", nomeDaTabela, nomeDaColuna, novoNomeDaColuna);
                return instrucao;

            case 4:
                System.out.println("Qual será o nome da coluna a ser modificada?");
                nomeDaColuna = scanner.nextLine();

                tipoDaColuna = switchEscolhaDeDado().toString();

                instrucao = String.format("ALTER %s MODIFY COLUMN %s %s;", nomeDaTabela, nomeDaColuna, tipoDaColuna);
                return instrucao;
            case 5:
                System.out.println("Qual será o nome da nova tabela?");
                String inputDoUser = scanner.nextLine();

                instrucao = String.format("ALTER TABLE %s RENAME TO %s ;", nomeDaTabela, inputDoUser);
                return instrucao;
        }
        return "A";
    }

}
