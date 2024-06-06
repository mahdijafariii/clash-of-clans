package com.example.ViewPackage;

import com.example.MapPackage.CastleBridgeMap;
import com.example.MapPackage.DarkJungleMap;
import com.example.MapPackage.JungleMap;
import com.example.MapPackage.SkyBridgeMap;
import com.example.UserPackage.Administrator;
import com.example.UserPackage.User;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AfterStartBattleButtonController {
    @FXML
    private ImageView selectedMap;
    String img_map_1 = this.getClass().getResource("/com/example/game/Images/Map_1.png").toString();
    String img_map_2 = this.getClass().getResource("/com/example/game/Images/Map_2.png").toString();
    String img_map_3 = this.getClass().getResource("/com/example/game/Images/Map_3.png").toString();
    String img_map_4 = this.getClass().getResource("/com/example/game/Images/Map_4.png").toString();

    @FXML
    void afterChooseMap(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("choose-character-battle-controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void backToStartPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("after-login-controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void map1Clicked(MouseEvent event) {

        //// just for test items will be deleted soon
        User user = new User();
        user.setLevel(3);
        user.setUserName("mahdi");
        user.setPassword("mahdi");
        user.setMap(1);
        user.setWin(0);
        user.setLose(0);
        Administrator.setUser(user);
        //--------------------------------------------------
        selectedMap.setImage(new Image(img_map_1));
        Administrator.setSelectedMap("map_1");
    }

    @FXML
    void map2Clicked(MouseEvent event) {
        selectedMap.setImage(new Image(img_map_2));
        Administrator.setSelectedMap("map_2");
    }

    @FXML
    void map3Clicked(MouseEvent event) {
        selectedMap.setImage(new Image(img_map_3));
        Administrator.setSelectedMap("map_3");
    }

    @FXML
    void map4Clicked(MouseEvent event) {
        selectedMap.setImage(new Image(img_map_4));
        Administrator.setSelectedMap("map_4");
    }
}
