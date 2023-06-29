package com.example.ViewPackage;

import com.example.UserPackage.Administrator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileInfo implements Initializable {

    @FXML
    private Text UserName;

    @FXML
    private Text lose;

    @FXML
    private ImageView mapImage;

    @FXML
    private Text win;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lose.setText(String.valueOf(Administrator.user.getLose()));
        win.setText(String.valueOf(Administrator.user.getWin()));
        UserName.setText(Administrator.user.getUserName());


        if(Administrator.user.getMap()==1){
            mapImage.setImage(new Image(""));
        }
        else if(Administrator.user.getMap()==2){
            mapImage.setImage(new Image(""));
        }
        else if(Administrator.user.getMap()==3){
            mapImage.setImage(new Image(""));
        }
        else if(Administrator.user.getMap()==4){
            mapImage.setImage(new Image(""));
        }


    }
}
