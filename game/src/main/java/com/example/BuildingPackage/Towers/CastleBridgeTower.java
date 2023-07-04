package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;
import com.example.UserPackage.Administrator;
import com.example.ViewPackage.CastleBridgeMapController;
import com.example.ViewPackage.JungleMapController;
import com.example.ViewPackage.SkyBridgeMapController;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class CastleBridgeTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower2/.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();

    boolean hasAttacked;
    public CastleBridgeTower (ImageView imageView)
    {
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        super.setMultiplier(3);
        hasAttacked = false;
        super.isDestroyed = false;
        super.health = 400;
        super.damage = 10;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , CastleBridgeMapController castleBridgeMapController)
    {
        if (!heroes.isEmpty())
        {
            for (Heroes hero : heroes)
            {
                double distance = Math.sqrt(Math.pow((hero.getTranslateX() - this.getX()) , 2) + Math.pow((hero.getTranslateY() - this.getY()) , 2));
                if (distance <= 250)
                {
                    attack(hero , castleBridgeMapController);
                }
            }
        }
    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(Heroes hero , CastleBridgeMapController castleBridgeMapController)
    {
        if (!hero.getImage().getUrl().equals(this.getClass().getResource("/com/example/game/Images/Die-1.png").toString()))
        {
            /*
        ImageView imageView = new ImageView("C:\\Users\\OctavioX1\\IdeaProjects\\github-GameProject\\final-project-game-maya\\game\\src\\main\\resources\\com\\example\\game\\Images\\fireball.png");
        castleBridgeMapController.getAnchor().getChildren().add(imageView);
        TranslateTransition transition = new TranslateTransition();
        transition.setNode(imageView);
        transition.setFromX(this.getTranslateX());
        transition.setFromY(this.getTranslateY());
        transition.setToX(hero.getTranslateX());
        transition.setToY(hero.getTranslateY());
        transition.setDuration(new Duration(2000));
        transition.play();
         */
            hero.setHealth(hero.getHealth() - getDamage());
            if(hero.getHealth()<=0)
            {
                hero.setImage(new Image(this.getClass().getResource("/com/example/game/Images/Die-1.png").toString()));
                hero.setFitHeight(30);
                hero.setFitWidth(30);
                hero.setTranslateX(hero.getTranslateX() + 40);
                hero.setTranslateY(hero.getTranslateY() + 20);
                hero = null;
            }
            hasAttacked = true;
        }
    }

    //-----------------CHECK FOR TOWER HEALTH FUNCTION--------------------


    public void checkForHealth()
    {
        if (this.getHealth() <= 200)
        {
            if (this.getHealth() == 0)
            {
                for (ImageView imageView : Administrator.getCastleBridgeMapController().getImages())
                {
                    if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                    {
                        Image image = new Image(img_3);
                        imageView.setImage(image);
                    }
                }
            }
            else
            {
                for (ImageView imageView : Administrator.getCastleBridgeMapController().getImages())
                {
                    if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                    {
                        Image image = new Image(img_2);
                        imageView.setImage(image);
                    }
                }
            }
        }
        Administrator.getCastleBridgeMapController().setStarsAndProgression();
    }



    //-----------------RUN METHOD--------------------
    public void startThread()
    {
        new Thread(()->{
            while (true)
            {
                checkForEnemies(Administrator.getCurrentMap().getHeroes(), Administrator.getCastleBridgeMapController());
                if (hasAttacked)
                {
                    try
                    {
                        Thread.sleep(8000);
                        System.out.println("Attacked!");
                        hasAttacked = false;
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}