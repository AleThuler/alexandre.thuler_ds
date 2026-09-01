public abstract class Veiculo {
    private String marca;
    private String modelo;

    public String RESET = "\u001B[0m";
    public String RED = "\u001B[31m";
    public String GREEN = "\u001B[32m";
    public String BLUE = "\u001B[34m";

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract double calcularConsumo();

    public void exibirInformacoes(String codigoInicial){
        System.out.printf(codigoInicial + "Modelo: %s%n", this.modelo);
        System.out.printf("Marca: %s%n%n" + this.RESET, this.marca);
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    //Aqui já é as coisinhas a mais


}
