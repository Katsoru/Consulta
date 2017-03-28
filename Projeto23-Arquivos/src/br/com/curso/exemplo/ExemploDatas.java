package br.com.curso.exemplo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDatas {
	public static void main(String[] args) {
		File arquivo = new File(
				"X:\\S�bado\\Paulista03\\Instrutor\\Capitulo15\\fotos\\urso.jpg");
		long dataLong = arquivo.lastModified();

		Date data = new Date(dataLong);

		SimpleDateFormat mascara = new SimpleDateFormat("HH:mm:ss");

		System.out.println("Data da ultima modifica��o: "
				+ mascara.format(data));
	}
}
