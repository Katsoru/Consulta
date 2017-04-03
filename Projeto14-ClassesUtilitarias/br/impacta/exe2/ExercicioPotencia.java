package br.impacta.exe2;

public class ExercicioPotencia {
	public static void main(String[] args) {
		int i=1, j=1;
		while(i<=10){
			j=1;
			while(j<=10){
				System.out.println(i + " elevado a " + j + " = " + Math.pow(i, j));
				j++;
			}
			i++;
		}
		
	}
}
