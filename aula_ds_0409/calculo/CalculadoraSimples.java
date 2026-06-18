package calculo;

public class CalculadoraSimples{
    public int somarValores(int primeiroValor, int segundoValor){
        return primeiroValor + segundoValor;
    }

    public int subitrairValores(int primeiroValor, int segundoValor){
        return primeiroValor - segundoValor;
    }

    public int multiplicarValores(int primeiroValor, int segundoValor){
        return primeiroValor * segundoValor;
    }

    public int dividirValores(int primeiroValor, int segundoValor){
        if (segundoValor == 0){
            System.out.println("Ops, não se pode dividir por zero!");
            return 0;
        } else { return primeiroValor / segundoValor; }
    }

}
