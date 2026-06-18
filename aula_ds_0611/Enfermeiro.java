package java_interface;

public class Enfermeiro extends ProfissionalSaude implements Atendimento {
	private String turno;
	private double salarioBase;
	
	
	public Enfermeiro(String nome, String cpf, int idade, String registroProfissional, String turno, double salarioBase) {
		super(nome, cpf, idade, registroProfissional);
		this.turno = turno;
		this.salarioBase = salarioBase;
		
	}

	@Override
	public void realizarAtendimento() {
		return;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioaBase) {
		this.salarioBase = salarioaBase;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.printf("Turno: %d%n", getTurno());
		System.out.printf("Salário base: %d%n", getSalarioBase());
	}
	
	@Override
	public double calcularSalario(double SalarioBase) {
		double calculo;
		if (this.turno.equals("noturno")) {
			return salarioBase + (salarioBase * 0.2);
		} else {
			return salarioBase;
		}
		
	}
	
}
