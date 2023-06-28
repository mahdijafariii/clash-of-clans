package com.example.ViewPackage;

import com.example.game.DataBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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
    private TextField password;

    @FXML
    private TextField userName;

    @FXML
    void confirmSign(ActionEvent event) throws ClassNotFoundException {
        DataBase dataBase = new DataBase();
        String check = dataBase.checkUserName(userName.getText());
        if (check.equals("checked")){
            dataBase.saveUser(userName.getText(),password.getText(),Integer.valueOf(numberMap.getText()));
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
