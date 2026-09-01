public abstract class Pessoa {
	private String nome;
	private int idade;
	private String matricula;
	
	public Pessoa(String nome, int idade, String matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Idade: " + idade);
	}
	
	public abstract double calcularBonus();
}
