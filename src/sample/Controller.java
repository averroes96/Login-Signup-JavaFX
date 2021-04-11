package sample;

import animatefx.animation.FadeIn;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label loginTAB,signupTAB;

    @FXML
    private VBox loginVB,signupVB;

    @FXML
    private JFXTextField usernameLoginTF,usernameSignupTF,fullnameTF;

    @FXML
    private JFXPasswordField passwordLoginTF,passwordSignupTF;

    @FXML
    private JFXButton loginBtn,signupBtn;

    @FXML
    private JFXToggleButton adminTB;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loginTAB.setOnMouseClicked(this::showSelectedTab);

        signupTAB.setOnMouseClicked(this::showSelectedTab);

        loginBtn.setOnAction(action -> {
            login();
        });

        signupBtn.setOnAction(action -> {
            signup();
        });

    }

    private void signup() {

        // signup code goes here
    }

    private void login() {

        // login code goes here
    }

    private void showSelectedTab(MouseEvent action) {

        if(action.getSource() == loginTAB){
            if(!loginVB.isVisible()) {
                loginTAB.setId("selected-register-tab");
                signupTAB.setId("register-tab");
                loginVB.setVisible(true);
                signupVB.setVisible(false);
                loginBtn.setDefaultButton(true);
                new FadeIn(loginVB).play();
            }
        }
        if(action.getSource() == signupTAB){
            if(!signupVB.isVisible()) {
                signupTAB.setId("selected-register-tab");
                loginTAB.setId("register-tab");
                loginVB.setVisible(false);
                signupVB.setVisible(true);
                signupBtn.setDefaultButton(true);
                new FadeIn(signupVB).play();
            }
        }
    }
}
