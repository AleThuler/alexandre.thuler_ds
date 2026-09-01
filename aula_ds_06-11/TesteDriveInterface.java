package java_interface;

public class TesteDriveInterface {
	public static void main(String args[]) {
		Enfermeiro Samira = new Enfermeiro("Samira", "000000000-00", 62, "USP", "noturno",  5000.00);
		Medico drMario = new Medico("Mario", "000000000-01", 53, "UFRJ", "Integral", 7, 10600.80);
		
		System.out.println(Samira.calcularSalario(Samira.getSalarioBase()));
		System.out.println(drMario.calcularSalario(drMario.getSalarioBase()));
	}
}
