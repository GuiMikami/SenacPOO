package br.edu.senacsp;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

  
    @FXML
    private TextField txtMetros;
    @FXML
    private Label LabelResultado;

public void calcular(){
    double metro = Double.valueOf(txtMetros.getText());
    LabelResultado.setText("Valor em centímetros: " + (metro * 100) );
}
    
}
