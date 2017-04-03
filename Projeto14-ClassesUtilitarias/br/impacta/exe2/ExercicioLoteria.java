package br.impacta.exe2;

public class ExercicioLoteria {
	public static void main(String[] args) {
		int i=1;
		StringBuilder fim = null;
		fim = new StringBuilder("");
		double sorteio = Math.random();
		while(i<=6){
			fim.append(sorteio*60+1 + " ");
			i++;
		}
		System.out.println(fim);
	}
}
