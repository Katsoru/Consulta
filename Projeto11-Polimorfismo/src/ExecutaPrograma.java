public class ExecutaPrograma {
	public static void main(String[] args) {
		int contquad = 0;
		FiguraGeometrica[] listaFiguras = { new Quadrado(4),
				new Triangulo(3, 4), new Quadrado(6.5), new Circulo(2),
				new Triangulo(6.5, 10) };

		for (FiguraGeometrica fig : listaFiguras) {
			System.out.println("Area da figura: " + fig.getArea());
			if (fig instanceof Quadrado) {
				contquad++;
			}
		}
		System.out.println("Total de quadrados: " + contquad);
	}

}
