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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

    @FXML
    private ImageView imageCharacter1;

    @FXML
    private ImageView imageCharacter2;

    @FXML
    private ImageView imageCharacter3;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        String elf1_1 = this.getClass().getResource("/com/example/game/Images/1_head.png").toString();
        String elf1_2 = this.getClass().getResource("/com/example/game/Images/1_body.png").toString();
        String elf1_3 = this.getClass().getResource("/com/example/game/Images/arrow.png").toString();

        String elf2_1 = this.getClass().getResource("/com/example/game/Images/2_head.png").toString();
        String elf2_2 = this.getClass().getResource("/com/example/game/Images/2_body.png").toString();
        String elf2_3 = this.getClass().getResource("/com/example/game/Images/sword.png").toString();

        String elf3_1 = this.getClass().getResource("/com/example/game/Images/3_head.png").toString();
        String elf3_2 = this.getClass().getResource("/com/example/game/Images/3_body.png").toString();
        String elf3_3 = this.getClass().getResource("/com/example/game/Images/stick.png").toString();

        String warrior1_1 = this.getClass().getResource("/com/example/game/Images/s1word.png").toString();
        String warrior1_2 = this.getClass().getResource("/com/example/game/Images/shield.png").toString();
        String warrior1_3 = this.getClass().getResource("/com/example/game/Images/11_body.png").toString();

        String warrior2_1 = this.getClass().getResource("/com/example/game/Images/2_2head.png").toString();
        String warrior2_2 = this.getClass().getResource("/com/example/game/Images/dagger.png").toString();
        String warrior2_3 = this.getClass().getResource("/com/example/game/Images/2_2body.png").toString();

        String knight1_1 = this.getClass().getResource("/com/example/game/Images/1_body_.png").toString();
        String knight1_2 = this.getClass().getResource("/com/example/game/Images/1_spear_.png").toString();
        String knight1_3 = this.getClass().getResource("/com/example/game/Images/1_shield_.png").toString();

        String knight2_1 = this.getClass().getResource("/com/example/game/Images/2_ax_.png").toString();
        String knight2_2 = this.getClass().getResource("/com/example/game/Images/2_body_.png").toString();
        String knight2_3 = this.getClass().getResource("/com/example/game/Images/2_shield_.png").toString();

        String knight3_1 = this.getClass().getResource("/com/example/game/Images/3_body_.png").toString();
        String knight3_2 = this.getClass().getResource("/com/example/game/Images/3_sword_.png").toString();
        String knight3_3 = this.getClass().getResource("/com/example/game/Images/3_shield_.png").toString();










        if(Administrator.getShowCharacter().equals("warrior_2")){
            SecondWarrior secondWarrior = new SecondWarrior(10,300);
            showCharacterAnchor.getChildren().add(secondWarrior);
            imageCharacter1.setImage(new Image(warrior2_1));
            imageCharacter2.setImage(new Image(warrior2_2));
            imageCharacter3.setImage(new Image(warrior2_3));


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


        else if(Administrator.getShowCharacter().equals("warrior_1")){

        FirstWarrior firstWarrior = new FirstWarrior(10,300);
        showCharacterAnchor.getChildren().add(firstWarrior);

        imageCharacter1.setImage(new Image(warrior1_1));
        imageCharacter2.setImage(new Image(warrior1_2));
        imageCharacter3.setImage(new Image(warrior1_3));


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
        else if(Administrator.getShowCharacter().equals("knight_3")){
        ThirdKnight thirdKnight = new ThirdKnight(10,300);
        showCharacterAnchor.getChildren().add(thirdKnight);

        imageCharacter1.setImage(new Image(knight3_1));
        imageCharacter2.setImage(new Image(knight3_2));
        imageCharacter3.setImage(new Image(knight3_3));

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
        else if(Administrator.getShowCharacter().equals("knight_1")){
        FirstKnight firstKnight = new FirstKnight(10,300);
        showCharacterAnchor.getChildren().add(firstKnight);

        imageCharacter1.setImage(new Image(knight1_1));
        imageCharacter2.setImage(new Image(knight1_2));
        imageCharacter3.setImage(new Image(knight1_3));


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

        else if(Administrator.getShowCharacter().equals("elf_3")){
        ThirdElf thirdElf = new ThirdElf(10,300);
        showCharacterAnchor.getChildren().add(thirdElf);

        imageCharacter1.setImage(new Image(elf3_1));
        imageCharacter2.setImage(new Image(elf3_2));
        imageCharacter3.setImage(new Image(elf3_3));

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
        else if(Administrator.getShowCharacter().equals("elf_2")){
        SecondElf secondElf = new SecondElf(10,300);
        showCharacterAnchor.getChildren().add(secondElf);

        imageCharacter1.setImage(new Image(elf2_1));
        imageCharacter2.setImage(new Image(elf2_2));
        imageCharacter3.setImage(new Image(elf2_3));

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
        else if(Administrator.getShowCharacter().equals("elf_1")){
        FirstElf firstElf = new FirstElf(10,300);
        showCharacterAnchor.getChildren().add(firstElf);

        imageCharacter1.setImage(new Image(elf1_1));
        imageCharacter2.setImage(new Image(elf1_2));
        imageCharacter3.setImage(new Image(elf1_3));

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

        else if(Administrator.getShowCharacter().equals("Knight_2")){
        SecondKnight secondKnight = new SecondKnight(10,300);
        showCharacterAnchor.getChildren().add(secondKnight);

        imageCharacter1.setImage(new Image(knight2_1));
        imageCharacter2.setImage(new Image(knight2_2));
        imageCharacter3.setImage(new Image(knight2_3));

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
