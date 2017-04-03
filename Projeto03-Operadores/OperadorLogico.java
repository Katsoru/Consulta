
public class OperadorLogico {

	public static void main(String[] args) {
		
		int idade = 25;
		char sexo = 'M';
		
		//boolean result = idade >= 18 || sexo == 'M';		
		boolean result = !(sexo=='M');
		System.out.println(result);
		
	}
}
