public class Caminhao extends Veiculo{
    int capacidadeCarga;
    Caminhao(String marca, String modelo, int capacidadeCarga){
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes("\u001B[34m");
    }

    @Override
    public double calcularConsumo() {
        return 5 - (capacidadeCarga / 1000);
    }
}
