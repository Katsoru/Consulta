package br.com.curso.exemplo;

import java.io.File;

public class ExemploListFiles {
	public static void main(String[] args) {
		File pasta = new File("X:\\Sábado\\Paulista03\\Instrutor");
		File[] arquivoArray = pasta.listFiles();
		
		System.out.println(arquivoArray.length + " itens encontrados");
		for (File arquivo : arquivoArray) {
			System.out.println(arquivo.getName());
		}
	}
}
