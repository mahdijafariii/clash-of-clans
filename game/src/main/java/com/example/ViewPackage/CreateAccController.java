package com.example.ViewPackage;

import com.example.game.DataBase;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccController {
    @FXML
    private ImageView map1;

    @FXML
    private ImageView map2;

    @FXML
    private ImageView map3;

    @FXML
    private ImageView map4;

    @FXML
    private TextField numberMap;

    @FXML
    private PasswordField password;

    @FXML
    private TextField userName;
    @FXML
    void backToLogin(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void confirmSign(ActionEvent event) throws ClassNotFoundException {
        DataBase dataBase = new DataBase();
        String check = dataBase.checkUserName(userName.getText());
        if (check.equals("checked")){
            String saveUser = dataBase.saveUser(userName.getText(),password.getText(),Integer.valueOf(numberMap.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notification!!!");
            alert.setHeaderText(null);
            alert.setContentText(saveUser);
            alert.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Unacceptable name!!");
            alert.setHeaderText(null);
            alert.setContentText("This name is already selected!! Please choose another name!");
            alert.show();
        }
    }
}
