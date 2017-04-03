public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;

	public String getNome() {
		return nome;
	}
	public void setNome(String capNome) {
		nome=capNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String capSobrenome) {
		sobrenome=capSobrenome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String capCargo) {
		cargo=capCargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double capSalario){
		salario=capSalario;
	}
}
