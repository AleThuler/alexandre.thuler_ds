import java.util.Scanner;
public class calculadora_vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] historico = new double[10];

        int indice = 0;
        boolean rodando = true;
        double resposta;

        while (rodando) {
            
            System.out.println("Digite o primerio valor:");
            double primeiro_valor = scanner.nextDouble();
            
            System.out.println("Digite o segundo valor:");
            double segundo_valor = scanner.nextDouble();
            
            System.out.println("Qual será o operação?\n 1) Adição \n 2) Subtração \n 3) Multiplicação \n 4) Divisão");
            int metodo = scanner.nextInt();
            
            switch (metodo) {
                case 1:
                    resposta = primeiro_valor + segundo_valor;
                    System.out.println("O valor da soma foi: " + resposta);
                    historico[indice] = resposta;
                    break;
                    
                case 2:
                    resposta = primeiro_valor - segundo_valor;
                    System.out.println("O valor da subtração foi: " + resposta);
                    historico[indice] = resposta;
                    break;
                        
                case 3:
                    resposta = primeiro_valor * segundo_valor;
                    System.out.println("O valor da multiplicação foi: " + resposta);
                    historico[indice] = resposta;
                    break;
                            
                case 4:
                    resposta = primeiro_valor / segundo_valor;
                    System.out.println("O valor da divisão foi: " + resposta);
                    historico[indice] = resposta;
                    break;
                                
                default:
                    System.out.println("Operação errada digitada");
                    break;
                };

//                System.out.println("Você quer continuar?\n 1 -> Sim\n 2 -> Não");
//                int escolha = scanner.nextInt();
//                if (escolha == 1) {
//                    continue;
//                } else{System.out.println("Tchau!");rodando = false;};

                System.out.println(indice);
                if (indice >= 9) {
                    indice = 0;
                } else {indice++;}
                

                System.out.println("Deseja consultar o historico?");
                String consultar_historico = scanner.next();

                if (consultar_historico.equalsIgnoreCase("sim") || consultar_historico.equalsIgnoreCase("s")){
                    System.out.println("Qual das 10 ultimas você deseja consultar?");
                    int local = scanner.nextInt();
                    System.out.println(historico[local]);
                }
            }
        scanner.close();
    }
}
