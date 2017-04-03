package br.impacta.scanner;

import java.util.Scanner;

public class Exscanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		
		System.out.println("Olá" + nome);
		sc.close();
	}
}
