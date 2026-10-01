package atividade_4;

public class ArgumentoIlegalException extends RuntimeException {
    public ArgumentoIlegalException() {
        super("Argumento Inválido");
    }

    public ArgumentoIlegalException(String message) {
        super(message);
    }
}
