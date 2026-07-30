public class Main {
    public static void main(String[] args) {

        //Aqui temos a instâcia do Medico, logo, um objeto
        Pessoa joao = new Pessoa("João", 34);

        //Aqui temos a instância de um Cirurgião
        Medico Pablo = new Medico(2, "Pablo", 48);
    }
}

class Pessoa {
    //Essas coisas que definem uma pessoa
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Medico extends Pessoa implements Cirurgia{
    //Aqui temos algo que um médico tem
    public int diploma;

    public Medico(int diploma, String nome, int idade) {
        super(nome, idade);
        this.diploma = diploma;
    }

    //Esse é um método do Médico. Isso mostra que o Médico FAZ isso
    public int getDiploma() {
        return diploma;
    }

    //Outro método.
    public void criarAtestado(){
        System.out.println("Criando um atestado para você");
    }

    /*
    Aqui é um método da interface Cirurgia que o Medico implementou
    Como o médico implementou a interface, ele obrigatoriamente precisa saber fazer esse método
    Então, para ele poder fazer um transplante, ele precisa TER O TÍTULO(implementar) a Cirurgia             */
    @Override
    public void fazerTransplante() {
        System.out.println("Realizando o transplante");
    }
}

interface Cirurgia {
    void fazerTransplante();
}
