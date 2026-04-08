public class Calculadora {
    String codigo_vermelho = "\u001B[31m";
    String codigo_final = "\u001B[0m";
    String resultado;

    String somarValores(double primeiroValor, double segundoValor){
        resultado = String.format("%s %f %s", codigo_vermelho, (primeiroValor + segundoValor), codigo_final);
        return resultado;
    }

    String subtrairValores(double primeiroValor, double segundoValor){
        resultado = String.format("%s %f %s", codigo_vermelho, (primeiroValor - segundoValor), codigo_final);
        return resultado;
    }

    String multiplicarValores(double primeiroValor, double segundoValor){
        resultado = String.format("%s %f %s", codigo_vermelho, (primeiroValor * segundoValor), codigo_final);
        return resultado;
    }

    String dividirValores(double primeiroValor, double segundoValor){
        if (segundoValor == 0){
            System.out.print(codigo_vermelho + " Ops, você não vai dividir por zero :P " + codigo_final);
            return "";
        } else{
            resultado = String.format("%s %f %s", codigo_vermelho, (primeiroValor / segundoValor), codigo_final);
            return resultado;
        }
    }
}
