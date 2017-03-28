package br.com.cursojava.enumeracao;

public enum Estado {
	SAOPAULO("São Paulo", "SP", "São Paulo"), MINASGERAIS("Minas Gerais", "MG",
			"Belo Horizonte"), RIODEJANEIRO("Rio de Janeiro", "RJ",
			"Rio de Janeiro"), ESPIRITOSANTO("Espirito Santo", "ES", "Vitória");

	private String nomeExtenso;
	private String sigla;
	private String capital;

	private Estado(String nomeExtenso, String sigla, String capital) {
		this.nomeExtenso=nomeExtenso;
		this.sigla = sigla;
		this.capital = capital;
	}

	public String getNomeExtenso() {
		return nomeExtenso;
	}

	public String getSigla() {
		return sigla;
	}

	public String getCapital() {
		return capital;
	}


	
}
