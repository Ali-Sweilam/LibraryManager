package com.example.librarymanager.Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
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
    private AnchorPane root;

    private double xOffset = 0;
    private double yOffset = 0;


    @FXML
    public void initialize() {
        // Close button
        closeBtn.setOnAction(e -> {
            Stage stage = (Stage) closeBtn.getScene().getWindow();
            stage.close();
        });

        // When the mouse is pressed, record the current position
        root.setOnMousePressed(event -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });

        // When the mouse is dragged, move the window accordingly
        root.setOnMouseDragged(event -> {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        });
    }


}
