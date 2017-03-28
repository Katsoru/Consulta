public class Laboratorio1Pag110 {
	public static void main(String[] args) {
		int numeros = 4, divisoes = 0;

		for (int i = 1; i <= numeros; i++) {
			if (numeros % i == 0) {
				divisoes++;
			}
		}
		if (divisoes <= 2) {
			System.out.println("O numero " + numeros + " é primo");
		} else {
			System.out.println("O numero " + numeros + " não é primo");
		}
	}
}
