public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica){
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public void getCaracteristica(){
        System.out.println(this.caracteristica);
    }
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }


    public void dadosPeixe() {
        super.dados();
        System.out.printf("E teu peixe tem a característica de %s.%n", this.caracteristica);
        System.out.println("---Fim da exibição de dados---\n");
    }
}
