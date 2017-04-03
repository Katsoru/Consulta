package br.com.cursojava.exemplo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import br.com.cursojava.model.Cliente;

public class ExemploTreeSet2 {
	public static void main(String[] args) {
		
		SortedSet<Cliente> set = new TreeSet<>(Comparator.comparing(c -> c.getTelefone()));
		
		set.add(new Cliente("2","João", "Rua X, 35", "96543-2763"));
		set.add(new Cliente("5","Manuel", "Av. Lagos", "4532-7125"));
		set.add(new Cliente("8","Joaquim", "Rua Borges", "7945-0257"));
		set.add(new Cliente("9","Maria", "Estrada B, 345", "7801-2068"));
		
		set.forEach(c -> System.out.println("Nome: " + c.getNome() + " | Endereço: " + c.getEndereco() + " | Telefone: " + c.getTelefone()));
	}
}
