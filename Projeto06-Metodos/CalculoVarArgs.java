public class CalculoVarArgs {
	public static void main(String[] args) {
		int result=soma(16,26);
		System.out.println(result);
		result=soma(415,362,814,54);
		System.out.println(result);
		result=soma(125,632,5487,235,9845,878);
		System.out.println(result);
	}
	
	static int soma(int... Valor){
		int resultado = 0,cont;
		for(cont=0;cont<Valor.length;cont++){
			resultado=resultado+Valor[cont];
		}
		return resultado;
	}
}