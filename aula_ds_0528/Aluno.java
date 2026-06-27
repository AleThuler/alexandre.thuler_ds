public class Aluno extends Pessoa {

	private double nota1;
	private double nota2;
	
	public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
		super(nome, idade, matricula);
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public double calcularBonus() {
		return 0;
	}
	
	public double calcularMedia() {
		return (this.nota1 + this.nota2) / 2;
	}
	
	public void verificarSituacao() {
		if(calcularMedia() >= 6) {
			System.out.println("Aprovado!");
		} else if(calcularMedia() >= 4 && calcularMedia() <= 5.9) {
			System.out.println("Recuperação...");
		} else {
			System.out.println("Reprovado.");
		}
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	

}
