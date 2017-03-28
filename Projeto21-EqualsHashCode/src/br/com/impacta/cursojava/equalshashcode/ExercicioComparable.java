package br.com.impacta.cursojava.equalshashcode;

import java.util.Arrays;

public class ExercicioComparable {
	public static void main(String[] args) {
		Produto p1 = new Produto(805, "Leite Integral", 1.70);
		Produto p2 = new Produto(930, "Caf� em p�", 4.80);
		Produto p3 = new Produto(110, "Manteiga", 2.80);


		Produto[] array = { p1, p2, p3 };
		Arrays.sort(array);

		for(Produto p: array){
			System.out.printf("%d - %s (%,.2f)\n", p.getCodigo(),p.getDescricao(),p.getPreco());
		}
	}
}
