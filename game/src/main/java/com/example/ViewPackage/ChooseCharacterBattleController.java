package com.example.ViewPackage;

import com.example.MapPackage.CastleBridgeMap;
import com.example.MapPackage.DarkJungleMap;
import com.example.MapPackage.JungleMap;
import com.example.MapPackage.SkyBridgeMap;
import com.example.UserPackage.Administrator;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ChooseCharacterBattleController {
    String img_main_Warrior1 = this.getClass().getResource("/com/example/game/Images/Warrior_01__Main.png").toString();
    String img_main_Warrior2 = this.getClass().getResource("/com/example/game/Images/Warrior_02__Main.png").toString();
    String img_main_Knight1 = this.getClass().getResource("/com/example/game/Images/Knight_01__Main.png").toString();
    String img_main_Knight2 = this.getClass().getResource("/com/example/game/Images/Knight_02__Main.png").toString();
    String img_main_Knight3 = this.getClass().getResource("/com/example/game/Images/Knight_03__Main.png").toString();
    String img_main_elf1 = this.getClass().getResource("/com/example/game/Images/Elf_01__Main.png").toString();
    String img_main_elf2 = this.getClass().getResource("/com/example/game/Images/Elf_02__Main.png").toString();
    String img_main_elf3 = this.getClass().getResource("/com/example/game/Images/Elf_03__Main.png").toString();


    @FXML
    private ImageView character1;

    @FXML
    private ImageView character2;

    @FXML
    private ImageView character3;

    @FXML
    private ImageView character4;




    @FXML
    void backFromChooseHero(ActionEvent event) throws IOException {
        for(int i = 0 ; i <Administrator.getCharacters().size() ; i++){
            Administrator.getCharacters().remove(i);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AfterLoginController.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void deleteChoose(ActionEvent event) {
    character1.setImage(null);
    character2.setImage(null);
    character3.setImage(null);
    character4.setImage(null);
    for(int i = 0 ; i <Administrator.getCharacters().size() ; i++){
        Administrator.getCharacters().remove(i);
    }
    }


    @FXML
    void elf1(MouseEvent event) {
        if(character1.getImage()==null){
            character1.setImage(new Image(img_main_elf1));
            Administrator.getCharacters().add("Elf1");
        }
        else if (character2.getImage()==null){
            character2.setImage(new Image(img_main_elf1));
            Administrator.getCharacters().add("Elf1");
        }
        else if (character3.getImage()==null){
            character3.setImage(new Image(img_main_elf1));
            Administrator.getCharacters().add("Elf1");
        }
        else if (character4.getImage()==null){
            character4.setImage(new Image(img_main_elf1));
            Administrator.getCharacters().add("Elf1");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("You have maximum hero!!");
            alert.show();
        }

    }

    @FXML
    void elf2(MouseEvent event) {
        if(character1.getImage()==null){
            character1.setImage(new Image(img_main_elf2));
            Administrator.getCharacters().add("Elf2");
        }
        else if (character2.getImage()==null){
            character2.setImage(new Image(img_main_elf2));
            Administrator.getCharacters().add("Elf2");
        }
        else if (character3.getImage()==null){
            character3.setImage(new Image(img_main_elf2));
            Administrator.getCharacters().add("Elf2");
        }
        else if (character4.getImage()==null){
            character4.setImage(new Image(img_main_elf2));
            Administrator.getCharacters().add("Elf2");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("You have maximum hero!!");
            alert.show();
        }
    }

    @FXML
    void elf3(MouseEvent event) {
        if(character1.getImage()==null){
            character1.setImage(new Image(img_main_elf3));
            Administrator.getCharacters().add("Elf3");
        }
        else if (character2.getImage()==null){
            character2.setImage(new Image(img_main_elf3));
            Administrator.getCharacters().add("Elf3");
        }
        else if (character3.getImage()==null){
            character3.setImage(new Image(img_main_elf3));
            Administrator.getCharacters().add("Elf3");
        }
        else if (character4.getImage()==null){
            character4.setImage(new Image(img_main_elf3));
            Administrator.getCharacters().add("Elf3");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("You have maximum hero!!");
            alert.show();
        }
    }

    @FXML
    void knight1(MouseEvent event) {
        if(Administrator.getUser().getLevel()>=3){
            if(character1.getImage()==null){
                character1.setImage(new Image(img_main_Knight1));
                Administrator.getCharacters().add("Knight1");
            }
            else if (character2.getImage()==null){
                character2.setImage(new Image(img_main_Knight1));
                Administrator.getCharacters().add("Knight1");
            }
            else if (character3.getImage()==null){
                character3.setImage(new Image(img_main_Knight1));
                Administrator.getCharacters().add("Knight1");
            }
            else if (character4.getImage()==null){
                character4.setImage(new Image(img_main_Knight1));
                Administrator.getCharacters().add("Knight1");
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error!");
                alert.setContentText("You have maximum hero!!");
                alert.show();
            }

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("Your level is less than 3 , you can not pick up this hero!!");
            alert.show();
        }

    }

    @FXML
    void knight2(MouseEvent event) {
        if(Administrator.getUser().getLevel()>=3){
            if(character1.getImage()==null){
                character1.setImage(new Image(img_main_Knight2));
                Administrator.getCharacters().add("Knight2");
            }
            else if (character2.getImage()==null){
                character2.setImage(new Image(img_main_Knight2));
                Administrator.getCharacters().add("Knight2");
            }
            else if (character3.getImage()==null){
                character3.setImage(new Image(img_main_Knight2));
                Administrator.getCharacters().add("Knight2");
            }
            else if (character4.getImage()==null){
                character4.setImage(new Image(img_main_Knight2));
                Administrator.getCharacters().add("Knight2");
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error!");
                alert.setContentText("You have maximum hero!!");
                alert.show();
            }

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("Your level is less than 3 , you can not pick up this hero!!");
            alert.show();
        }
    }

    @FXML
    void knight3(MouseEvent event) {
        if(Administrator.getUser().getLevel()>=3){
            if(character1.getImage()==null){
                character1.setImage(new Image(img_main_Knight3));
                Administrator.getCharacters().add("Knight3");
            }
            else if (character2.getImage()==null){
                character2.setImage(new Image(img_main_Knight3));
                Administrator.getCharacters().add("Knight3");
            }
            else if (character3.getImage()==null){
                character3.setImage(new Image(img_main_Knight3));
                Administrator.getCharacters().add("Knight3");
            }
            else if (character4.getImage()==null){
                character4.setImage(new Image(img_main_Knight3));
                Administrator.getCharacters().add("Knight3");
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error!");
                alert.setContentText("You have maximum hero!!");
                alert.show();
            }

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("Your level is less than 3 , you can not pick up this hero!!");
            alert.show();
        }
    }

    @FXML
    void startBattle(ActionEvent event) throws IOException {
        if(Administrator.getSelectedMap().equals("map_1")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("jungle-map.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        else if (Administrator.getSelectedMap().equals("map_2")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sky-bridge-map.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        else if (Administrator.getSelectedMap().equals("map_3")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dark-jungle-map.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        else if (Administrator.getSelectedMap().equals("map_4")){
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("castle-bridge-map.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }

    }

    @FXML
    void warrior1(MouseEvent event) {
        if(Administrator.getUser().getLevel()>=2){
            if(character1.getImage()==null){
                character1.setImage(new Image(img_main_Warrior1));
                character1.setFitHeight(80);
                character1.setFitWidth(110);
                Administrator.getCharacters().add("Warrior1");
            }
            else if (character2.getImage()==null){
                character2.setImage(new Image(img_main_Warrior1));
                character2.setFitHeight(80);
                character2.setFitWidth(110);
                Administrator.getCharacters().add("Warrior1");
            }
            else if (character3.getImage()==null){
                character3.setImage(new Image(img_main_Warrior1));
                character3.setFitHeight(80);
                character3.setFitWidth(110);
                Administrator.getCharacters().add("Warrior1");
            }
            else if (character4.getImage()==null){
                character4.setImage(new Image(img_main_Warrior1));
                character4.setFitHeight(80);
                character4.setFitWidth(110);
                Administrator.getCharacters().add("Warrior1");
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error!");
                alert.setContentText("You have maximum hero!!");
                alert.show();
            }

        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("Your level is less than 2 , you can not pick up this hero!!");
            alert.show();
        }
    }

    @FXML
    void warrior2(MouseEvent event) {
        if(character1.getImage()==null){
            character1.setImage(new Image(img_main_Warrior2));
            character1.setFitHeight(80);
            character1.setFitWidth(110);
            Administrator.getCharacters().add("Warrior2");
        }
        else if (character2.getImage()==null){
            character2.setImage(new Image(img_main_Warrior2));
            character2.setFitHeight(80);
            character2.setFitWidth(110);
            Administrator.getCharacters().add("Warrior2");
        }
        else if (character3.getImage()==null){
            character3.setImage(new Image(img_main_Warrior2));
            character3.setFitHeight(80);
            character3.setFitWidth(110);
            Administrator.getCharacters().add("Warrior2");
        }
        else if (character4.getImage()==null){
            character4.setImage(new Image(img_main_Warrior2));
            character4.setFitHeight(80);
            character4.setFitWidth(110);
            Administrator.getCharacters().add("Warrior2");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error!");
            alert.setContentText("You have maximum hero!!");
            alert.show();
        }
    }
}
