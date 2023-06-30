package com.example.ViewPackage;

import com.example.HeroPackage.Knight.FirstKnight;
import com.example.UserPackage.Administrator;
import com.example.UserPackage.User;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController extends Thread implements Initializable {

    @FXML
    private AnchorPane loginAnchor;

    @FXML
    private PasswordField passwordInput;

    @FXML
    private ImageView signImage;

    @FXML
    private TextField userNameInput;

    @FXML
    void createAccount(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("create-acc-controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void login(ActionEvent event) {

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FirstKnight firstKnight = new FirstKnight(10,380);
        loginAnchor.getChildren().add(firstKnight);
        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (firstKnight.getTranslateX()<220){
                firstKnight.walkForLogin();
            }



        }).start();






    }
}