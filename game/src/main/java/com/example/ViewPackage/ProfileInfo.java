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

        String img_map_1 = this.getClass().getResource("/com/example/game/Images/Map_1.png").toString();
        String img_map_2 = this.getClass().getResource("/com/example/game/Images/Map_2.png").toString();
        String img_map_3 = this.getClass().getResource("/com/example/game/Images/Map_3.png").toString();
        String img_map_4 = this.getClass().getResource("/com/example/game/Images/Map_4.png").toString();



        if(Administrator.user.getMap()==1){
            mapImage.setImage(new Image(img_map_1));
        }
        else if(Administrator.user.getMap()==2){
            mapImage.setImage(new Image(img_map_2));
        }
        else if(Administrator.user.getMap()==3){
            mapImage.setImage(new Image(img_map_3));
        }
        else if(Administrator.user.getMap()==4){
            mapImage.setImage(new Image(img_map_4));
        }


    }
}
