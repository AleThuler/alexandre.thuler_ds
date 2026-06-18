public class Moto extends Veiculo{
    int cilindradas;
    Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes("\u001B[32m");
    }

    @Override
    public double calcularConsumo(){
        return 30 - (cilindradas / 100);
    }
}
