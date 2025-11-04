package com.example.librarymanager.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.CustomPasswordField;
import org.controlsfx.control.textfield.CustomTextField;

public class LoginController {

    @FXML
    private Button closeBtn;

    @FXML
    private Label errorLogin_lb;

    @FXML
    private Hyperlink hyplink;

    @FXML
    private JFXButton login_btn;

    @FXML
    private CustomPasswordField password_fld;

    @FXML
    private CustomTextField username_fld;


    @FXML
    public void initialize() {
        closeBtn.setOnAction(e -> {
            Stage stage = (Stage) closeBtn.getScene().getWindow();
            stage.close();
        });
    }

}
