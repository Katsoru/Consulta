package br.com.impacta.cursojava.exercicio;

import br.com.impacta.cursojava.funcional.DoubleArrayUtils;

public class DescontoSalarial {
	public static void main(String[] args) {
		double[] salariosBrutos = { 1350, 4320.15, 8235.25, 2500.55, 1830,
				850.26, 3614.29, 12500 };
		double[] salariosLiquidos = DoubleArrayUtils.transformaValores(
				salariosBrutos, x -> x * 0.9);

		DoubleArrayUtils.processaValores(salariosLiquidos,
				x -> System.out.println(x));
	}
}
