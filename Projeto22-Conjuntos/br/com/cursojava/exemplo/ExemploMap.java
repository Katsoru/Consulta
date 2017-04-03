package br.com.cursojava.exemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.cursojava.model.Cliente;

public class ExemploMap {

	public static void main(String[] args) {

		Map<String, Cliente> mapa = new HashMap<>();
		mapa.put("897822-9", new Cliente("897822-9", "Manuel", "Rua 5", "123"));
		mapa.put("76836-7", new Cliente("76836-7", "Ricardo",
				"Av. Central, 23", "456"));
		mapa.put("3945651-1", new Cliente("3945651-1", "Joaquim", "Rua 35",
				"789"));
		mapa.put("1874309-5", new Cliente("1874309-5", "Maria", "Alameda XV",
				"159"));

		// mapa.remove("76836-7");
		//
		// Cliente c = mapa.get("76836-7");
		//
		// if ( c != null){
		// System.out.println(mapa.get("76836-7").getEndereco());
		// } else {
		// System.out.println("Cliente não encontrado.");
		// }
		//
		// System.out.println();
		// System.out.println("Itens pesquisados: " + mapa.size();

		/* Varrendo o mapa */
		
		Set<String> chaves = mapa.keySet();
		
		for (String chave : chaves) {
			System.out.println("Chave " + chave + "\t " + mapa.get(chave).getNome());
		}

	}
}
