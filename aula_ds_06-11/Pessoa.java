package java_interface;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	
	public Pessoa(String nome, String cpf, int idade) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
	}
	
	public void exibirInformacoes() {
		System.out.printf("Nome: %s%n", getNome());
		System.out.printf("CPF: %s%n", getCpf());
		System.out.printf("Idade: %d%n", getIdade());
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
