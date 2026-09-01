import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean rodando = true;
        String nome = "";

        ArraylistDeAlunos turmaDeDS = new ArraylistDeAlunos();

        while (rodando){
            System.out.println("Qual o nome do aluno??");
            nome = input.nextLine();
            if (nome.equals("fim")){
                rodando = false;
                break;
            } else {
                System.out.println("Qual a primeira nota do aluno??");
                int primeiraNotaParcial = input.nextInt();

                System.out.println("Qual a segunda nota do aluno??");
                int segundaNotaParcial = input.nextInt();

                //Deixa eu colocar o próximo nome sem um bug
                input.nextLine();

                turmaDeDS.adicionarUmAluno(nome, primeiraNotaParcial, segundaNotaParcial);
            }
        }

        if (!nome.equals("fim") || !turmaDeDS.getArrayDeAlunos().isEmpty()){
            turmaDeDS.mostrarTodosOsDadosDaSala();
        }


    }
}