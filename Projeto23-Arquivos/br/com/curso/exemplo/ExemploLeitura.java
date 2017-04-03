package br.com.curso.exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {
	public static void main(String[] args) {

		try {
			BufferedReader entrada = new BufferedReader(new FileReader(
					"C:\\Users\\sa0330\\Desktop\\Gabriel Alves\\hu3.txt"));

			// String linha1 = ;
			while (entrada.ready()) {
				System.out.println(entrada.readLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
