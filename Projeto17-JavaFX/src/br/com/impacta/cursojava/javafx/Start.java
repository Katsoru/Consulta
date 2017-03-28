package br.com.impacta.cursojava.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stg) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/cadastroAluno.fxml"));
		Parent parent = loader.load();
		Scene scene = new Scene(parent);

		stg.setScene(scene);
		stg.setTitle("Cadastro");
		stg.show();

	}
}
