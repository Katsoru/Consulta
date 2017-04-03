package br.com.cursojava.exercicio;

import java.util.LinkedList;
import java.util.List;

import br.com.cursojava.controller.FuncionarioController;
import br.com.cursojava.model.Funcionario;
import javafx.stage.Stage;

public class ExercicioList extends javafx.application.Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage arg0) throws Exception {
		List<Funcionario> listaFunc = new LinkedList<>();

		Funcionario func = FuncionarioController.showInputFuncionario();
		double st = 0, idade = 0;

		while (func != null) {
			listaFunc.add(func);
			func = FuncionarioController.showInputFuncionario();
		}
		System.out.printf("Nome             Idade  Salário\n");
		System.out.printf("==============   =====  =======\n");
		for (Funcionario lista : listaFunc) {
			System.out.printf("%-15s %5d   R$%,9.2f\n", lista.getNome(),
					lista.getIdade(), lista.getSalario());
			st += lista.getSalario();
			idade += lista.getIdade();
		}
		System.out.println();
		System.out.printf("Total de funcionários\t: %d\n", listaFunc.size());
		System.out.printf("Total de salários\t: R$%,9+.2f\n", st);
		System.out.printf("Média de idade\t\t: %.1f\n",
				idade / listaFunc.size());
	}
}
