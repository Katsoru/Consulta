package br.com.cursojava.projetofinal.ui;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.vo.CargoVO;
import br.com.cursojava.projetofinal.vo.FuncionarioVO;

public class CadastroFuncionarioController {

	private static final DecimalFormat MASCARA_SAL = new DecimalFormat(
			"#,##0.00");

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtNome;

	@FXML
	private ComboBox<CargoVO> cbxCargo;

	@FXML
	private Label lblMensagem;

	@FXML
	private TextField txtSalario;

	public void initialize() {
		try {

			// Obtem a lista de Cargos
			CargoDAO dao = new CargoDAO();
			List<CargoVO> lista = dao.findAll();

			// Adiciona o cargo "fake"
			CargoVO fake = new CargoVO();
			fake.setId(0);
			fake.setNome("");
			cbxCargo.getItems().add(fake);

			// Adiciona os cargos ao combo
			cbxCargo.getItems().addAll(lista);

			// Seleciona o fake
			cbxCargo.getSelectionModel().select(0);

		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	void salvarOnAction(ActionEvent event) {
		// limpa a caixa de texto
		lblMensagem.setText("");
		// verifica se há algo escrito
		if (txtNome.getText().trim().length() == 0) {
			lblMensagem.setText("Nome é Obrigatório");
			return;
		}
		// verifica se há mais de 30 letras
		if (txtNome.getText().length() > 30) {
			lblMensagem.setText("O nome não pode ter mais de 30 caracteres");
			return;
		}
		// coloca o nome no funcionario
		FuncionarioVO funcionario = new FuncionarioVO();
		funcionario.setNomefunc(txtNome.getText());
		// pega o cargo selecionado
		CargoVO cargo = cbxCargo.getSelectionModel().getSelectedItem();
		// verifica se o cargo foi selecionado
		if (cargo == null || cargo.getId() == 0) {
			lblMensagem.setText("Selecione um cargo");
			return;
		}
		// pega o id do cargo selecionado
		funcionario.setIdCargo(cargo.getId());

		// Valida e preenche o salaro
		try {
			double salario = MASCARA_SAL.parse(txtSalario.getText())
					.doubleValue();
			funcionario.setSalario(salario);

			// salva no banco de dados
			FuncionarioDAO dao = new FuncionarioDAO();
			dao.save(funcionario);
			txtNome.setText("");
			cbxCargo.getSelectionModel().select(0);
			txtSalario.setText("");
			lblMensagem.setText("O funcionario foi registrado com sucesso");
		} catch (ParseException e) {
			lblMensagem.setText("Digite o salario corretamente");
			return;
		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}

	}

	@FXML
	void limparOnAction(ActionEvent event) {
		txtNome.setText("");
		cbxCargo.getSelectionModel().select(0);
		txtSalario.setText("");
		lblMensagem.setText("");
	}
}
