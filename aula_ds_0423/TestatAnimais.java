public class TestatAnimais {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 1.50f, 4, "Amarelo", "Terra", 2f);
        Peixe tubarao = new Peixe("Tubarão", 3f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 1.80f, 4, "Vermelho", "Terra", 0.5f, "Mel");

        tubarao.getAmbiente();
        //Vamos mudar o habitat do tubarão, alguns, como o touro, consegue viver em águas doces
        tubarao.setAmbiente("Rio");

        camelo.dados();
        tubarao.dadosPeixe();
        ursoCanada.dadosMamifero();
    }
}