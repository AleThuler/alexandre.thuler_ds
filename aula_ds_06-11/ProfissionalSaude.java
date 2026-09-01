package java_interface;

public abstract class ProfissionalSaude extends Pessoa{
	private String registroProfissional;

	public ProfissionalSaude(String nome, String cpf, int idade, String registroProfissional) {
		super(nome, cpf, idade);
		this.setRegistroProfissional(registroProfissional);
	}
	
	public double calcularSalario(double salario) {
		return salario;
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}
	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
}
