public class SalaDeAula {
    String codigo_azul = "\u001B[34m";
    String codigo_final = "\u001B[0m";

    int id;
    String materia;
    String professor;

    SalaDeAula(int id, String materia, String professor){
            this.id = id;
            this.materia = materia;
            this.professor = professor;
    }

    void alterarProfessor(String professor){
        this.professor = professor;
    }
    void alterarId(int id){
        this.id = id;
    }
    void alterarMateria(String materia){
        this.materia = materia;
    }

    void resetarTudo(){
        this.id = 0;
        this.materia = null;
        this.professor = null;
    }

    void mostrarDados(){
        System.out.println(String.format("\n%s ID: %d %s", codigo_azul, this.id, codigo_final));
        System.out.println(String.format("%s Materia: %s %s", codigo_azul, this.materia, codigo_final));
        System.out.println(String.format("%s Professor: %s %s", codigo_azul, this.professor, codigo_final));
    }
}
