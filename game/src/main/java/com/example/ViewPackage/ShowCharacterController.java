package com.example.ViewPackage;

import com.example.HeroPackage.Knight.FirstKnight;
import com.example.HeroPackage.Knight.SecondKnight;
import com.example.HeroPackage.Knight.ThirdKnight;
import com.example.HeroPackage.Warrior.FirstWarrior;
import com.example.HeroPackage.Warrior.SecondWarrior;
import com.example.HeroPackage.elves.FirstElf;
import com.example.HeroPackage.elves.SecondElf;
import com.example.HeroPackage.elves.ThirdElf;
import com.example.UserPackage.Administrator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ShowCharacterController implements Initializable {
    @FXML
    private TextArea attributeArea;

    @FXML
    private TextArea informationArea;

    @FXML
    private AnchorPane showCharacterAnchor;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(Administrator.showCharacter.equals("warrior_2")){
            SecondWarrior secondWarrior = new SecondWarrior(10,300);
            showCharacterAnchor.getChildren().add(secondWarrior);


            informationArea.setText(secondWarrior.getInfo());
            attributeArea.setText(secondWarrior.toString());

            new Thread(()->{
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                while (secondWarrior.getTranslateX()<220){
                    secondWarrior.walkForLogin();
                }
                secondWarrior.showCharacterInfoAttack();
            }).start();

        }


        else if(Administrator.showCharacter.equals("warrior_1")){

        FirstWarrior firstWarrior = new FirstWarrior(10,300);
        showCharacterAnchor.getChildren().add(firstWarrior);


        informationArea.setText(firstWarrior.getInfo());
        attributeArea.setText(firstWarrior.toString());

        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (firstWarrior.getTranslateX()<220){
                firstWarrior.walkForLogin();
            }
            firstWarrior.showCharacterInfoAttack();
        }).start();

        }
        else if(Administrator.showCharacter.equals("knight_3")){
        ThirdKnight thirdKnight = new ThirdKnight(10,300);
        showCharacterAnchor.getChildren().add(thirdKnight);


        informationArea.setText(thirdKnight.getInfo());
        attributeArea.setText(thirdKnight.toString());


        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (thirdKnight.getTranslateX()<220){
                thirdKnight.walkForLogin();
            }
            thirdKnight.showCharacterInfoAttack();
        }).start();


        }
        else if(Administrator.showCharacter.equals("knight_1")){
        FirstKnight firstKnight = new FirstKnight(10,300);
        showCharacterAnchor.getChildren().add(firstKnight);


        informationArea.setText(firstKnight.getInfo());
        attributeArea.setText(firstKnight.toString());


        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (firstKnight.getTranslateX()<220){
                firstKnight.walkForLogin();
            }
            firstKnight.showCharacterInfoAttack();
        }).start();


        }

        else if(Administrator.showCharacter.equals("elf_3")){
        ThirdElf thirdElf = new ThirdElf(10,300);
        showCharacterAnchor.getChildren().add(thirdElf);


        informationArea.setText(thirdElf.getInfo());
        attributeArea.setText(thirdElf.toString());


        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (thirdElf.getTranslateX()<220){
                thirdElf.walkForLogin();
            }
            thirdElf.showCharacterInfoAttack();
        }).start();


        }
        else if(Administrator.showCharacter.equals("elf_2")){
        SecondElf secondElf = new SecondElf(10,300);
        showCharacterAnchor.getChildren().add(secondElf);

        informationArea.setText(secondElf.getInfo());
        attributeArea.setText(secondElf.toString());



        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (secondElf.getTranslateX()<220){
                secondElf.walkForLogin();
            }
            secondElf.showCharacterInfoAttack();
        }).start();


        }
        else if(Administrator.showCharacter.equals("elf_1")){
        FirstElf firstElf = new FirstElf(10,300);
        showCharacterAnchor.getChildren().add(firstElf);

        informationArea.setText(firstElf.getInfo());
        attributeArea.setText(firstElf.toString());


        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (firstElf.getTranslateX()<220){
                firstElf.walkForLogin();
            }
            firstElf.showCharacterInfoAttack();
        }).start();


        }

        else if(Administrator.showCharacter.equals("Knight_2")){
        SecondKnight secondKnight = new SecondKnight(10,300);
        showCharacterAnchor.getChildren().add(secondKnight);

        informationArea.setText(secondKnight.getInfo());
        attributeArea.setText(secondKnight.toString());



        new Thread(()->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (secondKnight.getTranslateX()<220){
                secondKnight.walkForLogin();
            }
            secondKnight.showCharacterInfoAttack();
        }).start();


        }

    }
}
