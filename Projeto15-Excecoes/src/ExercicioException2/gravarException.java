package ExercicioException2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gravarException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um texto");
		String texto = sc.nextLine();
		PrintWriter writer;
		try {
			writer = new PrintWriter("C:\\Users\\sa0330\\Desktop\\doc1.txt");
			writer.println(texto);
			writer.close();
			System.out.println("Informações gravadas com sucesso!");
		} catch (FileNotFoundException fnfe) {
			System.out.println("Falha ao gravar as informações digitadas");
		}
		sc.close();
	}
}
