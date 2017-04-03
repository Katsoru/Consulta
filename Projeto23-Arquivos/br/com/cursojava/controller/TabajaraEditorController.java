package br.com.cursojava.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Classe controladora da janela TabajaraEditor.fxml utilizada como aplicativo
 * editor de textos.
 * 
 * @author sandro.vieira
 * @version 1.0, 13 de out de 2016 - sandro.vieira - Implementacao.
 */
public class TabajaraEditorController extends Application {

	/** Text area que contem todo o texto que esta sendo editado. */
	@FXML
	private TextArea txtEditor;

	/** Label utilizado para exibir mensagens de erro ou sucesso. */
	@FXML
	private Label lblMensagem;

	/** Caixa de dialogo para escolha de arquivo. */
	private FileChooser dialog = new FileChooser();

	/**
	 * Janela da aplicacao. Atraves desta variavel, podemos controlar o
	 * comportamento da janela, como fechar, mudar o titulo, etc. Esta variavel
	 * esta sendo preenchida logo apos carregarmos o arquivo FXML (veja o metodo
	 * start())
	 */
	private Stage stage;

	/**
	 * Executado ao clicar no menu Abrir.
	 * 
	 * @param event
	 */
	@FXML
	void abrirOnAction(ActionEvent event) {
		File arquivo = dialog.showOpenDialog(stage);
		if (arquivo == null) {
			return;
		}

		try {
			/*BufferedReader reader = new BufferedReader(new FileReader(arquivo));
			txtEditor.clear();
			while (reader.ready()) {
				txtEditor.appendText(reader.readLine());
				txtEditor.appendText("\n");
			}
			reader.close();
			lblMensagem.setText("Arquivo carregado com sucesso");*/
		
		
		FileReader reader = new FileReader(arquivo);
		char[] buffer = new char[4096];
		int quant = 0;
		StringBuilder builder = new StringBuilder();
		
		while ((quant = reader.read(buffer)) > 0) {
			builder.append(buffer, 0, quant);
		}
		
		txtEditor.setText(builder.toString());
		
		reader.close();
		
		lblMensagem.setText("Arquivo carregado com sucesso.");
		} catch (IOException e) {
			lblMensagem.setText("Falha ao carregar arquivo");
			e.printStackTrace();
		}
		
	}

	/**
	 * Executado ao clicar no menu Novo.
	 * 
	 * @param event
	 */
	@FXML
	void novoOnAction(ActionEvent event) {
		txtEditor.clear();
	}

	/**
	 * Executado ao clicar no menu Sair.
	 * 
	 * @param event
	 */
	@FXML
	void sairOnAction(ActionEvent event) {
		stage.close();
	}

	/**
	 * Executado ao clicar no menu Salvar.
	 * 
	 * @param event
	 */
	@FXML
	void salvarOnAction(ActionEvent event) {
		File arquivo = dialog.showSaveDialog(stage);
		if (arquivo == null) {
			return;
		}

		try {
			FileWriter writer = new FileWriter(arquivo);
			writer.write(txtEditor.getText());
			lblMensagem.setText("Arquivo salvo com sucesso");
		} catch (IOException e) {
			lblMensagem.setText("Falha ao salvar o arquivo");
			e.printStackTrace();
		}
	}

	/**
	 * Permite que o stage (janela) seja assinalada nesta classe controladora.
	 */
	private void setStage(Stage stage) {
		this.stage = stage;
	}

	/**
	 * Inicia a aplicacao carregando a primeira (e unica) janela. Geralmente
	 * este metodo (bem como o metodo main) eh especificado em uma outra classe.
	 * Colocamos aqui, para reduzir a quantidade de classes.
	 */
	@Override
	public void start(Stage stage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"/resource/TabajaraEditor.fxml"));
		Parent parent = loader.load();

		/* Assinala o stage (janela) na classe controladora */
		TabajaraEditorController controller = loader.getController();
		controller.setStage(stage);

		stage.setScene(new Scene(parent));
		stage.setTitle("Tabajara Editor");
		stage.getIcons().add(
				new Image(getClass().getResourceAsStream(
						"/resource/image/editor-icon.png")));
		stage.show();
	}

	/**
	 * Metodo main, onde tudo comeca. Aqui estamos fazendo a inicializacao
	 * padrao para aplicacoes Java FX. Ao executar o launch(), o Java salta para
	 * o metodo start (acima)
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
