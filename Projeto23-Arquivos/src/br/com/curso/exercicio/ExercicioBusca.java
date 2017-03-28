package br.com.curso.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioBusca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader entrada = null;
		String linha;
		int numlinha = 0, quantidade = 0;

		System.out.print("Entre o texto que deseja procurar: ");
		String texto = sc.nextLine();
		System.out.println();

		try {
			entrada = new BufferedReader(
					new FileReader(
							"C:\\Users\\sa0330\\Desktop\\Gabriel Alves\\Capitulo15\\lusiadas.txt"));
			while (entrada.ready()) {
				numlinha += 1;
				linha = entrada.readLine();
				/*
				 * if (linha.contains(texto)){ System.out.println(numlinha +
				 * ": " + linha); }
				 */
				if (linha.indexOf(texto) != -1) {
					System.out.println(numlinha + ": " + linha);
					quantidade++;
				}
			}

		} catch (IOException e) {
			try {
				entrada.close();
				e.printStackTrace();
			} catch (Exception e2) {
			}
		} finally {
			System.out.println();
			if (quantidade > 1) {
				System.out.println(quantidade + " Ocorrencias da palavra '"
						+ texto + "'");
				System.out.println("Busca concluida com sucesso.");

			} else {
				System.out
						.println("Não foi encontrado ocorrencias da palavra '"
								+ texto + "'");
			}
		}

	}
}
