public class Cap6_Lab1 {
	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		f1.setSobrenome("Pedro");
		f1.setCargo("Programador");
		f1.setSalario(4200.15);

		/*
		 * f1.nome="João"; f1.sobrenome="Pedro"; f1.cargo="Programador";
		 * f1.salario=4200.15;
		 */

		System.out.println(f1.getNome() + " " + f1.getSobrenome() + " - "
				+ f1.getCargo() + " - " + f1.getSalario());

		Funcionario f2 = new Funcionario();
		f2.setNome("Henrique");
		f2.setSobrenome("Oliveira");
		f2.setCargo("Gari");
		f2.setSalario(1500.00);

		System.out.println(f2.getNome() + " " + f2.getSobrenome() + " - "
				+ f2.getCargo() + " - " + f2.getSalario());
	}
}
