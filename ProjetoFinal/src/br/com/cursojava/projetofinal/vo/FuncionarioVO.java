package br.com.cursojava.projetofinal.vo;

public class FuncionarioVO {
	String nomefunc = null;
	double salario;
	int idCargo;

	public String getNomefunc() {
		return nomefunc;
	}

	public void setNomefunc(String nomefunc) {
		this.nomefunc = nomefunc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
}