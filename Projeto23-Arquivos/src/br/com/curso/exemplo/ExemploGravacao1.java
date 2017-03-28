package br.com.curso.exemplo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExemploGravacao1 {
	public static void main(String[] args) {
		
		Writer saida;
		try {
			saida = new FileWriter("C:\\Users\\sa0330\\Desktop\\novo.txt");
			saida.write("Palmeiras não tem mundial");
			saida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			}
		}
}
