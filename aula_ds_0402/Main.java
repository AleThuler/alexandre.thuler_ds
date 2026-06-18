public class Main {
    public static void main(String[] args) {
        // As linhas que sairem vermelhas são os métodos da Calculadora
        // Já as azuis são os métodos de algum objeto da classe SalaDeAula
        // ("métodos do objeto da classe" eu não sei como explico essa frase para alguém que não está no curso...)

        System.out.println("\u001B[4mAqui podemos criar objetos da Calculadorea e da SalaDeAula!\u001B[0m \n");

        Calculadora calculadora_3000 = new Calculadora();

        // A calculadora só aceita dois parametros... :(
        System.out.println(calculadora_3000.somarValores(0.1, 0.2));
        System.out.println(calculadora_3000.multiplicarValores(9,6));
        System.out.println(calculadora_3000.dividirValores(6, 0));
        System.out.println(calculadora_3000.subtrairValores(800, 1000));

        // Agora vamos usar a classe SalaDeAula
        SalaDeAula salaDs = new SalaDeAula(1, "Banco de dados", "Davi");
        salaDs.mostrarDados();

        salaDs.alterarProfessor("Henrique");
        salaDs.alterarMateria("Desenvolvimento de sistemas");
        salaDs.mostrarDados();

        // Agora vamos criar outro objeto que é a sala de gastro
        SalaDeAula salaGastronomia = new SalaDeAula(2, "Matemática", "Broti");

        salaGastronomia.alterarId(3);
        salaGastronomia.mostrarDados();

        // Não gosto de gastro, vamos apagar eles :)
        salaGastronomia.resetarTudo();
        salaGastronomia.mostrarDados();

    }
}