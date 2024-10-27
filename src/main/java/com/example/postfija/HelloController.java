package com.example.postfija;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private TextField expresionDada;

    @FXML
    private Button btnEvaluar;

    @FXML
    private Label resultado;

    @FXML
    private Label cadenaPostfija;

    @FXML
    public void initialize() {
        btnEvaluar.setOnAction(e -> evaluarExpresion());
    }

    private void evaluarExpresion() {
        String expresion = expresionDada.getText();
        System.out.println("Expresion dada: " + expresion);
    }
}