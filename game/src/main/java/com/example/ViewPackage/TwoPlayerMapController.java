package com.example.ViewPackage;

import com.example.BuildingPackage.Building;
import com.example.BuildingPackage.Towers.JungleTower;
import com.example.BuildingPackage.Towers.SkyBridgeTower;
import com.example.HeroPackage.Heroes;
import com.example.HeroPackage.Knight.FirstKnight;
import com.example.HeroPackage.Knight.SecondKnight;
import com.example.HeroPackage.Knight.ThirdKnight;
import com.example.HeroPackage.Warrior.FirstWarrior;
import com.example.HeroPackage.Warrior.SecondWarrior;
import com.example.HeroPackage.elves.FirstElf;
import com.example.HeroPackage.elves.SecondElf;
import com.example.HeroPackage.elves.ThirdElf;
import com.example.MapPackage.TwoPlayerMap;
import com.example.UserPackage.Administrator;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class TwoPlayerMapController implements Initializable
{
    @FXML
    private AnchorPane anchor;
    @FXML
    private ImageView castle_1;
    @FXML
    private ImageView castle_2;
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
    private Label numberHero;
    @FXML
    private Label numberHero2;
    @FXML
    private Label numberHero3;
    @FXML
    private Label numberHero4;
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
    @FXML
    private ImageView tower_4;

    @FXML
    public ArrayList<ImageView> getImages()
    {
        ArrayList<ImageView> images = new ArrayList<>();
        images.add(tower_3);
        images.add(tower_4);
        images.add(tower_1);
        images.add(tower_2);
        images.add(castle_1);
        images.add(castle_2);

        return images;
    }

    String knight1_head = this.getClass().getResource("/com/example/game/Images/Knight1_Head.png").toString();
    String knight2_head = this.getClass().getResource("/com/example/game/Images/Knight2_Head.png").toString();
    String knight3_head = this.getClass().getResource("/com/example/game/Images/Knight3_Head.png").toString();
    String warrior1_head = this.getClass().getResource("/com/example/game/Images/Warrior1_Head.png").toString();
    String warrior2_head = this.getClass().getResource("/com/example/game/Images/Warrior2_Head.png").toString();
    String elf1_head = this.getClass().getResource("/com/example/game/Images/Elf1_head.png").toString();
    String elf2_head = this.getClass().getResource("/com/example/game/Images/Elf2_head.png").toString();
    String elf3_head = this.getClass().getResource("/com/example/game/Images/Elf3_head.png").toString();

    ArrayList<ImageView> cardFrame = new ArrayList<>();
    ArrayList<Heroes> allHeroes = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        for(int i = 0 ; i < 4 ; i++){
            if(Administrator.getCharacters().get(i).equals("Elf1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf1_head));
                    hero_1.setId("elf1");
                    name_1.setText("Elf Shooter");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf1_head));
                    hero_2.setId("elf1");
                    name_2.setText("Elf Shooter");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf1_head));
                    hero_3.setId("elf1");
                    name_3.setText("Elf Shooter");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf1_head));
                    hero_4.setId("elf1");
                    name_4.setText("Elf Shooter");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Elf2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf2_head));
                    hero_1.setId("elf2");
                    name_1.setText("Elf Swordsman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf2_head));
                    hero_2.setId("elf2");
                    name_2.setText("Elf Swordsman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf2_head));
                    hero_3.setId("elf2");
                    name_3.setText("Elf Swordsman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf2_head));
                    hero_4.setId("elf2");
                    name_4.setText("Elf Swordsman");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Elf3")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(elf3_head));
                    hero_1.setId("elf3");
                    name_1.setText("Elf Magician");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(elf3_head));
                    hero_2.setId("elf3");
                    name_2.setText("Elf Magician");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(elf3_head));
                    hero_3.setId("elf3");
                    name_3.setText("Elf Magician");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(elf3_head));
                    hero_4.setId("elf3");
                    name_4.setText("Elf Magician");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight1_head));
                    hero_1.setId("knight1");
                    name_1.setText("German Spearman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight1_head));
                    hero_2.setId("knight1");
                    name_2.setText("German Spearman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight1_head));
                    hero_3.setId("knight1");
                    name_3.setText("German Spearman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight1_head));
                    hero_4.setId("knight1");
                    name_4.setText("German Spearman");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight2_head));
                    hero_1.setId("knight2");
                    name_1.setText("Arab Warrior");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight2_head));
                    hero_2.setId("knight2");
                    name_2.setText("Arab Warrior");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight2_head));
                    hero_3.setId("knight2");
                    name_3.setText("Arab Warrior");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight2_head));
                    hero_4.setId("knight2");
                    name_4.setText("Arab Warrior");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Knight3")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(knight3_head));
                    hero_1.setId("knight3");
                    name_1.setText("Armored Iron");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(knight3_head));
                    hero_2.setId("knight3");
                    name_2.setText("Armored Iron");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(knight3_head));
                    hero_3.setId("knight3");
                    name_3.setText("Armored Iron");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(knight3_head));
                    hero_4.setId("knight3");
                    name_4.setText("Armored Iron");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Warrior1")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(warrior1_head));
                    hero_1.setId("warrior1");
                    name_1.setText("Woman Warrior");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(warrior1_head));
                    hero_2.setId("warrior1");
                    name_2.setText("Woman Warrior");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(warrior1_head));
                    hero_3.setId("warrior1");
                    name_3.setText("Woman Warrior");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(warrior1_head));
                    hero_4.setId("warrior1");
                    name_4.setText("Woman Warrior");

                }
            }
            if(Administrator.getCharacters().get(i).equals("Warrior2")){
                if(hero_1.getImage()==null){
                    hero_1.setImage(new Image(warrior2_head));
                    hero_1.setId("warrior2");
                    name_1.setText("Knife Woman");

                }
                else if (hero_2.getImage()==null){
                    hero_2.setImage(new Image(warrior2_head));
                    hero_2.setId("warrior2");
                    name_2.setText("Knife Woman");

                }
                else if(hero_3.getImage()==null){
                    hero_3.setImage(new Image(warrior2_head));
                    hero_3.setId("warrior2");
                    name_3.setText("Knife Woman");

                }
                else if(hero_4.getImage()==null){
                    hero_4.setImage(new Image(warrior2_head));
                    hero_4.setId("warrior2");
                    name_4.setText("Knife Woman");

                }
            }
        }
        //end of put image of heroes in card frame
        cardFrame.add(hero_1);
        cardFrame.add(hero_2);
        cardFrame.add(hero_3);
        cardFrame.add(hero_4);
        dragHero(); // make draggable of card frame of heroes !


        //-------------------------------------------------------------------

        //starting Threads
        if (Administrator.getCurrentMap() == null)
        {
            TwoPlayerMap twoPlayerMap = new TwoPlayerMap(this);
            Administrator.setTwoPlayerMapController(this);
            Administrator.setCurrentMap(twoPlayerMap);
        }
        for (Building building : Administrator.getCurrentMap().getBuildings())
        {
            if (building instanceof SkyBridgeTower)
            {
                ((JungleTower) building).startThread();
                System.out.println("thread ran");
            }
        }
    }
    ImageView getCopy(ImageView image){
        ImageView ImageView = new ImageView(image.getImage()) ;
        return ImageView;
    }
    void dragHero(){
        for(Node hero : cardFrame){
            AtomicReference<ImageView> test = new AtomicReference<>();
            hero.setOnMousePressed(e ->{
                test.set(getCopy((ImageView) hero));
                hero.setCursor(Cursor.CLOSED_HAND);
            });
            hero.setOnMouseDragged(e ->{
                test.get().setTranslateX(e.getSceneX());
                test.get().setTranslateY(e.getSceneY());
            });
            hero.setOnMouseReleased(e ->{
                if( e.getSceneY()>140 && e.getSceneY()<440) {
                    if (hero.getId().equals("elf1")) {
                        FirstElf firstElf = new FirstElf(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(firstElf);
                        allHeroes.add(firstElf);
                        Administrator.getCurrentMap().setHeroes(allHeroes);
                    } else if (hero.getId().equals("elf2")) {
                        SecondElf secondElf = new SecondElf(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(secondElf);
                        allHeroes.add(secondElf);
                    } else if (hero.getId().equals("elf3")) {
                        ThirdElf thirdElf = new ThirdElf(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(thirdElf);
                        allHeroes.add(thirdElf);
                    } else if (hero.getId().equals("knight1")) {
                        FirstKnight firstKnight = new FirstKnight(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(firstKnight);
                        allHeroes.add(firstKnight);
                    } else if (hero.getId().equals("knight2")) {
                        SecondKnight secondKnight = new SecondKnight(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(secondKnight);
                        allHeroes.add(secondKnight);
                    } else if (hero.getId().equals("knight3")) {
                        ThirdKnight thirdKnight = new ThirdKnight(e.getSceneX() - 100, e.getSceneY() - 50);
                        anchor.getChildren().add(thirdKnight);
                        allHeroes.add(thirdKnight);
                    } else if (hero.getId().equals("warrior1")) {
                        FirstWarrior firstWarrior = new FirstWarrior(e.getSceneX() - 100, e.getSceneY() - 50);
                        firstWarrior.setFitWidth(110);
                        firstWarrior.setFitHeight(70);
                        anchor.getChildren().add(firstWarrior);
                        allHeroes.add(firstWarrior);
                    } else if (hero.getId().equals("warrior2")) {
                        SecondWarrior secondWarrior = new SecondWarrior(e.getSceneX() - 100, e.getSceneY() - 50);
                        secondWarrior.setFitWidth(110);
                        secondWarrior.setFitHeight(70);
                        anchor.getChildren().add(secondWarrior);
                        allHeroes.add(secondWarrior);
                    }
                }

            });
        }
    }//end make drag
}
