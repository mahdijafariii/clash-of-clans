package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;
import com.example.MapPackage.TwoPlayerMap;
import com.example.UserPackage.Administrator;
import com.example.ViewPackage.SkyBridgeMapController;
import com.example.ViewPackage.TwoPlayerMapController;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Map;

public class SkyBridgeTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/SkyBridgeTower1.png").toString();

    int multiplier = 2;
    boolean hasAttacked;

    public SkyBridgeTower(ImageView imageView)
    {
        super.setMultiplier(3);
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        super.isDestroyed = false;
        hasAttacked = false;
        super.health = 400;
        super.damage = 10;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , SkyBridgeMapController skyBridgeMapController)
    {
        if (!heroes.isEmpty())
        {
            for (Heroes hero : heroes)
            {
                double distance = Math.sqrt(Math.pow((hero.getTranslateX() - this.getX()) , 2) + Math.pow((hero.getTranslateY() - this.getY()) , 2));
                if (distance <= 250)
                {
                    attack(hero , skyBridgeMapController);
                }
            }
        }
    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(Heroes hero , SkyBridgeMapController skyBridgeMapController)
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
        if (Administrator.getCurrentMap() instanceof TwoPlayerMap)
        {
            /*
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : twoPlayerMapController.getImages())
                    {
                        if (imageView.getTranslateX() == this.getX() && imageView.getTranslateY() == this.getY())
                        {
                            Image image = new Image(img_3);
                            imageView.setImage(image);
                        }
                    }
                }
                else
                {
                    for (ImageView imageView : twoPlayerMapController.getImages())
                    {
                        if (imageView.getTranslateX() == this.getX() && imageView.getTranslateY() == this.getY())
                        {
                            Image image = new Image(img_2);
                            imageView.setImage(image);
                        }
                    }
                }
            }

             */
        }
        else
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : Administrator.getSkyBridgeMapController().getImages())
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
                    for (ImageView imageView : Administrator.getSkyBridgeMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutX() == this.getY())
                        {
                            Image image = new Image(img_2);
                            imageView.setImage(image);
                        }
                    }
                }
            }
            Administrator.getSkyBridgeMapController().setStarsAndProgression();
        }
    }

    //-----------------RUN METHOD--------------------
    public void startThread()
    {
        new Thread(()->{
            while (true)
            {
                checkForEnemies(Administrator.getCurrentMap().getHeroes(), Administrator.getSkyBridgeMapController());
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