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

    boolean hasAttacked;
    public JungleTower(ImageView imageView)
    {
        super.setMultiplier(3);
        super.isDestroyed = false;
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        hasAttacked = false;
        super.health = 400;
        super.damage = 10;
    }

    //-----------------CHECK FOR ENEMIES FUNCTION--------------------

    public void checkForEnemies(ArrayList<Heroes> heroes , JungleMapController jungleMapController , DarkJungleMapController darkJungleMapController , Map map)
    {
        if (!heroes.isEmpty())
        {
            for (Heroes hero : heroes)
            {
                double distance = Math.sqrt(Math.pow((hero.getTranslateX() - this.getX()) , 2) + Math.pow((hero.getTranslateY() - this.getY()) , 2));
                if (distance <= 250)
                {
                    attack(this , hero , jungleMapController , darkJungleMapController , map);
                }
            }
        }
    }

    //-----------------ATTACK FUNCTION--------------------

    public void attack(JungleTower jungleTower , Heroes hero , JungleMapController jungleMapController , DarkJungleMapController darkJungleMapController , Map map)
    {
        if (map instanceof JungleMap)
        {
            if (!hero.getImage().getUrl().equals(this.getClass().getResource("/com/example/game/Images/Die-1.png").toString()))
            {
                /*
                Heroes finalHero = hero;
                Platform.runLater(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        System.out.println("Attack!");
                        System.out.println(finalHero.getHealth());
                        ImageView imageView = new ImageView(new Image(this.getClass().getResource("/com/example/game/Images/fireball.png").toString()));
                        imageView.setTranslateX(jungleTower.getX());
                        imageView.setTranslateY(jungleTower.getY());
                        jungleMapController.getAnchor().getChildren();
                        jungleMapController.getAnchor().getChildren().add(imageView);
                        TranslateTransition transition = new TranslateTransition();
                        transition.setNode(imageView);
                        transition.setByX(Math.abs(finalHero.getTranslateX() - jungleTower.getX()));
                        transition.setByY(Math.abs(finalHero.getTranslateY() - jungleTower.getY()));
                        transition.setDuration(new Duration(1000));
                        transition.play();
                        System.out.println("Play shod!");
                        //jungleMapController.getAnchor().getChildren().remove(imageView);
                    }
                });

                 */
                hero.setHealth(hero.getHealth() - damage);
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
            else
            {
                System.out.println("Hero Is Fuckin Dead");
            }
        }
        else
        {
            /*
            ImageView imageView = new ImageView(img_fire);
            darkJungleMapController.getAnchor().getChildren().add(imageView);
            TranslateTransition transition = new TranslateTransition();
            transition.setNode(imageView);
            transition.setFromX(this.getX());
            transition.setFromY(this.getY());
            transition.setToX(hero.getTranslateX());
            transition.setToY(hero.getTranslateY());
            transition.setDuration(new Duration(2000));
            transition.play();
            darkJungleMapController.getAnchor().getChildren().remove(imageView);

             */

            hero.setHealth(hero.getHealth() - damage);
            if(hero.getHealth() <= 0)
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
        if (Administrator.getCurrentMap() instanceof JungleMap)
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : Administrator.getJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                        {
                            Image image = new Image(img_3);
                            imageView.setImage(image);
                            imageView.setLayoutY(this.getY() + 35);
                            super.isDestroyed = true;
                            break;
                        }
                    }
                }
                else
                {
                    for (ImageView imageView : Administrator.getJungleMapController().getImages())
                    {
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                        {
                            Image image = new Image(img_2);
                            imageView.setImage(image);
                            break;
                        }
                    }
                }
            }
            Administrator.getJungleMapController().setStarsAndProgression();
        }
        else
        {
            if (this.getHealth() <= 200)
            {
                if (this.getHealth() == 0)
                {
                    for (ImageView imageView : Administrator.getDarkJungleMapController().getImages())
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
                    for (ImageView imageView : Administrator.getDarkJungleMapController().getImages())
                    {
                        if (imageView.getTranslateX() == this.getX() && imageView.getTranslateY() == this.getY())
                        {
                            Image image = new Image(img_2);
                            imageView.setImage(image);
                        }
                    }
                }
            }
            Administrator.getDarkJungleMapController().setStarsAndProgression();
        }
    }

    //-----------------RUN METHOD--------------------
   public void startThread()
   {

       new Thread(()->{
           while (true)
           {
               checkForEnemies(Administrator.getCurrentMap().getHeroes(), Administrator.getJungleMapController() , Administrator.getDarkJungleMapController() , Administrator.getCurrentMap());
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