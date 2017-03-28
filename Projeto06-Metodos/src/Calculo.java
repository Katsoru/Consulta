public class Calculo {
	public static void main(String[] args) {
		int result;
		
		result=soma(23,25);
		System.out.println(result);
		
		result=soma(23,25,26,85);
		System.out.println(result);
		
		result=soma(23,25,632,662,814,230);
		System.out.println(result);
	}

	static int soma(int val1,int val2, int val3, int val4, int val5, int val6){
		int resultado=val1+val2+val3+val4+val5+val6;
		return resultado;
	}
	
	static int soma(int val1, int val2, int val3, int val4){
		int resultado=soma(val1, val2, val3, val4, 0, 0);
		return resultado;
	}
	
	static int soma(int val1, int val2){
		int resultado=soma(val1, val2, 0, 0, 0, 0);
		return resultado;
	}
}
