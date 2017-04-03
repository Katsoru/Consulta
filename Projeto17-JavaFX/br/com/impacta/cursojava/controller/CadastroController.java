package br.com.impacta.cursojava.controller;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastroController {

	@FXML
	private TextField txt_aluno;

	@FXML
	private ToggleGroup periodo;

	@FXML
	private TextField txt_curso;

	@FXML
	private ToggleGroup dia;

	@FXML
	private Label lbl_mensagem;

	@FXML
	void initialize() {
		String mensagem = "São exatamente " + new Date().toString();

		lbl_mensagem.setText(mensagem);
	}

	@FXML
	void cancelarOnAction(ActionEvent event) {
		lbl_mensagem.setText("");
	}

	@FXML
	void okOnAction(ActionEvent event) {
		String mensagem = "Olá, " + txt_aluno.getText() + " do curso de " + txt_curso.getText();
		lbl_mensagem.setText(mensagem);
	}

}
