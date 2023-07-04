package com.example.ViewPackage;

import com.example.HeroPackage.Knight.FirstKnight;
import com.example.UserPackage.Administrator;
import com.example.UserPackage.User;
import com.example.game.DataBase;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    void login(ActionEvent event) throws IOException {
        DataBase dataBase = new DataBase();
        String check = dataBase.checkPassword(userNameInput.getText() , passwordInput.getText());
        if (check.equals("checked")){
            User user = new User();
            user.setUserName(userNameInput.getText());
            user.setPassword(passwordInput.getText());
            user.setMap(Integer.valueOf(dataBase.checkMap(userNameInput.getText(),passwordInput.getText())));
            user.setLose(0);
            user.setWin(0);
            Administrator.setUser(user);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("after-login-controller.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("We do not have any user with this information!!!");
            alert.setHeaderText(null);
            alert.show();
        }
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