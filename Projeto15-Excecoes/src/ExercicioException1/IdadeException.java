package ExercicioException1;

import java.util.Calendar;
import java.util.Scanner;

public class IdadeException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade = 0, anonasc = 0;
		System.out.println("Entre com a sua data de Nascimento: ");
		try {
			anonasc = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException erro) {
			System.out.println("Valor digitado inválido");
			System.out.println(erro);
			sc.close();
			return;
		}
		if (anonasc <= 1900 || anonasc > 2017) {
			System.out.println("Valor digitado inválido");
			sc.close();
			return;
		}

		Calendar agora = Calendar.getInstance();
		int anoAtual = agora.get(Calendar.YEAR);
		
		idade = anoAtual - anonasc;
		System.out.println("Você têm " + idade + " anos");
		sc.close();
	}
}
