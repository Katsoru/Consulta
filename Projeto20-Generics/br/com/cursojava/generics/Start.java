package br.com.cursojava.generics;

public class Start {
	public static void main(String[] args) {
		Casal<Cachorro> casal1 = new Casal<Cachorro>();
		casal1.setMarido(new Cachorro("Rex", "Pastor Alemão"));
		casal1.setMulher(new Cachorro("July", "Boxer"));

		Casal<Gato> casal2 = new Casal<Gato>();
		casal2.setMarido(new Gato("Nino", Cor.AMARELO));
		casal2.setMulher(new Gato("Susie", Cor.BRANCO));

		Casal<Pessoa> casal3 = new Casal<Pessoa>();
		casal3.setMarido(new Pessoa("João", 26));
		casal3.setMulher(new Pessoa("Maria", 22));

		System.out.printf(" Casal de cachorro: \n Marido: %s - %s \n Mulher: %s - %s \n\n",
						casal1.getMarido().getNome(), casal1.getMarido().getRaca(), 
						casal1.getMulher().getNome(), casal1.getMulher().getRaca());

		System.out.printf(" Casal de gatos: \n Marido: %s - %s \n Mulher: %s - %s \n\n",
						casal2.getMarido().getNome(), casal2.getMarido().getCor().getNomePt(),
						casal2.getMulher().getNome(), casal2.getMulher().getCor().getNomePt());

		System.out.printf(" Casal de pessoas: \n Marido: %s - %d \n Mulher: %s - %d \n\n",
						casal3.getMarido().getNome(), casal3.getMarido().getIdade(), 
						casal3.getMulher().getNome(),casal3.getMulher().getIdade());

	}
}
