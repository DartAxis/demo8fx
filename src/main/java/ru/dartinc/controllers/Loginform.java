package ru.dartinc.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Loginform {
    @FXML
    public TextField usernameTextField;
    @FXML
    public PasswordField passwordPasswordField;
    @FXML
    public Button cancelBtn;
    @FXML
    public Button loginBtn;
    @FXML
    public Label errorLabel;

    @FXML
    public void onCancelBtnClick(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onLoginBtnClick(ActionEvent actionEvent) {
        if (!usernameTextField.getText().isEmpty() && !passwordPasswordField.getText().isEmpty() && (usernameTextField.getText().equals("alex") && passwordPasswordField.getText().equals("Qwerty3366"))) {
                errorLabel.setText("Username and password correct");
                Font font = errorLabel.getFont();
                errorLabel.setTextFill(Paint.valueOf("#00ff59"));
                errorLabel.setVisible(true);
        }else {
            errorLabel.setText("Invalid username or password");
            errorLabel.setTextFill(Paint.valueOf("#f50c0c"));
            errorLabel.setVisible(true);
        }
    }
}
