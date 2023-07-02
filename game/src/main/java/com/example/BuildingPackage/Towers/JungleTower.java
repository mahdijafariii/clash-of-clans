package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;
import com.example.MapPackage.JungleMap;
import com.example.MapPackage.Map;
import com.example.ViewPackage.DarkJungleMapController;
import com.example.ViewPackage.JungleMapController;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;

public class JungleTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();

    int multiplier = 2;
    double x , y;

    public JungleTower(ImageView imageView)
    {
        this.x = imageView.getX();
        this.y = imageView.getY();
        super.health = 400;
        super.damage = 20;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , Map map)
    {
        for (Heroes hero : heroes)
        {
            double distance = Math.pow((hero.getTranslateX() - this.getTranslateX()) , 2) + Math.pow((hero.getTranslateY() - this.getTranslateY()) , 2);
            if (distance <= 200)
            {
                attack(hero , map);
            }
        }

    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(Heroes hero , Map map)
    {
        if (map instanceof JungleMap)
        {
            JungleMapController controller = new JungleMapController();
            ImageView imageView = new ImageView("C:\\Users\\OctavioX1\\IdeaProjects\\github-GameProject\\final-project-game-maya\\game\\src\\main\\resources\\com\\example\\game\\Images\\fireball.png");
            controller.getAnchor().getChildren().add(imageView);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(imageView);
            transition.setFromX(this.x);
            transition.setFromY(this.y);
            transition.setToX(hero.getTranslateX());
            transition.setToY(hero.getTranslateY());
            transition.setDuration(new Duration(2000));
            transition.play();
            controller.getAnchor().getChildren().remove(imageView);
            hero.setHealth(hero.getHealth() - 20);
        }
        else
        {
            DarkJungleMapController controller = new DarkJungleMapController();
            ImageView imageView = new ImageView("C:\\Users\\OctavioX1\\IdeaProjects\\github-GameProject\\final-project-game-maya\\game\\src\\main\\resources\\com\\example\\game\\Images\\fireball.png");
            controller.getAnchor().getChildren().add(imageView);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(imageView);
            transition.setFromX(this.x);
            transition.setFromY(this.y);
            transition.setToX(hero.getTranslateX());
            transition.setToY(hero.getTranslateY());
            transition.setDuration(new Duration(2000));
            transition.play();
            controller.getAnchor().getChildren().remove(imageView);
            hero.setHealth(hero.getHealth() - 20);
        }
    }
}