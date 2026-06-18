package java_interface;

public class Medico extends ProfissionalSaude implements Atendimento {
	private String especialidade;
	private int numeroPlantao;
	private double salarioBase;
	
	public Medico(String nome, String cpf, int idade, String registroProfissional, String especialidade, int numeroPlantao, double salarioBase) {
		super(nome, cpf, idade, registroProfissional);
		this.especialidade = especialidade;
		this.numeroPlantao = numeroPlantao;
		this.salarioBase = salarioBase;
	}

	@Override
	public void realizarAtendimento() {
		return;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getNumeroPlantao() {
		return numeroPlantao;
	}
	public void setNumeroPlantao(int numeroPlantao) {
		this.numeroPlantao = numeroPlantao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("Especialidade: %d%n", getEspecialidade());
		System.out.printf("Número de plantões: %d%n", getNumeroPlantao());
		System.out.printf("Salário base: %d%n", getSalarioBase());
	}
	
	@Override
	public double calcularSalario(double getSalarioBase) {
		return getSalarioBase + (500 * getNumeroPlantao());
	}
}
