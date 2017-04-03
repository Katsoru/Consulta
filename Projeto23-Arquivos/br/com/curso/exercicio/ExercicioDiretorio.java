package br.com.curso.exercicio;

import java.io.File;

public class ExercicioDiretorio {
	public static void main(String[] args) {

		File raiz = new File("C:\\Users\\sa0330\\Documents");
		File imagens = new File(raiz,"imagens");
		File musicas = new File(raiz,"mp3");
		File pdf = new File(raiz,"pdf");
		

		imagens.mkdir();
		musicas.mkdir();
		pdf.mkdir();

		File[] listaArquivos = raiz.listFiles();

		for (File arquivo : listaArquivos) {

			if (arquivo.getName().endsWith(".jpg")) {
				File destino = new File(imagens, arquivo.getName());
				arquivo.renameTo(destino);
			} else if (arquivo.getName().endsWith(".mp3")) {
				File destino = new File(musicas, arquivo.getName());
				arquivo.renameTo(destino);
			} else if (arquivo.getName().endsWith(".pdf")) {
				File destino = new File(pdf, arquivo.getName());
				arquivo.renameTo(destino);
			}
		}
	}
}
