public class Carro extends Veiculo{
    double cilidrada;
    Carro(String marca, String modelo, double cilidrada){
        super(marca, modelo);
        this.cilidrada = cilidrada;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes("\u001B[31m");
    }

    @Override
    public double calcularConsumo(){
        return 15.0 - (cilidrada / 200);
    }
}