import java.util.Scanner;
public class vetor_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int indice = 0;

        double[] temperaturas = new double[10];
        boolean lendo = true;

        System.out.println("Criado o vetor\nColoque 10 valores");

        while(lendo){
            double graus = scanner.nextDouble();
            temperaturas[indice] = graus;
            indice++;
            if (indice == 10){
                    lendo = false;
                    System.out.println("Todos os valores atribuidos!");
                    indice--;
            } 
            else{System.out.println("Valor atribuido com sucesso!");}
        }


        while (indice >= 0) {
            System.out.println("Valor numero " + indice + ": " + temperaturas[indice]);
            indice--;
            
        }

        scanner.close();
    }
}
