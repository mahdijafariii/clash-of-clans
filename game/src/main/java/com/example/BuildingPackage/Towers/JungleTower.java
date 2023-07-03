package com.example.BuildingPackage.Towers;

import com.example.BuildingPackage.Building;
import com.example.HeroPackage.Heroes;
import com.example.MapPackage.JungleMap;
import com.example.MapPackage.Map;
import com.example.UserPackage.Administrator;
import com.example.ViewPackage.DarkJungleMapController;
import com.example.ViewPackage.JungleMapController;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.util.ArrayList;

public class JungleTower extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/JungleTower2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/JungleTower3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/JungleTower1.png").toString();
    String img_fire = this.getClass().getResource("/com/example/game/Images/fireball.png").toString();

    int multiplier = 2;
    boolean hasAttacked;
    public JungleTower(ImageView imageView)
    {
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        hasAttacked = false;
        super.health = 400;
        super.damage = 20;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , JungleMapController jungleMapController , DarkJungleMapController darkJungleMapController , Map map)
    {
        for (Heroes hero : heroes)
        {
            System.out.println("salam man toye halqam");
            double distance = Math.pow(Math.pow((hero.getTranslateX() - this.getX()) , 2) + Math.pow((hero.getTranslateY() - this.getY()) , 2) ,  (double) 1 /2);
            System.out.println("------------------------------------------------");

            System.out.println(distance);
            System.out.println("------------------------------------------------");
            if (distance <= 250)
            {
                System.out.println("ye adam nazdik mane");
                attack(hero , jungleMapController , darkJungleMapController , map);
            }
        }

    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(Heroes hero , JungleMapController jungleMapController , DarkJungleMapController darkJungleMapController , Map map)
    {
        if (map instanceof JungleMap)
        {
//            ImageView imageView = new ImageView(img_fire);
//            jungleMapController.getAnchor().getChildren().add(imageView);
//            TranslateTransition transition = new TranslateTransition();
//            transition.setNode(imageView);
//            transition.setFromX(this.getTranslateX());
//            transition.setFromY(this.getTranslateY());
//            transition.setToX(hero.getTranslateX());
//            transition.setToY(hero.getTranslateY());
//            transition.setDuration(new Duration(2000));
//            transition.play();
//            jungleMapController.getAnchor().getChildren().remove(imageView);
            hero.setHealth(hero.getHealth() - 20);
            jungleMapController.checkHeroHealth();
            if(hero.getHealth()<=0){
//                Administrator.getCurrentMap().getHeroes().remove(hero);
            }
            hasAttacked = true;

        }
        else
        {
            ImageView imageView = new ImageView(img_fire);
            darkJungleMapController.getAnchor().getChildren().add(imageView);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(imageView);
            transition.setFromX(this.getTranslateX());
            transition.setFromY(this.getTranslateY());
            transition.setToX(hero.getTranslateX());
            transition.setToY(hero.getTranslateY());
            transition.setDuration(new Duration(2000));
            transition.play();
            darkJungleMapController.getAnchor().getChildren().remove(imageView);
            hero.setHealth(hero.getHealth() - 20);
            hasAttacked = true;
        }
    }

    //-----------------CHECK FOR TOWER HEALTH FUNCTION--------------------

    public void checkForHealth(DarkJungleMapController darkJungleMapController , JungleMapController jungleMapController , Map map)
    {
        if (map instanceof JungleMap)
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : jungleMapController.getImages())
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
                    for (ImageView imageView : jungleMapController.getImages())
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
        else
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : darkJungleMapController.getImages())
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
                    for (ImageView imageView : darkJungleMapController.getImages())
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
    }

    //-----------------RUN METHOD--------------------
   public void startThread(){
        Administrator.getJungleMapController().checkHeroHealth();
       new Thread(()->{
           while (true)
           {
               checkForHealth(Administrator.getDarkJungleMapController() , Administrator.getJungleMapController() , Administrator.getCurrentMap());
               checkForEnemies(Administrator.getCurrentMap().getHeroes(), Administrator.getJungleMapController() , Administrator.getDarkJungleMapController() , Administrator.getCurrentMap());
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

               try {
                   Thread.sleep(8000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }

       }).start();
   }


}