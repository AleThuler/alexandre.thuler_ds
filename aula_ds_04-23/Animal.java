public class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void getNome(){
        System.out.printf("O nome do teu animal é %s%n", this.nome);
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void getComprimento(){
        System.out.printf("O comprimento do %s é %s%n", this.nome, this.comprimento);
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public void getNumeroDePatas(){
        System.out.printf("O número de patas do %s é %s%n", this.nome, this.numeroDePatas);
    }
    public void setNumeroDePatas(int numeroDePatas){
        this.numeroDePatas = numeroDePatas;
    }

    public void getCor(){
        System.out.printf("A cor do %s é %s%n", this.nome, this.cor);
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public void getAmbiente(){
        System.out.printf("O ambiente do %s é %s%n", this.nome, this.ambiente);
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public void getVelocidadeMedia(){
        System.out.printf("A velocidade média do %s é %sm/s%n", this.nome, this.velocidadeMedia);
    }
    public void setVelocidadeMedia(float velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }

    public void dados(){
        System.out.println("\n---Ínicio da exibição de dados---");
        System.out.printf("O teu animal chama-se %s e tem %.2f m. de comprimento%n", this.nome, this.comprimento);
        System.out.printf("Ele tem %d patas e a cor dele é %s.%n", this.numeroDePatas, this.cor);
        System.out.printf("O habitat dele é %s.%n", this.ambiente);
        System.out.printf("Ele tem %.2f de velocidade média...%n", this.velocidadeMedia);
        if (this.getClass() == Animal.class) {
            System.out.printf("Você deveria colocar %s na Wikipedia.%n", this.nome);
            System.out.println("---Fim da exibição de dados---\n");
        } else {
            System.out.printf("Você deveria colocar %s na Wikipedia.%n", this.nome);
        }

    }
}