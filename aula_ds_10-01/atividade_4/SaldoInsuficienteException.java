package atividade_4;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(){
        super("Saldo Insuficiente");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
