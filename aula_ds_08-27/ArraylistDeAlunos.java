import java.util.ArrayList;

public class ArraylistDeAlunos {
    private ArrayList<Aluno> arrayDeAlunos = new ArrayList<>();

    public ArrayList<Aluno> getArrayDeAlunos() {
        return arrayDeAlunos;
    }

    public void adicionarUmAluno(String nomeDoAluno, int primeriaNotaParcial, int segundaNotaParcial){
        arrayDeAlunos.add(new Aluno(nomeDoAluno, primeriaNotaParcial, segundaNotaParcial));
    }

    private int getMediaDaTurma(){
        int mediaDaTurma = 0;

        for (Aluno aluno : arrayDeAlunos){
            mediaDaTurma += aluno.getNotaFinalDoAluno();
        }

        return mediaDaTurma/arrayDeAlunos.size();
    }

    private ArrayList<String> nomesAlunosAprovados(){
        ArrayList<String> nomesDoAlunos = new ArrayList<>();

        for (Aluno aluno : this.arrayDeAlunos){
            if (aluno.getNotaFinalDoAluno() >= 50){
                nomesDoAlunos.add(aluno.getNome());
            }
        }
        return nomesDoAlunos;
    }

    private ArrayList<String> nomesAlunosReprovados(){
        ArrayList<String> nomesDoAlunos = new ArrayList<>();

        for (Aluno aluno : this.arrayDeAlunos){
            if (aluno.getNotaFinalDoAluno() < 30){
                nomesDoAlunos.add(aluno.getNome());
            }
        }
        return nomesDoAlunos;
    }

    private ArrayList<String> nomesAlunosNotaMenorDaMedia(){
        ArrayList<String> nomesDoAlunos = new ArrayList<>();

        for (Aluno aluno : this.arrayDeAlunos){
            if (aluno.getNotaFinalDoAluno() < getMediaDaTurma()){
                nomesDoAlunos.add(aluno.getNome());
            }
        }
        return nomesDoAlunos;
    }

    private ArrayList<String> nomesAlunosForamPraFinal(){
        ArrayList<String> nomesDoAlunos = new ArrayList<>();

        for (Aluno aluno : this.arrayDeAlunos){
            if (aluno.getNotaFinalDoAluno() < 50 && aluno.getNotaFinalDoAluno() >= 30){
                nomesDoAlunos.add(aluno.getNome());
            }
        }
        return nomesDoAlunos;
    }


    public void mostrarTodosOsDadosDaSala(){
        System.out.println("------Média da sala------");
        System.out.printf("Média da turma: %d%n", getMediaDaTurma());

        System.out.println("\n------Alunos aprovados------");
        System.out.println("Nomes: " + nomesAlunosAprovados());

        System.out.println("\n------Alunos reprovados------");
        System.out.println("Nomes: " + nomesAlunosReprovados());

        System.out.println("\n------Alunos com nota menor da média------");
        System.out.println("Nomes: " + nomesAlunosNotaMenorDaMedia());

        System.out.println("\n------Alunos que foram para nota final------");
        System.out.println("Nomes: " + nomesAlunosForamPraFinal());

    }

}
