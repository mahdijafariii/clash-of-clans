package com.example.ViewPackage;

import com.example.UserPackage.Administrator;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
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
    @FXML
    void backFromProfile(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("after-login-controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        lose.setText(String.valueOf(Administrator.getUser().getLose()));
        win.setText(String.valueOf(Administrator.getUser().getWin()));
        UserName.setText(Administrator.getUser().getUserName());

        String img_map_1 = this.getClass().getResource("/com/example/game/Images/Map_1.png").toString();
        String img_map_2 = this.getClass().getResource("/com/example/game/Images/Map_2.png").toString();
        String img_map_3 = this.getClass().getResource("/com/example/game/Images/Map_3.png").toString();
        String img_map_4 = this.getClass().getResource("/com/example/game/Images/Map_4.png").toString();




        if(Administrator.getUser().getMap()==1){
            mapImage.setImage(new Image(img_map_1));
        }
        else if(Administrator.getUser().getMap()==2){
            mapImage.setImage(new Image(img_map_2));
        }
        else if(Administrator.getUser().getMap()==3){
            mapImage.setImage(new Image(img_map_3));
        }
        else if(Administrator.getUser().getMap()==4){
            mapImage.setImage(new Image(img_map_4));
        }


    }
}
