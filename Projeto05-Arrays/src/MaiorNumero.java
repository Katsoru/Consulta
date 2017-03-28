public class MaiorNumero {
	public static void main(String[] args) {

		int[] lista = { 56, 128, 632, 9000, 41, 419 };

		if (lista.length == 0) {
			System.out.println(0);
			System.exit(0);
		}
		
		int maior = lista[0];
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > maior) {
				maior = lista[i];;
			}
		}
		System.out.println("O maior valor é o " + maior);
	}
}
