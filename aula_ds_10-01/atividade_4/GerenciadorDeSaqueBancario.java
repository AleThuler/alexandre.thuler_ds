package atividade_4;



public class GerenciadorDeSaqueBancario{


    private int saldoDisponivel = 0;

    public void fazerUmSaque(int quantidadeASacar) throws SaldoInsuficienteException, ArgumentoIlegalException {

        if (quantidadeASacar > saldoDisponivel){
            String mensagemDaException = String.format("Erro: Saldo Insuficiente  < Saldo disponível: %d | Saldo a ser sacado: %d  >", saldoDisponivel, quantidadeASacar);
            throw new SaldoInsuficienteException(mensagemDaException);
        } else if (quantidadeASacar <= 0){
            throw new ArgumentoIlegalException();
        } else {
            saldoDisponivel -= quantidadeASacar;
            System.out.println("Sacado " + quantidadeASacar + " reais");
        }
    }

    public void colocarDinheiro(int quantidadeAColocar){
        saldoDisponivel += quantidadeAColocar;
        System.out.println("Inserido " + quantidadeAColocar + " reais");
    }
}
