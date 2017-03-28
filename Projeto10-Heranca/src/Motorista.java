public class Motorista extends Funcionario {
	String placaAutomovel;
	String cnh;

	public Motorista(String nome, String sobrenome, String cargo,
			double salario, String placaAutomovel, String cnh) {
		super(nome, sobrenome, cargo, salario);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cargo = cargo;
		this.salario = salario;
		this.placaAutomovel = placaAutomovel;
		this.cnh = cnh;
	}

	public String getPlacaAutomovel() {
		return placaAutomovel;
	}

	public void setPlacaAutomovel(String placaAutomovel) {
		this.placaAutomovel = placaAutomovel;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String toString() {
		return super.getDados() + " - Placa " + placaAutomovel + " - CNH "
				+ cnh;
	}

}
