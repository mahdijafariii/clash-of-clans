package com.example.BuildingPackage.Doors;

import com.example.BuildingPackage.Building;
import com.example.MapPackage.TwoPlayerMap;
import com.example.UserPackage.Administrator;
import com.example.ViewPackage.SkyBridgeMapController;
import com.example.ViewPackage.TwoPlayerMapController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Map;

public class SkyBridgeDoor extends Building
{
    String img_1 = this.getClass().getResource("/com/example/game/Images/SkyBridgeDoor1.png").toString();
    String img_2 = this.getClass().getResource("/com/example/game/Images/SkyBridgeDoor2.png").toString();
    String img_3 = this.getClass().getResource("/com/example/game/Images/SkyBridgeDoor3.png").toString();
    String img_main = this.getClass().getResource("/com/example/game/Images/SkyBridgeDoor1.png").toString();

    int multiplier = 1;
    double x , y;

    public SkyBridgeDoor(ImageView imageView)
    {
        super.setX(imageView.getLayoutX());
        super.setY(imageView.getLayoutY());
        super.setMultiplier(1);
        super.isDestroyed = false;
        super.health = 600;
        super.damage = 0;
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
                        if (imageView.getLayoutX() == this.getX() && imageView.getLayoutY() == this.getY())
                        {
                            Image image = new Image(img_2);
                            imageView.setImage(image);
                        }
                    }
                }
            }
        }
    }

}