public class Main {
	public static void main(String[] args) {
	
		Aluno Joao = new Aluno("João", 17, "00000123", 8, 9);
		Aluno Alfredo = new Aluno("Alfredo", 16, "23498912", 5, 2);
		
		Professor Bernardo = new Professor("Bernardo", 23, "3478247", 3200.00, "Geografia");
		
		System.out.println("Vamos os dados do João?");
		Joao.exibirDados();
		System.out.println(Joao.calcularMedia());
		Joao.verificarSituacao();
		
		System.out.println("\nAgora vamos ver a média Alfredo?");
		System.out.println(Alfredo.calcularMedia());
		Alfredo.verificarSituacao();
		// ó não, ele está reprovado, e se a gente mudar a nota dele??
		Alfredo.setNota2(7);
		Alfredo.verificarSituacao();
		
		System.out.println("\nE o nosso professor?");
		Bernardo.exibirDados();
		System.out.println("O salario dele com o bonus seria: " + Bernardo.calcularBonus());
		
		//Bem, todos os setter e getter existem e funcionam, então não vou ficar usando eles
	}

}
