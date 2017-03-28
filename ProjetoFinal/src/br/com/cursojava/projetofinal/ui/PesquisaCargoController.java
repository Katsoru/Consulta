package br.com.cursojava.projetofinal.ui;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.vo.CargoVO;

public class PesquisaCargoController {

	@FXML
	private TableView<CargoVO> tabCargo;

	@FXML
	private TableColumn<CargoVO, Integer> colId;

	@FXML
	private TableColumn<CargoVO, String> colNome;

	@FXML
	private TextField txtCargo;

	@FXML
	private Label lblMensagem;

	public void initialize() {

		colId.setCellValueFactory(new PropertyValueFactory<>("id"));

		colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

	}

	@FXML
	void procurarOnAction(ActionEvent event) {
		
		CargoDAO dao = new CargoDAO();
		List<CargoVO> lista = null;
		
		try {
			lista = dao.findByName(txtCargo.getText());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tabCargo.getItems().clear();
		tabCargo.getItems().addAll(lista);
	}

}
