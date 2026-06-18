public class Mamifero extends Animal {
    String alimento;

    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento){
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public void getAlimento(){
        System.out.println(this.alimento);
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        super.dados();
        System.out.printf("E teu mamífero come %s.%n", this.alimento);
        System.out.println("---Fim da exibição de dados---\n");
    }
}
