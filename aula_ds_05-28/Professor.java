public class Professor extends Pessoa{

	private double salario;
	private String disciplina;
	
	public Professor(String nome, int idade, String matricula, double salario, String disciplina) {
		super(nome, idade, matricula);
		this.salario = salario;
		this.disciplina = disciplina;
	}

	@Override
	public double calcularBonus() {
		return this.salario + (this.salario * 0.15);
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Matricula: " + super.getMatricula());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("Salario: " + this.salario);
		System.out.println("Disciplina: " + this.disciplina);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
