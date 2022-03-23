package com.engim.javainterfacciagrafica;

import com.engim.javainterfacciagrafica.model.Persona;
import com.engim.javainterfacciagrafica.model.Registro;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.ref.Cleaner;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button addPersonaButton;

    @FXML
    private Label personeLabel;

    @FXML
    private TextField nomeTextField;

    @FXML
    protected void onAddPersonaButtonClick() {
        if (nomeTextField.getText().equals("")) {
            //codice per inserire un alert da riga 30 a 33
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("ERRORE");
            a.setContentText("Non hai inserito il nome");
            a.show();
        } else {
            Registro.getInstance().addPersona(nomeTextField.getText());
            personeLabel.setText(Registro.getInstance().getNomiPersone());
            //welcomeText.setText("Welcome to JavaFX Application!");
        }
    }
}