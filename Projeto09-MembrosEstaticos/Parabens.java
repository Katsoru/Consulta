public class Parabens {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Digite nome e idade");
			return;
		}
		String nome = args[0];
		String idade = args[1];
		System.out.println("Parab�ns " + nome + " pelos seus " + idade
				+ " anos");
	}
}
