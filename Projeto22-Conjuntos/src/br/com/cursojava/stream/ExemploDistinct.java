package br.com.cursojava.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

import br.com.cursojava.model.Produto;

public class ExemploDistinct {

	public static void main(String[] args) {

		Collection<Produto> colec = new ArrayList<>();

		colec.add(new Produto(2651, "Sab�o em p�"));
		colec.add(new Produto(1523, "Achocolatado"));
		colec.add(new Produto(8320, "Cerveja em lata"));
		colec.add(new Produto(3211, "Molho de tomate"));
		colec.add(new Produto(134, "Batata"));
		colec.add(new Produto(5986, "Papel Higi�nico"));
		colec.add(new Produto(3274, "Feij�o Carioquinha"));
		colec.add(new Produto(6241, "Queijo Prato"));
		colec.add(new Produto(235, "Carne Mo�da"));
		colec.add(new Produto(720, "Sabonete"));

		// colec.forEach(p -> System.out.println(p.getNome()));

		Stream<Produto> streamColec = colec.stream();

		streamColec
				.skip(5)
				.forEach(p -> System.out.println(
				p.getCodigo() + " - " +p.getNome()));

		System.out.println();
		
	}
}
