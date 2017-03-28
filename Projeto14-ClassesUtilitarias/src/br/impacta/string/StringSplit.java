package br.impacta.string;

public class StringSplit {
	public static void main(String[] args) {
	
		String frase = "Manuel Silva Antunes Oliveira";
		String[] palavras = frase.split(" ");
		for(String p : palavras){
		System.out.println(p);
		}
		}
}
