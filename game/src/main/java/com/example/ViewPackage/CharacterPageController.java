package com.example.ViewPackage;

import com.example.UserPackage.Administrator;
import com.example.game.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class CharacterPageController {
    @FXML
    void Knight_2(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("Knight_2");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void backToStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("after-login-controller.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void elf_1(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("elf_1");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void elf_2(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("elf_2");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void elf_3(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("elf_3");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void knight_1(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("knight_1");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void knight_3(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("knight_3");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void warrior_1(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("warrior_1");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void warrior_2(MouseEvent event) throws IOException {
        Administrator.setShowCharacter("warrior_2");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("show-character.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


}
