public class ExecutaPrograma {
	public static void main(String[] args) {

		Calculadora[] tiposCalc = {
				new CalculadoraArquivo(),
				new CalculadoraPopup(),
				new CalculadoraTela()
		};
		for (Calculadora cal : tiposCalc){
			cal.exibeMultiplicacao(27, 13);
		}
	}
}
