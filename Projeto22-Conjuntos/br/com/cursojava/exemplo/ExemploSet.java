package br.com.cursojava.exemplo;

import java.util.HashSet;
import java.util.Set;

import br.com.cursojava.model.Cliente;

public class ExemploSet {
	public static void main(String[] args) {

		Set<Cliente> conjunto = new HashSet<>();

		conjunto.add(new Cliente("2","João", "Rua X, 35", "96543-2763"));
		conjunto.add(new Cliente("3","Manuel", "Av. Lagos", "4532-7125"));
		conjunto.add(new Cliente("5","Joaquim", "Rua Borges", "7945-0257"));
		conjunto.add(new Cliente("9","Maria", "Estrada B, 345", "7801-2068"));

		for (Cliente c : conjunto) {
			System.out.println(c.getNome() +" "+  c.getEndereco());
		}

	}
}
