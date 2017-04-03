package br.impacta.data;

import java.util.Calendar;

public class ExercicioDataNatal {
	public static void main(String[] args) {
		Calendar natal = Calendar.getInstance();
		Calendar hoje = Calendar.getInstance();
		
		natal.set(Calendar.YEAR,11,25);
		
		int dianatal = natal.get(natal.DAY_OF_YEAR);
		int diahoje = hoje.get(Calendar.DAY_OF_YEAR);
		int result = dianatal-(diahoje+1);
		
		System.out.println(dianatal);
		System.out.println(diahoje);
		
		
		
		System.out.println("Faltam " + result + " Dias para o Natal");
		
		
	}
}
