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

public class CastleBridgeTower extends Building implements Runnable
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower2/.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/CastleBridgeTower1.png").toString();

    int multiplier = 2;

    boolean hasAttacked;
    public CastleBridgeTower (ImageView imageView)
    {
        hasAttacked = false;
        super.health = 400;
        super.damage = 20;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , CastleBridgeMapController castleBridgeMapController)
    {
        for (Heroes hero : heroes)
        {
            double distance = Math.pow((hero.getTranslateX() - this.getTranslateX()) , 2) + Math.pow((hero.getTranslateY() - this.getTranslateY()) , 2);
            if (distance <= 200)
            {
                attack(hero , castleBridgeMapController);
            }
        }
    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(Heroes hero , CastleBridgeMapController castleBridgeMapController)
    {
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
        castleBridgeMapController.getAnchor().getChildren().remove(imageView);
        hero.setHealth(hero.getHealth() - getDamage());
        hasAttacked = true;
    }

    //-----------------CHECK FOR TOWER HEALTH FUNCTION--------------------

    public void checkForHealth(CastleBridgeMapController castleBridgeMapController)
    {
        if (this.getHealth() <= 200)
        {
            if (this.getHealth() == 0)
            {
                for (ImageView imageView : castleBridgeMapController.getImages())
                {
                    if (imageView.getTranslateX() == this.getTranslateX() && imageView.getTranslateY() == this.getTranslateY())
                    {
                        Image image = new Image(img_3);
                        imageView.setImage(image);
                    }
                }
            }
            else
            {
                for (ImageView imageView : castleBridgeMapController.getImages())
                {
                    if (imageView.getTranslateX() == this.getTranslateX() && imageView.getTranslateY() == this.getTranslateY())
                    {
                        Image image = new Image(img_2);
                        imageView.setImage(image);
                    }
                }
            }
        }
    }

    //-----------------RUN METHOD--------------------
    @Override
    public void run()
    {
        while (true)
        {
            checkForHealth(Administrator.getCastleBridgeMapController());
            checkForEnemies(Administrator.getCurrentMap().getHeroes(), Administrator.getCastleBridgeMapController());
            if (hasAttacked)
            {
                try
                {
                    Thread.sleep(2000);
                    hasAttacked = false;
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}