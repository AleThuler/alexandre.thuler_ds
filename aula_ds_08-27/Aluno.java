public class Aluno {
    private String nomeDoAluno;
    private int primeiraNotaParcial;
    private int segundaNotaParcial;

    public Aluno(String nomeDoAluno, int primeiraNotaParcial, int segundaNotaParcial) {
        this.nomeDoAluno = nomeDoAluno;

        if (primeiraNotaParcial < 0 || primeiraNotaParcial > 100){
            System.out.println("Primeira nota parcial passou dos limites. Valor definida para zero automáticamente");
            this.primeiraNotaParcial = 0;
        } else {
            this.primeiraNotaParcial = primeiraNotaParcial;
        }

        if (segundaNotaParcial < 0 || segundaNotaParcial > 100){
            System.out.println("Segunda nota parcial passou dos limites. Valor definida para zero automáticamente");
            this.segundaNotaParcial = 0;
        } else {
            this.segundaNotaParcial = segundaNotaParcial;
        }
    }

    public int getNotaFinalDoAluno(){
        return (getPrimeiraNotaParcial() + getSegundaNotaParcial())/2;
    }

    public String getNome() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getPrimeiraNotaParcial() {
        return primeiraNotaParcial;
    }

    public void setPrimeiraNotaParcial(int primeiraNotaParcial) {
        this.primeiraNotaParcial = primeiraNotaParcial;
    }

    public int getSegundaNotaParcial() {
        return segundaNotaParcial;
    }

    public void setSegundaNotaParcial(int segundaNotaParcial) {
        this.segundaNotaParcial = segundaNotaParcial;
    }
}
