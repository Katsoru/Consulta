public class Cap6_Lab1 {
	public static void main(String[] args) {

		Funcionario[] func = {
				new Funcionario("João","Roberto","Programador",4200.15),
				new Funcionario("Rodrigo", "Silva", "Gari", 1550.00)
		};
		
		for (Funcionario f: func){
		System.out.println(f.getDados());
		}
	}
}
