package com.example.ViewPackage;

import com.example.UserPackage.Administrator;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DarkJungleMapController implements Initializable
{
    @FXML
    private ImageView castle_1;
    @FXML
    private Label numberHero;

    @FXML
    private ImageView door_1;

    @FXML
    private ImageView door_2;

    @FXML
    private ImageView hero_1;

    @FXML
    private ImageView hero_2;

    @FXML
    private ImageView hero_3;

    @FXML
    private ImageView hero_4;

    @FXML
    private Label name_1;

    @FXML
    private Label name_2;

    @FXML
    private Label name_3;

    @FXML
    private Label name_4;

    @FXML
    private ProgressBar progress;

    @FXML
    private ImageView star_1;

    @FXML
    private ImageView star_2;

    @FXML
    private ImageView star_3;

    @FXML
    private ImageView tower_1;

    @FXML
    private ImageView tower_2;

    @FXML
    private ImageView tower_3;

    String knight1_head = this.getClass().getResource("/com/example/game/Images/Knight1_Head.png").toString();
    String knight2_head = this.getClass().getResource("/com/example/game/Images/Knight2_Head.png").toString();
    String knight3_head = this.getClass().getResource("/com/example/game/Images/Knight3_Head.png").toString();
    String warrior1_head = this.getClass().getResource("/com/example/game/Images/Warrior1_Head.png").toString();
    String warrior2_head = this.getClass().getResource("/com/example/game/Images/Warrior2_Head.png").toString();
    String elf1_head = this.getClass().getResource("/com/example/game/Images/Elf1_head.png").toString();
    String elf2_head = this.getClass().getResource("/com/example/game/Images/Elf1_head.png").toString();
    String elf3_head = this.getClass().getResource("/com/example/game/Images/Elf1_head.png").toString();


    @FXML
    public ArrayList<ImageView> getImages()
    {
        ArrayList<ImageView> images = new ArrayList<>();
        images.add(castle_1);
        images.add(tower_1);
        images.add(tower_2);
        images.add(door_1);
        images.add(door_2);
        images.add(tower_3);

        return images;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i = 0 ; i < 4 ; i++){
            if(Administrator.getCharacters().get(i).equals("Elf1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf1_head));
                    name_1.setText("Elf Shooter");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf1_head));
                    name_2.setText("Elf Shooter");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf1_head));
                    name_3.setText("Elf Shooter");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf1_head));
                    name_4.setText("Elf Shooter");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Elf2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf2_head));
                    name_1.setText("Elf Swordsman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf2_head));
                    name_2.setText("Elf Swordsman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf2_head));
                    name_3.setText("Elf Swordsman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf2_head));
                    name_4.setText("Elf Swordsman");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Elf3")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf3_head));
                    name_1.setText("Elf Magician");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf3_head));
                    name_2.setText("Elf Magician");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf3_head));
                    name_3.setText("Elf Magician");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf3_head));
                    name_4.setText("Elf Magician");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight1_head));
                    name_1.setText("German Spearman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight1_head));
                    name_2.setText("German Spearman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight1_head));
                    name_3.setText("German Spearman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight1_head));
                    name_4.setText("German Spearman");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight2_head));
                    name_1.setText("Arab Warrior");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight2_head));
                    name_2.setText("Arab Warrior");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight2_head));
                    name_3.setText("Arab Warrior");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight2_head));
                    name_4.setText("Arab Warrior");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight3")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight3_head));
                    name_1.setText("Armored Iron");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight3_head));
                    name_2.setText("Armored Iron");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight3_head));
                    name_3.setText("Armored Iron");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight3_head));
                    name_4.setText("Armored Iron");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Warrior1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(warrior1_head));
                    name_1.setText("Woman Warrior");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(warrior1_head));
                    name_2.setText("Woman Warrior");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(warrior1_head));
                    name_3.setText("Woman Warrior");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(warrior1_head));
                    name_4.setText("Woman Warrior");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Warrior2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(warrior2_head));
                    name_1.setText("Knife Woman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(warrior2_head));
                    name_2.setText("Knife Woman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(warrior2_head));
                    name_3.setText("Knife Woman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(warrior2_head));
                    name_4.setText("Knife Woman");

                }
            }




        }

    }
}