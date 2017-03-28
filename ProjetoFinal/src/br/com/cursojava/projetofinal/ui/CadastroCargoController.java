package br.com.cursojava.projetofinal.ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.vo.CargoVO;

public class CadastroCargoController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtCargo;

	@FXML
	private Label lblMensagem;

	@FXML
	void salvarOnAction(ActionEvent event) {

		try {
			/* Preenche o VO */
			CargoVO cargo = new CargoVO();
			cargo.setNome(txtCargo.getText());

			/* Grava na base de dados */
			CargoDAO dao = new CargoDAO();
			dao.save(cargo);
			lblMensagem.setText("Cargo cadastrado com sucesso");
			txtCargo.clear();
			txtCargo.requestFocus();

		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}

	}

	@FXML
	void limparOnAction(ActionEvent event) {
		txtCargo.clear();
		lblMensagem.setText("");
		txtCargo.requestFocus();
	}

	@FXML
	void initialize() {

	}
}