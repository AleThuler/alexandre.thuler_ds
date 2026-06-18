public class Main {
    public static void main(String[] args){
        // Só para avisar, os objetos Carro serão vermelho
        // Os Moto serão verde
        // E os Caminhão é azul
        //Só para ficar mais bonitinho

        Carro sentra = new Carro("Nissa", "Sentra", 2);
        Moto vespa = new Moto("Piaggio", "Vespa", 125);
        Caminhao super460 = new Caminhao("Scania", "Super 460 4x2", 78000);

        sentra.exibirInformacoes();
        vespa.exibirInformacoes();
        super460.exibirInformacoes();
    }
}