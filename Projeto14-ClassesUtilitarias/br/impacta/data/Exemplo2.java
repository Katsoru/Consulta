package br.impacta.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exemplo2 {
	public static void main(String[] args) {
		/* Captura a data de hoje no calend�rio do sistema */
		Calendar c = Calendar.getInstance();

		/* Avan�a 90 dias */
		c.add(Calendar.DAY_OF_MONTH, 300);

		/* Converte de Calendar para Date */
		Date d = c.getTime();

		/* Cria uma m�scara para a data */
		SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");

		/* Exibe a data no formato desejado */
		System.out.println("Daqui a 90 dias ser� " + mascara.format(d));
	}
}
