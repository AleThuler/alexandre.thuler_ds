package atividade_3;

public class MuitoVelhoException extends RuntimeException {

    public MuitoVelhoException() {
        super("Idade inválida!");
    }

    public MuitoVelhoException(String message) {
        super(message);
    }

}
