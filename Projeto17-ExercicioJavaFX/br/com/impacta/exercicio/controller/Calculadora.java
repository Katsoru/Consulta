package br.com.impacta.exercicio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calculadora {
	double val1,val2,result;

    @FXML
    private Button btn_menos;

    @FXML
    private TextField txt_valor2;

    @FXML
    private TextField txt_valor1;

    @FXML
    private Button btn_vezes;

    @FXML
    private Button btn_mais;

    @FXML
    private TextField txt_resul;

    @FXML
    private Button vtn_divisao;

    @FXML
    void maisOnAction(ActionEvent event) {
    	
    	val1=Integer.parseInt(txt_valor1.getText());
    	val2=Integer.parseInt(txt_valor2.getText());
    	result=val1+val2;
    	txt_resul.setText(String.valueOf(result));
    }

    @FXML
    void menosOnAction(ActionEvent event) {
    	val1=Integer.parseInt(txt_valor1.getText());
    	val2=Integer.parseInt(txt_valor2.getText());
    	result=val1-val2;
    	txt_resul.setText(String.valueOf(result));
    }

    @FXML
    void vezesOnAction(ActionEvent event) {
    	val1=Integer.parseInt(txt_valor1.getText());
    	val2=Integer.parseInt(txt_valor2.getText());
    	result=val1*val2;
    	txt_resul.setText(String.valueOf(result));
    }

    @FXML
    void divisaoOnAction(ActionEvent event) {
    	val1=Integer.parseInt(txt_valor1.getText());
    	val2=Integer.parseInt(txt_valor2.getText());
    	result=val1/val2;
    	txt_resul.setText(String.valueOf(result));
    }

}
