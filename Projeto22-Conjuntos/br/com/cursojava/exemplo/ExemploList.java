package br.com.cursojava.exemplo;

import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.model.Cliente;

public class ExemploList {

	public static void main(String[] args) {

		List<Cliente> lista = new ArrayList<>();

		lista.add(new Cliente("1","João", "Rua X, 35", "96543-2763"));
		lista.add(new Cliente("3","Manuel", "Av. Lagos", "4532-7125"));
		lista.add(new Cliente("7","Joaquim", "Rua Borges", "7945-0257"));
		lista.add(1, new Cliente("8","Maria", "Estrada B, 345", "7801-2068"));

//		Cliente c = lista.get(1);
//		System.out.println("Cliente 1: " + c.getNome());

		lista.remove(2);
		
		for(Cliente c : lista){
			System.out.println(c.getNome());
		}
		
		System.out.println("Total de Clientes: " + lista.size());
	}
	// public static void gravarClientes(ArrayList<Cliente> lista) {
	//
	//
	//
	// }
}
