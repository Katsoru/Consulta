package br.com.cursojava.enumeracao;

public class ExercicioEnum {
	public static void main(String[] args) {
		Estado[] array = Estado.values();
		
		for(Estado e : array){
			System.out.printf("A capital de %s � %s\n", e.getNomeExtenso(), e.getCapital() );
		}
		/*
		for(int i = 0; i < array.length; i++) {
		//	System.out.printf("A capital de %s � %s\n", array[i].getNomeExtenso(), array[i].getCapital());
		
			System.out.println("A capital de " + array[i].getNomeExtenso() + " � " + array[i].getCapital());
		}
		*/
		
		
	}
}
