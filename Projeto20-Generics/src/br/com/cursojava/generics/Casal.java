package br.com.cursojava.generics;

public class Casal<R> {
	private R marido;
	private R mulher;

	public R getMarido() {
		return marido;
	}

	public void setMarido(R marido) {
		this.marido = marido;
	}

	public R getMulher() {
		return mulher;
	}

	public void setMulher(R mulher) {
		this.mulher = mulher;
	}

}
